package main;

import entities.Passport;
import entities.Product;
import entities.ProductDetail;
import entities.User;

import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {
        var emf = Persistence.createEntityManagerFactory("my-persistence-unit");
        var em = emf.createEntityManager();

        em.getTransaction().begin();

//        Company c = new Company();
//        c.setName("ABC");
//        c.setNumber("181");
//        c.setStreet("Adam Street");
//        c.setDetail("MNC");
//        em.persist(c);



//        Product p = new Product();
//        p.setName("Chocolate");
//
//        ProductDetail detail = new ProductDetail();
//        detail.setKcal("20Kcal");
//        detail.setProduct(p);
//
//        em.persist(detail);


        User user = new User();
        user.setName("Ankita");

        Passport passport = new Passport();
        passport.setPassportNumber("J7290482");

        user.setPassport(passport);
        passport.setUser(user);

//        em.persist(passport);

        em.persist(user);

        em.getTransaction().commit();
        em.close();
    }
}

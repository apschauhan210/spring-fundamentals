package entities;

import javax.persistence.*;

@Entity
@Table(name = "product_details")
public class ProductDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String kcal;

    @JoinColumn(name = "product_id")  // This specifies by which name the foreign key(here product is referred in the table. By default, the id is chosen as the foreign key
    @OneToOne(cascade = CascadeType.PERSIST) // PERSIST specifies that whenever the object of details is put in the persistence context then the object of product of that detail is also put in the context
    private Product product;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKcal() {
        return kcal;
    }

    public void setKcal(String kcal) {
        this.kcal = kcal;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}

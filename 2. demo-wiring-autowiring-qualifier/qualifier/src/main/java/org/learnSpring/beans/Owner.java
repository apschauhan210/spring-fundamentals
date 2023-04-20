package org.learnSpring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Owner {

    @Autowired
    @Qualifier("catTom")    // Qualifier specifies the identity of the bean in case of multiple bean of same type
    private Cat cat;

//    @Autowired
//    @Qualifier("catTom")
//    public Owner(Cat cat) {
//        this.cat = cat;
//    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "cat=" + cat +
                '}';
    }
}

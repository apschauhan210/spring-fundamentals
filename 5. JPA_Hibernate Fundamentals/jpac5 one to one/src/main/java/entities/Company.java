package entities;

import javax.persistence.*;

/**
 * Not a relationship in terms of JPA.
 * But in the DB the details are split into multiple tables.
 *
 * When the object of Company is created and persisted in the table then three insert queries are executed to insert
 * the data in the respective tables.
 */


@Entity
@SecondaryTable(name = "address")
@SecondaryTable(name = "details")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    @Column(table = "details")
    private String detail;

    @Column(table = "address")
    private String street;

    @Column(table = "address")
    private String number;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

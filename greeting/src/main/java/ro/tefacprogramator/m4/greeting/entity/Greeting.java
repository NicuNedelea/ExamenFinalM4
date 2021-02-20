package ro.tefacprogramator.m4.greeting.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Greeting {
    @Id
    @Column(name = "GreetingID")
    private int greetingId;

    @Column(name = "Description")
    private String description;

    @Column(name = "Price")
    private float price;

    @Column(name = "TypeID")
    private int typeID;

    @Column(name = "CategoryID")
    private int categoryID;

    public int getGreetingId() {
        return greetingId;
    }

    public void setGreetingId(int greetingId) {
        this.greetingId = greetingId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getTypeID() {
        return typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    
}

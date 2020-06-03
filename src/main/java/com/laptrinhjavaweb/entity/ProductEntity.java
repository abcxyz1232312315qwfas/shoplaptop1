package com.laptrinhjavaweb.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "product")
public class ProductEntity extends BaseEntity {
    @Column(name = "name")
    private String name;

    @Column(name = "picture")
    private String picture;

    @Column(name = "price")
    private String price;

    @Column(name = "amount")
    private String amount;

    @Column(name = "weight")
    private Double weight;

    @Column(name = "color")
    private String color;

    @Column(name = "os")
    private String os;

    @Column(name = "shortdescription", columnDefinition = "TEXT")
    private String shortDescription;

    //lien ket category
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private CategoryEntity category;

    // lien ket cart entity
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "product_cart",
            joinColumns = @JoinColumn(name = "productid"),
            inverseJoinColumns = @JoinColumn(name = "cartid")
    )
    private List<CartEntity> carts = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public List<CartEntity> getCarts() {
        return carts;
    }

    public void setCarts(List<CartEntity> carts) {
        this.carts = carts;
    }
}

package com.laptrinhjavaweb.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cart")
public class CartEntity extends BaseEntity  {
    @Column(name = "quantity")
    private Integer quantity;

    //lien ket product
    @ManyToMany(mappedBy = "carts")
    private List<ProductEntity> products= new ArrayList<>();

    //lien ket user
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserEntity userEntity;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public List<ProductEntity> getProducts() {
        return products;
    }

    public void setProducts(List<ProductEntity> products) {
        this.products = products;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }
}

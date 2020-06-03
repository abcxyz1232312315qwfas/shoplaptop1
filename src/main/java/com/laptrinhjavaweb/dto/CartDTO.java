package com.laptrinhjavaweb.dto;

import com.laptrinhjavaweb.entity.ProductEntity;

import java.util.List;

public class CartDTO extends AbstractDTO<CartDTO> {
    private Integer quantity;
    private List<ProductDTO> productDTOS;

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public List<ProductDTO> getProductDTOS() {
        return productDTOS;
    }

    public void setProductDTOS(List<ProductDTO> productDTOS) {
        this.productDTOS = productDTOS;
    }
}

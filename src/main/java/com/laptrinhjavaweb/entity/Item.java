package com.laptrinhjavaweb.entity;

import com.laptrinhjavaweb.dto.ProductDTO;

public class Item {
    private ProductDTO productDTO = new ProductDTO();
    private int quantity;

    public Item(ProductDTO productDTO, int quantity) {
        this.productDTO = productDTO;
        this.quantity = quantity;

    }

    public ProductDTO getProductDTO() {
        return productDTO;
    }

    public void setProductDTO(ProductDTO productDTO) {
        this.productDTO = productDTO;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

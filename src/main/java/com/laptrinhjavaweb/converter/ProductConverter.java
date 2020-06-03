package com.laptrinhjavaweb.converter;

import com.laptrinhjavaweb.dto.ProductDTO;
import com.laptrinhjavaweb.entity.ProductEntity;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter {
    public ProductDTO toDto(ProductEntity entity) {
        ProductDTO result = new ProductDTO();
        result.setId(entity.getId());
        result.setName(entity.getName());
        result.setPicture(entity.getPicture());
        result.setShortDescription(entity.getShortDescription());
        result.setPrice(entity.getPrice());
        result.setAmount(entity.getAmount());
        result.setWeight(entity.getWeight());
        result.setColor(entity.getColor());
        result.setOs(entity.getOs());
        result.setCategoryCode(entity.getCategory().getCode());

        return result;
    }

    public ProductEntity toEntity(ProductDTO dto) {
        ProductEntity result = new ProductEntity();
        result.setName(dto.getName());
        result.setPicture(dto.getPicture());
        result.setShortDescription(dto.getShortDescription());
        result.setPrice(dto.getPrice());
        result.setAmount(dto.getAmount());
        result.setWeight(dto.getWeight());
        result.setColor(dto.getColor());
        result.setOs(dto.getOs());
        return result;
    }

    public ProductEntity toEntity(ProductEntity result, ProductDTO dto) {
        result.setName(dto.getName());
        result.setPicture(dto.getPicture());
        result.setShortDescription(dto.getShortDescription());
        result.setPrice(dto.getPrice());
        result.setAmount(dto.getAmount());
        result.setWeight(dto.getWeight());
        result.setColor(dto.getColor());
        result.setOs(dto.getOs());
        return result;
    }
}

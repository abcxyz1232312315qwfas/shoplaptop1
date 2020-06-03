package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.converter.NewConverter;
import com.laptrinhjavaweb.converter.ProductConverter;
import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.dto.ProductDTO;
import com.laptrinhjavaweb.entity.ProductEntity;
import com.laptrinhjavaweb.repository.ProductRepository;
import com.laptrinhjavaweb.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService implements IProductService {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductConverter newConverter;
    @Override
    public List<ProductDTO> findAll(Pageable pageable) {
        List<ProductDTO> models = new ArrayList<>();
        List<ProductEntity> entities = productRepository.findAll(pageable).getContent();
        for (ProductEntity item: entities) {
            ProductDTO newDTO = newConverter.toDto(item);
            models.add(newDTO);
        }
        return models;
    }

    @Override
    public List<ProductDTO> findAll() {
        List<ProductDTO> models = new ArrayList<>();
        List<ProductEntity> entities = productRepository.findAll();
        for (ProductEntity item: entities) {
            ProductDTO newDTO = newConverter.toDto(item);
            models.add(newDTO);
        }
        return models;
    }

    @Override
    public int getTotalItem() {
        return (int) productRepository.count();
    }

    @Override
    public List<ProductDTO> findTop2ByWeightLessThanOrderByWeightDesc() {
        List<ProductDTO> models = new ArrayList<>();
        List<ProductEntity> entities = productRepository.findTop2ByWeightLessThanOrderByWeightDesc();
        for (ProductEntity item: entities) {
            ProductDTO newDTO = newConverter.toDto(item);
            models.add(newDTO);
        }
        return models;
    }

    @Override
    public List<ProductDTO> findLast2ByWeightLessThanOrderByWeightDesc() {
        List<ProductDTO> models = new ArrayList<>();
        List<ProductEntity> entities = productRepository.findLast2ByWeightLessThanOrderByWeightDesc();
        for (ProductEntity item: entities) {
            ProductDTO newDTO = newConverter.toDto(item);
            models.add(newDTO);
        }
        return models;
    }

    @Override
    public ProductDTO findOne(long id) {
        ProductEntity productEntity= productRepository.findOne(id);
        ProductDTO productDTO = newConverter.toDto(productEntity);
        return productDTO;
    }
}

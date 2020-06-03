package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.dto.NewDTO;
import com.laptrinhjavaweb.dto.ProductDTO;
import com.laptrinhjavaweb.entity.ProductEntity;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {
    List<ProductDTO> findAll(Pageable pageable);
    List<ProductDTO> findAll();
    int getTotalItem();
    List<ProductDTO> findTop2ByWeightLessThanOrderByWeightDesc();
    List<ProductDTO> findLast2ByWeightLessThanOrderByWeightDesc();
    ProductDTO findOne(long id);
}

package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.dto.ProductDTO;
import com.laptrinhjavaweb.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductEntity,Long> {
    @Query(value="SELECT * FROM product ORDER BY weight DESC Limit 0, 2", nativeQuery=true)
    List<ProductEntity> findTop2ByWeightLessThanOrderByWeightDesc();

    @Query(value="SELECT * FROM product ORDER BY weight DESC Limit 2, 2", nativeQuery=true)
    List<ProductEntity> findLast2ByWeightLessThanOrderByWeightDesc();
}

package com.laptrinhjavaweb.service;

import com.laptrinhjavaweb.entity.CartEntity;
import java.util.List;

public interface ICartService {
    List<CartEntity> findAllByUserId(long id);
//    List<Long> findIdProductByIdCart(long[] ids);
//    List<ProductDTO> findAllById(long[] ids);
//    List<Integer> findListQuantity(long idUser);
}

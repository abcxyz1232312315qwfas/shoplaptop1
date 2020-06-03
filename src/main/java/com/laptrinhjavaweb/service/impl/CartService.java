package com.laptrinhjavaweb.service.impl;

import com.laptrinhjavaweb.converter.ProductConverter;
import com.laptrinhjavaweb.entity.CartEntity;
import com.laptrinhjavaweb.repository.CartRepository;
import com.laptrinhjavaweb.repository.ProductRepository;
import com.laptrinhjavaweb.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CartService implements ICartService {
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private ProductConverter newConverter;

    @Override
    public List<CartEntity> findAllByUserId(long id) {
//        Specification conSpecification = Specification.w
        List<CartEntity> cartEntities = cartRepository.findByUserEntityId(id);
        return cartEntities;
    }
//    @Override
//    public List<Long> findIdCartByUserId(long id) {
//        List<Long> result = cartRepository.findIdCartByUserId(id);
//        return result;
//    }
//
//    @Override
//    public List<Long> findIdProductByIdCart(long[] ids) {
//        List<Long> result = new ArrayList<>();
//        for (long id:ids) {
//            long temp= cartRepository.findIdProductByIdCart(id);
//            result.add(temp);
//        }
//        return result;
//    }
//    @Override
//    public List<ProductDTO> findAllById(long[] ids){
//        List<ProductEntity> productEntities= new ArrayList<>();
//        List<ProductDTO> productDTOS= new ArrayList<>();
//        for (long id: ids) {
//            ProductEntity productEntity= productRepository.findOne(id);
//            productEntities.add(productEntity);
//        }
//        for (ProductEntity productEntity:productEntities) {
//            ProductDTO productDTO = newConverter.toDto(productEntity);
//            productDTOS.add(productDTO);
//        }
//        return productDTOS;
//    }
//
//    @Override
//    public List<Integer> findListQuantity(long idUser) {
//        List<Integer> list = new ArrayList<>();
//
//        return list;
//    }

}

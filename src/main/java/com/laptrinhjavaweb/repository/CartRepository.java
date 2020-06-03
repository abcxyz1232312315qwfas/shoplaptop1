package com.laptrinhjavaweb.repository;

import com.laptrinhjavaweb.entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import javax.persistence.Id;
import java.util.List;

public interface CartRepository extends JpaRepository<CartEntity, Long> {

//    @Query(value="SELECT c FROM cart c where c.user_id= ?1", nativeQuery=true)
    List<CartEntity> findByUserEntityId(Long userId);


}

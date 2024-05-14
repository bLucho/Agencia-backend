package com.example.agencia.domain.repositories;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.agencia.domain.entities.FlyEntity;

@Repository
public interface FlyRepository extends JpaRepository<FlyEntity,Long>{

    @Query("select f from fly f where f.price < :price")
    List<FlyEntity>selectLeesPrice(BigDecimal price); 

    @Query("select f from fly f where f.price between :minPrice and :maxPrice")
    List<FlyEntity>selectBetweenPrice(BigDecimal minPrice, BigDecimal maxPrice); 
}

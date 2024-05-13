package com.example.agencia.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.agencia.domain.entities.HotelEntity;

@Repository
public interface HotelRepository extends JpaRepository<HotelEntity, Long> {
    
}

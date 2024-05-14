package com.example.agencia.domain.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.agencia.domain.entities.TourEntity;

@Repository
public interface TourRepository extends CrudRepository<TourEntity, Long> {

}

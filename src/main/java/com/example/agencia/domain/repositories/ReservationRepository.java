package com.example.agencia.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.agencia.domain.entities.ReservationEntity;

@Repository
public interface ReservationRepository extends JpaRepository<ReservationEntity,Long > {

}

package com.example.agencia.domain.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.agencia.domain.entities.FlyEntity;

@Repository
public interface FlyRepository extends JpaRepository<FlyEntity,Long>{

}

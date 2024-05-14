package com.example.agencia.domain.entities;

import java.math.BigDecimal;
import java.util.List;

import com.example.agencia.utils.Aeroline;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity(name = "fly")
public class FlyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double origin_lat;
    private Double origin_lng;
    private Double destiny_lat;
    private Double destiny_lng;
    private BigDecimal price;

    @Enumerated(EnumType.STRING)
    private Aeroline aeroline;
    @Column(length = 20)
    private String originName;
    @Column(length = 20)
    private String destinyName;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "fly")
    private List<TicketEntity> tickets;

}
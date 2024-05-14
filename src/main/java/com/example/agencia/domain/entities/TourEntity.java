package com.example.agencia.domain.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity(name = "tour")
public class TourEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "tour")
    private List<ReservationEntity> reservations;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true, mappedBy = "tour")
    private List<TicketEntity> tikets;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private CustomerEntity customer;

    public void addTicket(TicketEntity ticket){
        this.tikets.add(ticket);
    }

    public void removeTicket(Long id){
        this.tikets.removeIf(ticket -> ticket.getId().equals(id));
    }


    public void updateTicket(){
        this.tikets.forEach(ticket -> ticket.setTour(this));
    }

    public void addReservation(ReservationEntity reservation){
        this.reservations.add(reservation);
    }

    
    public void removeReservation(Long id){
        this.tikets.removeIf(reservation -> reservation.getId().equals(id));
    }


    public void updateReservation(){
        this.tikets.forEach(reservation -> reservation.setTour(this));
    }
}

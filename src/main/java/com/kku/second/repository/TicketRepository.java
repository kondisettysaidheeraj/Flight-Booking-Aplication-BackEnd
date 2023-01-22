package com.kku.second.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kku.second.model.Ticket;

public interface TicketRepository extends JpaRepository<Ticket,Integer> {

}

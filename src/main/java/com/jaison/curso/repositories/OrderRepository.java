package com.jaison.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jaison.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}

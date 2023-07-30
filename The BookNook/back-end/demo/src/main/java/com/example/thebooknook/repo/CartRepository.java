package com.example.thebooknook.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.thebooknook.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
    // You can define custom queries here if needed
}

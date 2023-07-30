package com.example.thebooknook.service;

import org.springframework.stereotype.Service;

import com.example.thebooknook.model.CartItem;
import com.example.thebooknook.repo.CartItemRepository;

import java.util.List;

@Service
public class CartItemService {
    private final CartItemRepository cartItemRepository;

    public CartItemService(CartItemRepository cartItemRepository) {
        this.cartItemRepository = cartItemRepository;
    }

    public List<CartItem> getAllCartItems() {
        return cartItemRepository.findAll();
    }

    public CartItem getCartItemById(Long id) {
        return cartItemRepository.findById(id).orElse(null);
    }

    // Add more methods as needed for specific business logic related to CartItem
}


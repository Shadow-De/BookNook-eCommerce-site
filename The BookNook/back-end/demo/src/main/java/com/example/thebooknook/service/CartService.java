package com.example.thebooknook.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.thebooknook.model.Cart;
import com.example.thebooknook.model.CartItem;
import com.example.thebooknook.repo.CartRepository;

@Service
public class CartService {
    private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    // Save a new cart
    public Cart saveCart(Cart cart) {
        return cartRepository.save(cart);
    }

    // Get a cart by its ID
    public Cart getCartById(Long cartId) {
        return cartRepository.findById(cartId).orElse(null);
    }

    // Update cart items
    public Cart updateCartItems(Long cartId, List<CartItem> cartItems) {
        Cart cart = cartRepository.findById(cartId).orElse(null);
        if (cart != null) {
            cart.setCartItems(cartItems);
            return cartRepository.save(cart);
        }
        return null;
    }

    // Remove an item from the cart
    public Cart removeCartItem(Long cartId, Long cartItemId) {
        Cart cart = cartRepository.findById(cartId).orElse(null);
        if (cart != null) {
            List<CartItem> cartItems = cart.getCartItems();
            cartItems.removeIf(item -> item.getId().equals(cartItemId));
            cart.setCartItems(cartItems);
            return cartRepository.save(cart);
        }
        return null;
    }

    // Clear the cart (remove all items)
    public Cart clearCart(Long cartId) {
        Cart cart = cartRepository.findById(cartId).orElse(null);
        if (cart != null) {
            cart.setCartItems(new ArrayList<>());
            return cartRepository.save(cart);
        }
        return null;
    }

    // Other methods for manipulating the cart data...
}

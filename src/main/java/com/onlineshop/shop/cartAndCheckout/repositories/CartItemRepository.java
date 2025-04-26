package com.onlineshop.shop.cartAndCheckout.repositories;

import com.onlineshop.shop.cartAndCheckout.models.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    void deleteAllByCartId(Long cartId);
}

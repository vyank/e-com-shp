package com.onlineshop.shop.user.dtos;

import lombok.Data;

@Data
public class UserUpdateRequest {
    private String firstName;
    private String lastName;
}

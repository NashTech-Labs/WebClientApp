package com.knoldus.webclientapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class RegisterResponse {
    private String name;
    private String job;
    private int id;
    private String createdAt;
}

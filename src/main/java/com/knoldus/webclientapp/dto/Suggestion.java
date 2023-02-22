package com.knoldus.webclientapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Suggestion {
    private String activity;
    private String type;
    private int participants;
}

package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategorySimpleDTO {
    private Long id;
    private String name;
    private String description;
    private String imageUrl;
}
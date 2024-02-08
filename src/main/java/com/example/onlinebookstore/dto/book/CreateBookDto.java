package com.example.onlinebookstore.dto.book;

import com.example.onlinebookstore.model.Category;
import java.math.BigDecimal;
import java.util.Set;
import lombok.Data;

@Data
public class CreateBookDto {
    private String title;
    private String author;
    private BigDecimal price;
    private String description;
    private String coverImage;
    private Set<Category> categoryIds;
}

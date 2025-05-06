package com.devgabrielc.mywallet.entities;

import com.devgabrielc.mywallet.enums.Color;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Builder
@Table(name = "tb_category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    private String categoryName;
    private Color categoryColor;

    @OneToMany(mappedBy = "category")
    private List<Transaction> transactions;
}

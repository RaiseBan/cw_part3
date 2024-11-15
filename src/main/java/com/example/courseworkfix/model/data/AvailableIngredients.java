package com.example.courseworkfix.model.data;

import com.example.courseworkfix.model.authEntity.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class AvailableIngredients {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long availableIngredientId;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "ingredient_id", nullable = false)
    private Ingredient ingredient;

    @Column(nullable = false)
    private Boolean available = false;
}

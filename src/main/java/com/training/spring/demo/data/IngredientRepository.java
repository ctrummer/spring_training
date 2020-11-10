package com.training.spring.demo.data;

import com.training.spring.demo.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository
        extends CrudRepository<Ingredient, String> {

}

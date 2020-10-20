package com.training.spring.demo.data;

import com.training.spring.demo.Ingredient;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface IngredientRepository extends CrudRepository<Ingredient, String>  {

  // Iterable<Ingredient> findAll();

  // Ingredient findById(String id);

  Ingredient save(Ingredient ingredient);

}

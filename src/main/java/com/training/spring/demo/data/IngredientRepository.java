package com.training.spring.demo.data;

import org.springframework.data.repository.CrudRepository;

import com.training.spring.demo.Ingredient;

public interface IngredientRepository extends CrudRepository<Ingredient, String>  {

  // just for info  
  // Iterable<Ingredient> findAll();
  // Ingredient findById(String id);
  // Ingredient save(Ingredient ingredient);

}

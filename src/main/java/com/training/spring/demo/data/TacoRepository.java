package com.training.spring.demo.data;

import org.springframework.data.repository.CrudRepository;

import com.training.spring.demo.Taco;

public interface TacoRepository extends CrudRepository<Taco, Long> {
/*
  Taco save(Taco design);
  */
}

package com.training.spring.demo.data;

// import tacos.Taco;
import com.training.spring.demo.Taco;

public interface TacoRepository  {

  Taco save(Taco design);
  
}

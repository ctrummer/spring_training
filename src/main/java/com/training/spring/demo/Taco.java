package com.training.spring.demo;
import java.util.Date;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
// @NoArgsConstructor(access = AccessLevel.PRIVATE, force = true)
@Entity
// @RequiredArgsConstructor
public class Taco {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  
  private Date createdAt;

  @NotNull
  @Size(min=5, message="Name must be at least 5 characters long")
  private String name;
  
  @Size(min=1, message="You must choose at least 1 ingredient")
  @ManyToMany
  private List<Ingredient> ingredients;

  @PrePersist
  void creadetAt() {
    this.createdAt = new Date();
  }

}

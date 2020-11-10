package com.training.spring.demo.data;

import com.training.spring.demo.Taco;
import org.springframework.data.repository.CrudRepository;

public interface TacoRepository
        extends CrudRepository<Taco, Long> {

}

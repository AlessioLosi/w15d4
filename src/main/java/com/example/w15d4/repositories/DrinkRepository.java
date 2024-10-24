package com.example.w15d4.repositories;

import com.example.w15d4.Entities.Drink;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DrinkRepository extends JpaRepository<Drink, Long> {
}

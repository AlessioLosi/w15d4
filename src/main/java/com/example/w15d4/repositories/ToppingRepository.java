package com.example.w15d4.repositories;

import com.example.w15d4.Entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToppingRepository extends JpaRepository<Topping, Long> {
}

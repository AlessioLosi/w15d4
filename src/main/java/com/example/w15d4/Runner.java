package com.example.w15d4;

import com.example.w15d4.Entities.Drink;
import com.example.w15d4.Entities.Pizza;
import com.example.w15d4.Entities.Topping;
import com.example.w15d4.repositories.DrinkRepository;
import com.example.w15d4.repositories.PizzaRepository;
import com.example.w15d4.repositories.ToppingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private PizzaRepository PizzaRepository;

    @Autowired
    private DrinkRepository DrinkRepository;

    @Autowired
    private ToppingRepository ToppingRepository;

    @Override
    public void run(String... args) throws Exception {
        Topping topping1 = new Topping("Tomato", 0, 0);
        Topping topping2 = new Topping("Cheese", 92, 0.69);
        Topping topping3 = new Topping("Ham", 35, 0.99);
        Topping topping4 = new Topping("Pineapple", 24, 0.79);
        Topping topping5 = new Topping("Salami", 86, 0.99);
        ToppingRepository.save(topping1);
        ToppingRepository.save(topping2);
        ToppingRepository.save(topping3);
        ToppingRepository.save(topping4);
        ToppingRepository.save(topping5);
        List<Topping> tList = new ArrayList<>();
        tList.add(topping2);
        tList.add(topping1);
        Pizza pizzaMargherita = new Pizza("Pizza Margherita", tList, false);
        List<Topping> tList1 = new ArrayList<>();
        tList1.add(topping1);
        tList1.add(topping2);
        tList1.add(topping3);
        tList1.add(topping4);
        Pizza pizzaHawaiiana = new Pizza("Hawaiian Pizza", tList1, false);
        List<Topping> tList2 = new ArrayList<>();
        tList2.add(topping1);
        tList2.add(topping2);
        tList2.add(topping5);
        Pizza pizzaSalami = new Pizza("Salami Pizza", tList, false);
        PizzaRepository.save(pizzaMargherita);
        PizzaRepository.save(pizzaHawaiiana);
        PizzaRepository.save(pizzaSalami);


        Drink Lemonade = new Drink("Lemonade", 128, 1.29);
        Drink Water = new Drink("Water", 0, 1.29);
        Drink Wine = new Drink("Wine", 0, 1.29);

        DrinkRepository.save(Lemonade);
        DrinkRepository.save(Water);
        DrinkRepository.save(Wine);


    }
}

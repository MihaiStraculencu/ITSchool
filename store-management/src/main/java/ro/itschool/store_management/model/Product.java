package ro.itschool.store_management.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product {
    private double price;
    private int quantity;
    private String category;
    private long id;
    private String name;
}

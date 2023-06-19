package pro.sky.shoppingservice.service;

import pro.sky.shoppingservice.Item;

import java.util.List;

public interface ShoppingCartService {
    void addItem(Item item);

    List<Item> getItems();
}
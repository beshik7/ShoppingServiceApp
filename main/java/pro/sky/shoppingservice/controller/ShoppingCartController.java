package pro.sky.shoppingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pro.sky.shoppingservice.Item;
import pro.sky.shoppingservice.service.ShoppingCartService;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ShoppingCartController {

    private final ShoppingCartService shoppingCartService;
    @Autowired
    public ShoppingCartController(ShoppingCartService shoppingCartService) {
        this.shoppingCartService = shoppingCartService;
    }

    @PostMapping("/add")
    public void addItem(@RequestBody Item item) {
        shoppingCartService.addItem(item);
    }

    @GetMapping("get")
    public List<Item> getItems() {
        return shoppingCartService.getItems();
    }
}
package pro.sky.shoppingservice.service;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.shoppingservice.Item;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class ShoppingCartServiceImpl implements ShoppingCartService {
    private List<Item>  items = new ArrayList<>();

    @Override
    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public List<Item> getItems() {
        return items;
    }
}
package pro.sky.shoppingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pro.sky.shoppingservice.Item;
import pro.sky.shoppingservice.service.ShoppingCartService;

import java.util.List;

@RestController
@RequestMapping("/store/order")
public class ShoppingCartController {

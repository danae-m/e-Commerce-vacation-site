package com.danaem.javad288.controllers;

import com.danaem.javad288.services.CheckoutService;
import com.danaem.javad288.services.Purchase;
import com.danaem.javad288.services.PurchaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/api/checkout")
public class CheckoutController {

    private CheckoutService checkoutService ;


    @Autowired
    public CheckoutController(CheckoutService checkoutService) {
      this.checkoutService = checkoutService ;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase) {
        PurchaseResponse purchaseResponse = checkoutService.placeOrder(purchase) ;
        return purchaseResponse ;
    }
}

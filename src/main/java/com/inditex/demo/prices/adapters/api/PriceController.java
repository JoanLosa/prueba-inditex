package com.inditex.demo.prices.adapters.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/prices")
public class PriceController {

    @Autowired
    private PriceFacade priceFacade;

    @GetMapping
    private PriceResponse getPreferredPrice(
            @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) @RequestParam("applyDate") LocalDateTime applyDate,
            @RequestParam("productId") Integer productId,
            @RequestParam("brandId") Integer brandId
                                                ) {

        return priceFacade.getPreferredPrice(applyDate, productId, brandId);
    }
}

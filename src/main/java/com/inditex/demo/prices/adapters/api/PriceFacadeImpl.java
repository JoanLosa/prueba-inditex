package com.inditex.demo.prices.adapters.api;

import com.inditex.demo.prices.domain.model.Price;
import com.inditex.demo.prices.domain.ports.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class PriceFacadeImpl implements PriceFacade {

    @Autowired
    private PriceService priceService;

    public PriceResponse getPreferredPrice(LocalDateTime applyDate, Integer productId, Integer brandId) {

        Price price = priceService.getPreferredPrice(applyDate, productId, brandId);

        if (price != null) {
            return new PriceResponse(price);
        }

        return null;
    }
}

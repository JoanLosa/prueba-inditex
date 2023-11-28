package com.inditex.demo.prices.domain.ports.service;

import com.inditex.demo.prices.domain.model.Price;

import java.time.LocalDateTime;

public interface PriceService {

    Price getPreferredPrice(LocalDateTime applyDate, Integer productId, Integer brandId);
}

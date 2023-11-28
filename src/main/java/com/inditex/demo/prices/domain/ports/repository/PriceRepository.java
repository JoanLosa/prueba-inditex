package com.inditex.demo.prices.domain.ports.repository;

import com.inditex.demo.prices.domain.model.Price;

import java.time.LocalDateTime;

public interface PriceRepository {

    Price getPreferredPrice(LocalDateTime applyDate, Integer productId, Integer brandId);
}

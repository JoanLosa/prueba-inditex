package com.inditex.demo.prices.adapters.pricedb;

import com.inditex.demo.prices.domain.model.Price;
import com.inditex.demo.prices.domain.ports.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class PriceRepositoryImpl implements PriceRepository {

    @Autowired
    private PriceJPARepository priceJPARepository;
    @Override
    public Price getPreferredPrice(LocalDateTime applyDate, Integer productId, Integer brandId) {

        return priceJPARepository.findTopByProductIdAndBrandIdAndStartDateBeforeAndEndDateAfterOrderByPriorityDesc(
                productId, brandId, applyDate, applyDate
        );
    }
}

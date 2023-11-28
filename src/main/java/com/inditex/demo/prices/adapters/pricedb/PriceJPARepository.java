package com.inditex.demo.prices.adapters.pricedb;

import com.inditex.demo.prices.domain.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface PriceJPARepository extends JpaRepository<Price, Integer> {

    Price findTopByProductIdAndBrandIdAndStartDateBeforeAndEndDateAfterOrderByPriorityDesc(
            Integer productId, Integer brandId, LocalDateTime apply, LocalDateTime app2
                                                                                       );
}

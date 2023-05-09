package com.github.masato29isle.bootsample.service;

import com.github.masato29isle.bootsample.model.Orders;
import com.github.masato29isle.bootsample.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * 注文情報参照サービス(通常)
 */
@Profile("default")
@Service
@AllArgsConstructor
class NormalOrderService implements OrderService {

    /**
     * 注文情報取得リポジトリ
     */
    private final OrderRepository orderRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public Orders search() {
        return Orders.from(orderRepository.findAll());
    }
}

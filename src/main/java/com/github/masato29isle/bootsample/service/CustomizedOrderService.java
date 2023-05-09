package com.github.masato29isle.bootsample.service;

import com.github.masato29isle.bootsample.model.Orders;
import com.github.masato29isle.bootsample.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * 注文情報参照サービス(カスタマイズ版)
 */
@Profile("customize")
@Service
@AllArgsConstructor
class CustomizedOrderService implements OrderService {

    /**
     * 注文情報取得リポジトリ
     */
    private final OrderRepository orderRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public Orders search() {
        // 個人情報を削除した注文一覧情報を返す
        return Orders.from(orderRepository.findAll())
                .clearPersonalInfomations();
    }
}

package com.github.masato29isle.bootsample.service;

import com.github.masato29isle.bootsample.model.Orders;

/**
 * 注文情報参照サービス
 */
public interface OrderService {

    /**
     * 注文一覧情報を取得する
     *
     * @return
     */
    Orders search();
}

package com.github.masato29isle.bootsample.model;

import lombok.Getter;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 注文一覧情報
 */
public class Orders {

    /**
     * 注文リスト
     */
    @Getter
    private final List<Order> orderList;

    /**
     * Constructor
     * @param orderList 注文リスト
     */
    private Orders(List<Order> orderList) {
        this.orderList = Collections.unmodifiableList(orderList);
    }

    /**
     * 注文一覧情報を生成する
     *
     * @param orderList 注文リスト
     * @return 注文一覧情報
     */
    public static Orders from(List<Order> orderList) {
        return new Orders(orderList);
    }

    /**
     * 個人情報を削除した注文一覧情報を取得する
     *
     * @return 個人情報を削除した注文一覧情報
     */
    public Orders clearPersonalInfomations() {
        List<Order> updateOrderList = orderList.stream()
                .map(order -> order.toBuilder().userName(null).build())
                .collect(Collectors.toUnmodifiableList());
        return new Orders(updateOrderList);
    }
}

package com.github.masato29isle.bootsample.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * 注文情報
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Order {

    /**
     * 注文ID
     */
    private String orderId;

    /**
     * 商品名
     */
    private String itemName;

    /**
     * 金額
     */
    private int price;

    /**
     * ユーザー名
     */
    private String userName;

}

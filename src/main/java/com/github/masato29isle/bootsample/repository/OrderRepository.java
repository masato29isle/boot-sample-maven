package com.github.masato29isle.bootsample.repository;

import com.github.masato29isle.bootsample.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 注文情報取得リポジトリ
 */
@Mapper
public interface OrderRepository {

    @Select("SELECT order_id, item_name, price, user_name FROM orders")
    List<Order> findAll();
}

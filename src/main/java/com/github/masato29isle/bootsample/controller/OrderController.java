package com.github.masato29isle.bootsample.controller;

import com.github.masato29isle.bootsample.model.Orders;
import com.github.masato29isle.bootsample.service.OrderService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 注文情報参照コントローラー
 */
@RestController
@RequestMapping("/api/v1/order")
public class OrderController {

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    /**
     * 注文情報参照サービス
     */
    private final OrderService orderService;

    /**
     * 注文一覧情報を取得する
     *
     * @return 注文一覧情報
     */
    @ApiOperation("注文一覧情報を取得する")
    @ApiResponse(code = 200, message = "OK", response = Orders.class)
    @GetMapping(value = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
    public Orders search() {
        System.out.println(orderService);
        return orderService.search();
    }
}

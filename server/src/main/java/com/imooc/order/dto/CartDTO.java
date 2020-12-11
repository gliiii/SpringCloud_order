package com.imooc.order.dto;

import lombok.Data;

@Data
public class CartDTO {

    /**
     * 商品id
     */
    private String productId;

    /**
     * 商品数量
     */
    private Integer productQuantity;

    /**
     * 因为重写了构造器，所以会造成序列化与反序列化的问题
     * 需要引入无参构造器
     */
    public CartDTO() {
    }

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}

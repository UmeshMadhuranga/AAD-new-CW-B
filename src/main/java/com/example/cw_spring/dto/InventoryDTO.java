package com.example.cw_spring.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class InventoryDTO implements SuperDTO{
    private String item_code;
    private String item_desc;
    private String item_picture;
    private String category;
    private int size;
    private double unit_price_sale;
    private double unit_price_buy;
    private double expected_profit;
    private double profit_margin;
    private String status;
}

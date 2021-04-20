package com.leyou.commom.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @Author ssqswyf
 * @Date 2021/4/19
 */
@Getter
@NoArgsConstructor
@AllArgsConstructor
public enum ExceptionEnum {

    /**
     * 400
     */
    PRICE_CANNOT_BE_NULL(400, "价格不能为空!"),

    /**
     * 404
     */
    CATEGORY_NOT_FOUND(404,"商品分类没查到"),
    ;
    private int code;
    private String msg;
}

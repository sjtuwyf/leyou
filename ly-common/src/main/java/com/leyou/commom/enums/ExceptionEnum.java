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

    /**
     * 404
     */
    BRAND_NOT_FOUND(404,"品牌不存在"),

    /**
     * 500
     */
    BRAND_SAVE_ERROR(500,"新增品牌失败"),

    /**
     * 500
     */
    UPLOAD_FILE_ERROR(500,"文件上传失败"),

    /**
     * 400
     */
    INVALID_FILE_TYPE(400,"无效的文件类型"),
    ;

    private int code;
    private String msg;
}

package com.leyou.item.vo;

import java.util.Date;

/**
 * @Author ssqswyf
 * @Date 2021/4/23
 */
public class SpuVO {

    private Long id;
    private Long brandId;
    private Long cid1;// 1级类目
    private Long cid2;// 2级类目
    private Long cid3;// 3级类目
    private String title;// 标题
    private String subTitle;// 子标题
    private Boolean saleable;// 是否上架
    private Boolean valid;// 是否有效，逻辑删除用
    private Date createTime;// 创建时间
    private String cname;
    private String bname;


}

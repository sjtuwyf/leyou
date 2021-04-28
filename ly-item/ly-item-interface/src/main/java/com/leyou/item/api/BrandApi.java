package com.leyou.item.api;

import com.leyou.item.pojo.Brand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author ssqswyf
 * @Date 2021/4/27
 */
public interface BrandApi {

    @GetMapping("brand/{id}")
    Brand queryBrandById(@PathVariable("id") Long id);
}

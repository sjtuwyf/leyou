package com.leyou.item.web;

import com.leyou.item.pojo.SpecGroup;
import com.leyou.item.pojo.SpecParam;
import com.leyou.item.service.SpecificationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author ssqswyf
 * @Date 2021/4/23
 */

@RestController
@RequestMapping("spec")
public class SpecificationController {

    private final SpecificationService specService;

    public SpecificationController(SpecificationService specService) {
        this.specService = specService;
    }

    /**
     * 根据分类id查询规格组
     * @param cid cid
     * @return list
     */
    @GetMapping("groups/{cid}")
    public ResponseEntity<List<SpecGroup>> queryGroupByCid(@PathVariable("cid") Long cid) {
        return ResponseEntity.ok(specService.queryGroupByCid(cid));

    }

    /**
     * 根据组id查询参数
     * @param gid gid
     * @return list
     */
    @RequestMapping("params")
    public ResponseEntity<List<SpecParam>> queryParamByGid(@RequestParam("gid") Long gid) {
        return ResponseEntity.ok(specService.queryParamByGid(gid));
    }
}

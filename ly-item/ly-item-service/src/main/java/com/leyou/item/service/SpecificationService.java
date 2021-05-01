package com.leyou.item.service;

import com.leyou.commom.enums.ExceptionEnum;
import com.leyou.commom.exception.LyException;
import com.leyou.item.mapper.SpecGroupMapper;
import com.leyou.item.mapper.SpecParamMapper;
import com.leyou.item.pojo.SpecGroup;
import com.leyou.item.pojo.SpecParam;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author ssqswyf
 * @Date 2021/4/23
 */
@Service
public class SpecificationService {

    private final SpecParamMapper paramMapper;

    private final SpecGroupMapper groupMapper;

    public SpecificationService(SpecGroupMapper groupMapper, SpecParamMapper paramMapper) {
        this.groupMapper = groupMapper;
        this.paramMapper = paramMapper;
    }

    public List<SpecGroup> queryGroupByCid(Long cid) {
        SpecGroup group = new SpecGroup();
        group.setCid(cid);
        List<SpecGroup> list = groupMapper.select(group);
        if (CollectionUtils.isEmpty(list)) {
            throw new LyException(ExceptionEnum.SPEC_GROUP_NOT_FOUND);
        }
        return list;
    }

    public List<SpecParam> queryParamList(Long gid,Long cid,Boolean searching) {
        SpecParam param = new SpecParam();
        param.setGroupId(gid);
        param.setCid(cid);
        param.setSearching(searching);
        List<SpecParam> list = paramMapper.select(param);
        if (CollectionUtils.isEmpty(list)) {
            throw new LyException(ExceptionEnum.SPEC_PARAM_NOT_FOUND);

        }
        return list;

    }

    public List<SpecGroup> queryListByCid(Long cid) {
        // 查询规格组
        List<SpecGroup> specGroups = queryGroupByCid(cid);
        // 查询当前分类下的参数
        List<SpecParam> specParams = queryParamList(null, cid, null);

        // 先把规格参数变成map，key是规格组id，值是组下的所有参数
        Map<Long, List<SpecParam>> map = new HashMap<>();

        for (SpecParam param : specParams) {
            if (!map.containsKey(param.getGroupId())) {
                map.put(param.getGroupId(),new ArrayList<>());
            }
            map.get(param.getGroupId()).add(param);
        }

        // 填充param到group
        for (SpecGroup specGroup : specGroups) {
            specGroup.setParams(map.get(specGroup.getId()));
        }

        return specGroups;
    }
}

package com.chryl.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * Created by Chryl on 2019/9/6.
 */
@Mapper
public interface ForeachMapper {
    int inserts(@Param("name") String name, @Param("params") List<String> ids);

    int deleteIds(@Param("params") List<String> ids);

    int updateBatch(@Param("params") Map<String,String> map);

    int updatesGIdById(@Param("projectId") String fileGId, @Param("params") List<String> picIdList);
}

package com.chryl.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Chryl on 2019/9/6.
 */
@Mapper
public interface ForeachMapper {
    int inserts(@Param("name") String name, @Param("params") List<String> ids);

    int inserts2(@Param("name") String name, @Param("params") List<String> ids);

    int deleteIds(@Param("params") List<String> ids);
}

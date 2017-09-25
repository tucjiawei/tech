package com.mysql.test;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Created by jiawei on 17/9/25.
 */
@Mapper
public interface TestMapper {
    @Select("select * from test where id = #{id}")
    TestModel getOne(@Param("id") long id);
}

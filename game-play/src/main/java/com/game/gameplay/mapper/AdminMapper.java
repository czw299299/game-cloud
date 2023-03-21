package com.game.gameplay.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.game.gameplay.pojo.AdminInf;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

//@Reposiory
@Mapper
public interface AdminMapper extends BaseMapper<AdminInf> {
}

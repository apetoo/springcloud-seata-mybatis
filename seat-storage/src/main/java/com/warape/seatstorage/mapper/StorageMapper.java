package com.warape.seatstorage.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.warape.seatstorage.entity.Storage;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

/**
 * @program: eureka-seata-mybatis
 * @description:
 * @author: 万明宇 (warApe)
 * @create: 2019-10-14 15:27
 **/
public interface StorageMapper extends BaseMapper<Storage> {

    @Update("UPDATE storage SET used = used + #{count},residue = residue - #{count} WHERE product_id = #{productId}")
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}

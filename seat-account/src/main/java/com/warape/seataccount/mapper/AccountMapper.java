package com.warape.seataccount.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.warape.seataccount.entity.Account;
import org.apache.ibatis.annotations.Update;

import java.math.BigDecimal;

/**
 * @program: eureka-seata-mybatis
 * @description:
 * @author: 万明宇 (warApe)
 * @create: 2019-10-14 15:24
 **/
public interface AccountMapper extends BaseMapper<Account> {

    @Update("UPDATE account SET residue = residue - #{money},used = used + #{money} where user_id = #{userId};")
    void decrease(Long userId, BigDecimal money);
}

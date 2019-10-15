package com.warape.seatstorage.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.warape.seatstorage.entity.Storage;

/**
 * @author IT云清
 */
public interface StorageService extends IService<Storage> {

    /**
     * 扣减库存
     * @param productId 产品id
     * @param count 数量
     * @return
     */
    void decrease(Long productId, Integer count);
}

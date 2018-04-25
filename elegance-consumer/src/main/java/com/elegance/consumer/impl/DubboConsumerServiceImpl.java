package com.elegance.consumer.impl;

import com.elegance.common.interfa.DubboService;
import com.elegance.consumer.DubboConsumerServiceI;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/4/24 0024.
 */
@Service
public class DubboConsumerServiceImpl implements DubboConsumerServiceI {

    @Resource
    DubboService dubboService;

    @Override
    public String getName() {
        return dubboService.getName();
    }
}

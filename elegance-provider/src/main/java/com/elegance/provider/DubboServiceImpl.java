package com.elegance.provider;

import com.elegance.common.interfa.DubboService;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/4/24 0024.
 */
@Service("dubboService")
public class DubboServiceImpl implements DubboService {
    @Override
    public String getName() {
        return "niha";
    }
}

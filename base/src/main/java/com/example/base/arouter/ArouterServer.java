package com.example.base.arouter;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * Arouter module间通信服务接口
 */
public interface ArouterServer {
    /**
     * module2 数据接口
     */
    interface Module2ArouterService extends IProvider {
        String getModule2Data();
    }

    /**
     * module1数据接口
     */
    interface Module1ArouterService extends IProvider{
        // TODO: 2018/10/17  
    }
}

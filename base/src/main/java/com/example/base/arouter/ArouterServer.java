package com.example.base.arouter;

import com.alibaba.android.arouter.facade.template.IProvider;

public interface ArouterServer {
    interface Module2ArouterService extends IProvider {
        String getModule2Data();
    }

}

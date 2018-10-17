package com.example.module2;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.base.arouter.ArouterManager;
import com.example.base.arouter.ArouterServer;

@Route(path = ArouterManager.TargetUrl.MODULE2_DATA)
public class ArouterServerImpl implements ArouterServer.Module2ArouterService {
    @Override
    public String getModule2Data() {
        return Data.DATA;
    }

    @Override
    public void init(Context context) {

    }
}

package com.example.base.arouter;

import com.alibaba.android.arouter.launcher.ARouter;

public class ArouterManager {
    public static class TargetUrl {
        public static final String MODULE1_HOME = "/module1/home";
        public static final String MODULE2_DATA = "/module2/data";
    }

    public static class Module2MsgCenter {

        private final ArouterServer.Module2ArouterService mArouterService;

        private Module2MsgCenter() {
            mArouterService = (ArouterServer.Module2ArouterService) ARouter.getInstance().build(TargetUrl.MODULE2_DATA).navigation();
        }

        private static Module2MsgCenter instance;

        public static Module2MsgCenter getInstance() {
            if (instance == null) {
                synchronized (Module2MsgCenter.class) {
                    if (instance == null) {
                        instance = new Module2MsgCenter();
                    }
                }
            }
            return instance;
        }

        public String getModule2Data() {
            return mArouterService.getModule2Data();
        }
    }
}

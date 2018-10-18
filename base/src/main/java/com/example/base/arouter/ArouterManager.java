package com.example.base.arouter;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Arouter 2次封装
 */
public class ArouterManager {
    /**
     * 跳转地址url
     */
    public static class TargetUrl {
        public static final String MODULE1_HOME = "/module1/home";
        public static final String MODULE2_DATA = "/module2/data";
    }

    /**
     * Module2的消息中心，可以通过它将数据传递给module1
     */
    public static class Module2MsgCenter {

        private final ArouterServer.Module2ArouterService mArouterService;

        private Module2MsgCenter() {
            //根据url获取Module2ArouterService实例
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

    /**
     * Module1的消息中心，可以通过它将数据传递给module2
     */
    public static class Module1MsgCenter {
        // TODO: 2018/10/17
    }

    /**
     * 跳转中心
     */
    public static class JumpCenter {
        public static void jump(String target, String jsonString) {
            ARouter.getInstance().build(target).withString("data", jsonString).navigation();
        }
    }
}

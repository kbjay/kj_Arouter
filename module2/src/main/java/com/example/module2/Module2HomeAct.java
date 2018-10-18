package com.example.module2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.base.arouter.ArouterManager;

public class Module2HomeAct extends AppCompatActivity {

    private Button mBt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module2_home);
        mBt = (Button) this.findViewById(R.id.bt_jump);
        mBt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                jump2module1();
            }
        });
    }

    private void jump2module1() {
        //带参数跳转到module1
        ArouterManager.JumpCenter.jump(ArouterManager.TargetUrl.MODULE1_HOME, "666");
    }
}

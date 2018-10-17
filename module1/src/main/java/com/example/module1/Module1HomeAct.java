package com.example.module1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.example.base.arouter.ArouterManager;

@Route(path = ArouterManager.TargetUrl.MODULE1_HOME)
public class Module1HomeAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module1_home);

        //获取module2的数据
        if (getIntent() != null) {
            long test = getIntent().getLongExtra("test", 0L);
            if (test != 0) {
                Toast.makeText(this, test + "", Toast.LENGTH_SHORT).show();
            }
        }

        findViewById(R.id.bt_get_data).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getDataFromModule2();
            }
        });
    }

    private void getDataFromModule2() {
        String data = ArouterManager.Module2MsgCenter.getInstance().getModule2Data();
        Toast.makeText(this, data, Toast.LENGTH_SHORT).show();
    }
}

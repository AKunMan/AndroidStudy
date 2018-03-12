package com.example.administrator.activityjump;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button secBtn = (Button)findViewById(R.id.sec_at_btn);
        secBtn.setOnClickListener(this);

        //第一种
//        Intent intent = getIntent();
//        Bundle data = intent.getExtras();
//        String titleName = data.getString("title_name");
//        TextView textView = (TextView)findViewById(R.id.sec_at_text);
//        textView.setText(titleName);

        //ComponentName属性
//        ComponentName componentName = getIntent().getComponent();
//        TextView textView = (TextView)findViewById(R.id.sec_at_text);
//        textView.setText("组件包名:"+componentName.getPackageName()+"--------- 组件类名"+componentName.getClassName());

        //Action
        TextView textView = (TextView)findViewById(R.id.sec_at_text);
        String str = getIntent().getAction();
        textView.setText(str);
    }

    @Override
    public void onClick(View view) {
        finish();
    }
}

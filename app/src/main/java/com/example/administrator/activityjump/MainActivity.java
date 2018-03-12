package com.example.administrator.activityjump;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public final static String CRAZZY_ACTION = "org.crazyit.intent.action.CRAZYIT_ACTION";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.main_at_btn);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        //第一种
//        Bundle data = new Bundle();
//        data.putString("title_name","一本正经");
//        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
//        intent.putExtras(data);
//        startActivity(intent);

        //ComponentName属性
//        ComponentName componentName = new ComponentName(MainActivity.this,SecondActivity.class);
//        Intent intent = new Intent();
//        intent.setComponent(componentName);
//        startActivity(intent);

        //Actiond
        Intent intent = new Intent();
        intent.setAction(MainActivity.CRAZZY_ACTION);
        startActivity(intent);
    }
}

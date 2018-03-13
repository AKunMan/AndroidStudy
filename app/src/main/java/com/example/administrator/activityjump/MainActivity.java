package com.example.administrator.activityjump;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    public final static String CRAZZY_ACTION = "org.crazyit.intent.action.CRAZYIT_ACTION";
    TextView textView;
    String[] strings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.main_at_btn);
        textView = (TextView)findViewById(R.id.main_act_textView);
        btn.setOnClickListener(this);

        //获取资源数组的数据
//        strings = getResources().getStringArray(R.array.string_normal);
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
//        Intent intent = new Intent();
//        intent.setAction(MainActivity.CRAZZY_ACTION);
//        startActivity(intent);

        //回调机制
        Intent intent = new Intent(MainActivity.this,CallBackActivity.class);
        startActivityForResult(intent,1);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 1){
            Bundle bundle = data.getExtras();
            String titleName = bundle.getString("callBack");
            Toast.makeText(MainActivity.this,titleName,Toast.LENGTH_SHORT).show();
            textView.setText(titleName);
        }
    }
}

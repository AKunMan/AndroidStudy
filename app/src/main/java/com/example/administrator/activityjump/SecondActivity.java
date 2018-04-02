package com.example.administrator.activityjump;

import android.content.ComponentName;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener{

    ImageView imageView;
    Animation anim;
    Animation reverse;
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
//        TextView textView = (TextView)findViewById(R.id.sec_at_text);
//        String str = getIntent().getAction();
//        textView.setText(str);

        this.loadAnimat();
    }

    private void loadAnimat(){
        imageView = (ImageView)findViewById(R.id.sec_img);
        //加载第一个动画
        anim = AnimationUtils.loadAnimation(this,R.anim.anim);
        anim.setFillAfter(true);
        //加载第二个动画
        reverse = AnimationUtils.loadAnimation(this,R.anim.reverse);
        reverse.setFillAfter(true);
    }
    @Override
    public void onClick(View view) {
        imageView.startAnimation(anim);
//        finish();
    }
}

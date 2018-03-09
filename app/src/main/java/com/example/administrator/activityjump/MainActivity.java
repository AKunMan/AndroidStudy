package com.example.administrator.activityjump;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.main_at_btn);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Bundle data = new Bundle();
//        data.putSerializable("title_name","一本正经");
        data.putString("title_name","一本正经");
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtras(data);
        startActivity(intent);
    }
}

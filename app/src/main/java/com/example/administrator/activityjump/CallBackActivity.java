package com.example.administrator.activityjump;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CallBackActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call_back);

        Button button = (Button)findViewById(R.id.callBack_act_btn);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = getIntent();
        Bundle data = new Bundle();
        data.putString("callBack","回调返回");
        intent.putExtras(data);
        CallBackActivity.this.setResult(1,intent);
        CallBackActivity.this.finish();
    }
}

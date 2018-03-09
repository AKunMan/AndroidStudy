package com.example.administrator.activityjump;

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

        Intent intent = getIntent();
        Bundle data = intent.getExtras();
        String titleName = data.getString("title_name");
        TextView textView = (TextView)findViewById(R.id.sec_at_text);
        textView.setText(titleName);
    }

    @Override
    public void onClick(View view) {
        finish();
    }
}

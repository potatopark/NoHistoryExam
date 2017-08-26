package com.example.user.a5_nohistoryexam;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements
        View.OnClickListener{

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                //화면 이동을 위한 명시적 인텐트
                Intent intent = new Intent(this,SecondActivity.class);
                //SecondActivity가 History에 저장되지 않도록 플래그 설정
                intent.addFlags(intent.FLAG_ACTIVITY_NO_HISTORY);

                startActivity(intent);
                break;
        }
    }
}

package com.example.a6.demo1;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn:
                startActivity(new Intent(this, Main2Activity2.class));
                break;
            default:
                startActivity(new Intent(this, Main2Activity2.class));
                startActivity(new Intent(this, Main2Activity2.class));
                startActivity(new Intent(this, Main2Activity2.class));
                break;
        }
    }
}

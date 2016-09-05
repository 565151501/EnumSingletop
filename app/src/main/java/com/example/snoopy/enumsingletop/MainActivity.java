package com.example.snoopy.enumsingletop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ToastMgr.builder.init(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button:
                ToastMgr.builder.display("button1");

                break;
            case R.id.button2:
                ToastMgr.builder.display("button2");

                break;
        }
    }
}

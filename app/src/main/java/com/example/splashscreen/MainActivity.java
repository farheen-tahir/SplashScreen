package com.example.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void move(View v) {
        TextView f= findViewById(R.id.forget);
        TextView r=findViewById(R.id.register);
        Button btn=(Button) findViewById(R.id.button);
        Intent i;
        switch (v.getId()){
            case R.id.button:
                i=new Intent(this,menu.class);
                startActivity(i);
                break;
            case R.id.forget:
                i=new Intent(this,ForgetPass.class);
                startActivity(i);
                break;
            case R.id.register:
                i=new Intent(this,Register.class);
                startActivity(i);
                break;
            case R.id.forgetBtn:
                i=new Intent(this,Reset.class);
                startActivity(i);
                break;
        }

    }
}
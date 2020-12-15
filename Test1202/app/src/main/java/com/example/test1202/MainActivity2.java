package com.example.test1202;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    private EditText username2;
    private  EditText password2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Button button1 = (Button) findViewById(R.id.button6);
        Button getvalue = (Button)findViewById(R.id.getvalue);
        EditText get = (EditText)findViewById(R.id.et_rtn);
        button1.setOnClickListener(new View.OnClickListener() {
            Intent intent = getIntent();
            EditText user = (EditText) findViewById(R.id.username2);
            EditText pass = (EditText) findViewById(R.id.password2);
            String username2 = intent.getStringExtra("username");
            String password2 = intent.getStringExtra("password");
            @Override
            public void onClick(View v) {
                user.setText(username2);
                pass.setText(password2);
                Toast.makeText(MainActivity2.this, "注册成功，返回",
                        Toast.LENGTH_SHORT).show();

        }
        });
        getvalue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String display = getIntent().getStringExtra("commit");
                String result =get.getText().toString();
            Intent intent2 = new Intent();
            intent2.putExtra("result",result);
            setResult(1,intent2);
            finish();

            }
        });
    }
}
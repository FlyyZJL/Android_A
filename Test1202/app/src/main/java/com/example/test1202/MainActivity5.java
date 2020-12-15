package com.example.test1202;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity5 extends AppCompatActivity {
    RadioGroup radioGroup = findViewById(R.id.group);
    RadioButton radioButton = findViewById(R.id.radioButton);
    RadioButton radioButton2 = findViewById(R.id.radioButton2);
    Button btn = findViewById(R.id.button4);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fang ="";
                for (int i=0;i<radioGroup.getChildCount();i++){
                    RadioButton radioButton3 =(RadioButton)radioGroup.getChildAt(i);
                    if (radioButton3.isChecked()){
                        fang=radioButton3.getText().toString();
                        Toast.makeText(MainActivity5.this, "你点击的是" +fang, Toast.LENGTH_SHORT).show();
                        break;
                    }
                }
            }
        });


    }
}
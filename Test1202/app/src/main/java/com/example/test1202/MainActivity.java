package com.example.test1202;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int[] image = new int[]{
            R.drawable.pic1,
            R.drawable.pic2,
            R.drawable.pic3,
            R.drawable.pic4,
            R.drawable.pic5,
    };
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "你点击了按钮", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "你点击了按钮2", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;    
        }

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = (Button) findViewById(R.id.button3);
        Button button2 = (Button) findViewById(R.id.button2);
        Button btn_return = (Button)findViewById(R.id.btn_return);
        Button button =(Button)findViewById(R.id.button);
        Button button3 =(Button)findViewById(R.id.button5);
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        EditText return_text = (EditText)findViewById(R.id.et_return);
        imageView.setImageResource(image[0]);

        imageView.setOnClickListener(new View.OnClickListener() {
            int count = 0;
            @Override
            public void onClick(View v) {

                imageView.setImageResource(image[++count%image.length]);


            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(MainActivity.this,MainActivity5.class);
                startActivity(intent3);
            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(MainActivity.this,MainActivity4.class);
                startActivity(intent4);
            }
        });
        btn_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("commit",return_text.getText().toString());
                startActivityForResult(intent,1);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "你点击了按钮",
                        Toast.LENGTH_SHORT).show();
                Intent intent1 = new Intent(MainActivity.this,MainActivity2.class);
                EditText login = findViewById(R.id.username);
                EditText reg = findViewById(R.id.password);
                intent1.putExtra("username",login.getText().toString());
                intent1.putExtra("password",reg.getText().toString());
                startActivity(intent1);



            }
        });
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                EditText login = findViewById(R.id.username);
                EditText reg = findViewById(R.id.password);
                intent.putExtra("username",login.getText().toString());
                intent.putExtra("password",reg.getText().toString());
                startActivity(intent);
                    }
                });
            }

    private void initView() {

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data)
    {
        super.onActivityResult(requestCode, resultCode, data);
        EditText return_text = (EditText)findViewById(R.id.et_return);
        if(requestCode == 1 && resultCode == 1)
        {
            String result_value = data.getStringExtra("result");
            return_text.setText(result_value);
        }
    }
        }


package com.example.test1202;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity4 extends AppCompatActivity {

    String[] data = {"王乐斌", "王乐斌好帅", "李秉刚", "李秉刚好帅", "赵庭皎", "赵庭皎好帅"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity4.this,android.R.layout.simple_list_item_1,data);
        ListView listView = (ListView) findViewById(R.id.list2);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity4.this, "listview被点击了，点击的位置是：" + data[position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
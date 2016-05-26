package com.chiahaolu.settingitem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.chiahaolu.library.SettingItem;

public class MainActivity extends AppCompatActivity {

    private SettingItem settingItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        settingItem = (SettingItem) findViewById(R.id.settingItem);
        settingItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                settingItem.setSelected(true);
                settingItem.setLeftIcon(R.mipmap.ic_launcher);
                settingItem.setLeftText("左侧更改");
                settingItem.setRightText("右侧更改");
                settingItem.setRightIcon(R.mipmap.ic_launcher);
                Toast.makeText(MainActivity.this,"条目被点击",Toast.LENGTH_SHORT).show();
            }
        });
    }
}

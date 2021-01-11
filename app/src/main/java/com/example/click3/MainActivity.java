package com.example.click3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    static int count =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void go(View view) {
        count++;
        Button bat = (Button) findViewById(R.id.button);
        if (count <= 6){
            bat.setText("This is a click number:"+count);
        }
        else{
            count =0;
            bat.setText("Enough to click. Go to new start!");
        }

    }
}
package com.example.mob_lab1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int cntr = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btn_click(View view)
    {
        TextView txt = (TextView)findViewById(R.id.textView);
        txt.setText("Вы нажали на кнопку " + ++cntr + " раз");
    }
}
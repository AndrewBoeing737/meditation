package com.example.meditation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;

public class SecondActivity extends AppCompatActivity {
    private Button button1;
    private Button candlesButton;
    private Button bodyButton;
    private Button music;
    private Button music2;
    private Button music3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        button1 = findViewById(R.id.button1);
        candlesButton = findViewById(R.id.candlesButton);
        bodyButton = findViewById(R.id.bodyButton);
        music = findViewById(R.id.Music);
        music2 = findViewById(R.id.Music2);
        music3 = findViewById(R.id.button3);

        button1.setOnClickListener(listener);
        candlesButton.setOnClickListener(listener);
        bodyButton.setOnClickListener(listener);
        music.setOnClickListener(listener);
        music2.setOnClickListener(listener);
        music3.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.button1:
                    Intent intent = new Intent(getApplicationContext(), breath.class);
                    startActivity(intent);
                    break;
                case R.id.candlesButton:
                        Intent intent2 = new Intent(getApplicationContext(), candle.class);
                        startActivity(intent2);
                        break;
                case  R.id.Music:
                    Intent intent4 = new Intent(getApplicationContext(), Music.class);
                    startActivity(intent4);
                    break;
                case R.id.bodyButton:
                    Intent intent3 = new Intent(getApplicationContext(), body.class);
                    startActivity(intent3);
                    break;
                case  R.id.Music2:
                    Intent intent5 = new Intent(getApplicationContext(), Music2.class);
                    startActivity(intent5);
                    break;
                case R.id.button3:
                    Intent intent6 = new Intent(getApplicationContext(), Music3.class);
                    startActivity(intent6);
                    break;
            }
        }
    };
}

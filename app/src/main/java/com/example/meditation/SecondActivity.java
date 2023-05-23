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


        button1.setOnClickListener(listener);
        candlesButton.setOnClickListener(listener);
        bodyButton.setOnClickListener(listener);

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

                case R.id.bodyButton:
                    Intent intent3 = new Intent(getApplicationContext(), body.class);
                    startActivity(intent3);
                    break;


            }
        }
    };
}

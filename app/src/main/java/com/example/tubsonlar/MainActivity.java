package com.example.tubsonlar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView editText;
    Button button1, button2;
    TextView textView;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edittext);
        button1 = findViewById(R.id.button_1);
        button2 = findViewById(R.id.button_2);
        textView = findViewById(R.id.textview);

        button1.setOnClickListener(view -> {
            textView.setText("");
            if (!editText.getText().toString().equals("")) {
                int son = Integer.parseInt(editText.getText().toString());
                int count = 0;
                for (int i = 1; i <= son; i++) {
                    if (son % i == 0) {
                        count++;
                    }
                }
                if (count == 2) {
                    textView.setText("    Tub son");
                } else {
                    textView.setText("    Tub son emas");
                }
            }
        });

        button2.setOnClickListener(view -> {
            textView.setText("");
            if (!editText.getText().toString().equals("")) {

                int son = Integer.parseInt(editText.getText().toString());
                for (int i = 1; i <= son; i++) {
                    int count = 0;
                    for (int j = 1; j <= son/2; j++) {
                        if (i % j == 0) {
                            count++;
                        }
                    }
                    if (count == 2) {
                        textView.setText(textView.getText().toString() + "   " + i);
                    }
                }
            }
        });
    }
}
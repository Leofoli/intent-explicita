package com.example.intentimplicita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String message1 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_1);
        String message2 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE_2);
        TextView textView1 = new TextView(this);
        textView1.setTextSize(40);
        textView1.setText("Nome: " + message + "\n" + "CPF: " + message1 + "\n" + "Senha: " + message2);
        setContentView(textView1);
    }
}

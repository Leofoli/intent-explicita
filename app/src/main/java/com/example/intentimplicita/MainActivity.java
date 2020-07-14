package com.example.intentimplicita;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.intentimplicita.MESSAGE";
    public final static String EXTRA_MESSAGE_1 = "com.example.intentimplicita.MESSAGE1";
    public final static String EXTRA_MESSAGE_2 = "com.example.intentimplicita.MESSAGE2";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void zz(View view){
        Intent intent = new Intent(this, Main2Activity.class);
        EditText editText = (EditText)findViewById(R.id.EditText1);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        EditText editText1 = (EditText)findViewById(R.id.EditText2);
        String message2 = editText1.getText().toString();
        intent.putExtra(EXTRA_MESSAGE_1, message2);
        EditText editText2 = (EditText)findViewById(R.id.EditText3);
        String message3 = editText2.getText().toString();
        intent.putExtra(EXTRA_MESSAGE_2, message3);
        startActivity(intent);
    }
}

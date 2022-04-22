package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void convert(View view) {
        EditText convert = findViewById(R.id.editTextNumber);
        String text = convert.getText().toString();
        Integer number = Integer.parseInt(text);
        String binary_number = Integer.toString(number, 2);

        Integer max = 0;
        Integer now = 0;

        for ( int i=0; i < binary_number.length(); i++) {
            if (binary_number.charAt(i) == '1'){
                now++;
            }
            else {
                now = 0;
            }
            if (now > max) {
                max = now;
            }
        }
        TextView finalText = findViewById(R.id.textView);
        finalText.setText(max.toString());
    }
}
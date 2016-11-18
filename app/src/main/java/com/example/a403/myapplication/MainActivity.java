package com.example.a403.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText n1;
    EditText n2;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText) findViewById(R.id.editText);
        n2 = (EditText) findViewById(R.id.editText2);
        t1 = (TextView) findViewById(R.id.textView);
    }

    void on(View v) {
        if (n1.getText().length() == 0 || n2.getText().length() == 0) {
            Toast.makeText(getApplicationContext(), "아무것도 입력하지 않으면 결과가 나오지않습니다", Toast.LENGTH_SHORT).show();
            return;
        }

        double num1 = Double.parseDouble((n1.getText().toString()));
        double num2 = Double.parseDouble((n2.getText().toString()));
        double result = 0;

        if (v.getId() == R.id.button) {
            result = num1 + num2;
        } else if (v.getId() == R.id.button2) {
            result = num1 - num2;
        } else if (v.getId() == R.id.button3) {
            result = num1 * num2;
        } else if (v.getId() == R.id.button4) {
            result = num1 / num2;
        } else if (v.getId() == R.id.button5) {
            result = num1 % num2;
        }
        t1.setText("" + result);
    }
}

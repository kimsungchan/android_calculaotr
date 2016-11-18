package com.example.a403.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText n1;
    EditText n2;
    TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = (EditText)findViewById(R.id.editText);
        n2 = (EditText)findViewById(R.id.editText2);
        t1 = (TextView)findViewById(R.id.textView);
    }
       void on(View v){
           int num1 = Integer.parseInt((n1.getText().toString()));
           int num2 = Integer.parseInt((n2.getText().toString()));
           int result = 0;

           if(v.getId() == R.id.button){
               result = num1+num2;
           }
           else if(v.getId() == R.id.button2){
               result = num1-num2;
           }
           else if(v.getId() == R.id.button3){
               result = num1*num2;
           }
           else if(v.getId() == R.id.button4){
               result = num1/num2;
           }
           else if(v.getId()== R.id.button5){
               result = num1%num2;
           }
           t1.setText(""+result);
    }
}

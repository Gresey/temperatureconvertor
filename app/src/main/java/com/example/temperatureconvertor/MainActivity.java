package com.example.temperatureconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
     public void onClickButton(View view){
         EditText temp=findViewById(R.id.editTextNumberDecimal);
        String inputInString=temp.getText().toString();
        Double inputInDouble=Double.parseDouble(inputInString);
        double temp2=(inputInDouble*9/5)-32;
         Snackbar.make(view,"temperature in farenhiet is"+temp2,Snackbar.LENGTH_LONG).show();
     }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
package com.john.switchdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.Html;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//    EditText editTextOne;
//    EditText editTextTwo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        editTextOne = findViewById(R.id.editTextOne);
//        editTextTwo = findViewById(R.id.editTextTwo);
//        editTextOne.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                if(s.toString().length() == 1){
//                    editTextTwo.requestFocus();
//                }
//            }
//        });
//
//        editTextTwo.addTextChangedListener(new TextWatcher() {
//            @Override
//            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
//
//            }
//
//            @Override
//            public void onTextChanged(CharSequence s, int start, int before, int count) {
//
//            }
//
//            @Override
//            public void afterTextChanged(Editable s) {
//                if(s.toString().length() == 0){
//                    editTextOne.requestFocus();
//                }
//            }
//        });
        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);
        textView1.setText(Html.fromHtml(getString(R.string.redx)));
        textView2.setText(Html.fromHtml(getString(R.string.checkmark)));


    }
}
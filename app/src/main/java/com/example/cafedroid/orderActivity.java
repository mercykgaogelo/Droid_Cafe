package com.example.cafedroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class orderActivity extends AppCompatActivity {

private TextView mOrderMessages;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
       mOrderMessages = findViewById(R.id.order_textview);

        Intent intent = getIntent();
        //String stringIntent = mOrderMessages.getText().toString();
       // intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
      //  intent.setType(stringIntent);
        String yourOrderMessage = "Order" + intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        mOrderMessages.setText(yourOrderMessage);
    }
}
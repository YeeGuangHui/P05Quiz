package com.example.p05_quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView quantity_textView;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_second);
        quantity_textView = findViewById(R.id.textView);
//        tvAnswer.setText("In Second Activity");
            Intent intentReceived = getIntent();
            String Ticket = intentReceived.getStringExtra("Question");
        quantity_textView.setText("You have selected "+checkBox+ "trip. Your air ticket costs $"+price);
        }
    }

}

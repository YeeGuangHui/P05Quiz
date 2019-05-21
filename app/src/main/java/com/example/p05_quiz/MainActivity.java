package com.example.p05_quiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button decrementButton;
    Button incrementButton;
    Button submitButton;
    CheckBox checkBox1;
    CheckBox checkBox2;
    EditText quantity_textView;

    int pax = 0;
    double price = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        decrementButton = findViewById(R.id.decrementButton);
        incrementButton = findViewById(R.id.incrementButton);
        submitButton = findViewById(R.id.submitButton);
        quantity_textView = findViewById(R.id.quantity_textview);
        checkBox1 = findViewById(R.id.checkBox1);
        checkBox2 = findViewById(R.id.checkBox2);

        quantity_textView.setText(pax);

        submitButton.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View view) {
                                                Intent intent = new Intent(getBaseContext(), SecondActivity.class);
                                                intent.putExtra("Pax", pax);
                                                startActivity(intent);
                                            }
                                        }
        );

        if ((checkBox1.isChecked() && checkBox2.isChecked()) || (!checkBox1.isChecked() && !checkBox2.isChecked())) {
            price = 0;
        }
        else if (checkBox2.isChecked()) {
                price = 100 * pax * 2;
            } else {
                price = 100 * pax;
            }
        }
    @Override
    protected void onStart () {
        Log.d("MainActivity", "onStart() called.");
        super.onStart();
    }

    @Override
    protected void onResume () {
        Log.d("MainActivity", "onResume() called.");
        super.onResume();
    }

    @Override
    protected void onPause () {
        Log.d("MainActivity", "onPause() called.");
        super.onPause();
    }

    @Override
    protected void onStop () {
        Log.d("MainActivity", "onStop() called.");
        super.onStop();
    }

    @Override
    protected void onDestroy () {
        Log.d("MainActivity", "onDestroy() called.");
        super.onDestroy();
    }

    @Override
    protected void onRestart () {
        Log.d("MainActivity", "onRestart() called.");
        super.onRestart();
    }

}
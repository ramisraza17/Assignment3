package com.example.Assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity12 extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);

        textView = findViewById(R.id.textView12);
        Intent i = getIntent();
        int count = i.getIntExtra("count", 0);
        textView.setText(textView.getText().toString() + String.valueOf(count));
    }
}

package com.example.Assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity9 extends AppCompatActivity {

    Button button;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        button = findViewById(R.id.button9);
        radioGroup = findViewById(R.id.radioGroup7);
        final Intent i = getIntent();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int id = radioGroup.getCheckedRadioButtonId();
                if(id == -1)
                {

                }
                else
                {
                    Intent i1 = new Intent(MainActivity9.this, MainActivity10.class);
                    if(id == R.id.radioButton32)
                    {
                        int count = i.getIntExtra("count", 0);
                        count++;
                        i1.putExtra("count", count);
                        startActivity(i1);
                    }

                    else
                    {
                        int count = i.getIntExtra("count", 0);
                        i1.putExtra("count", count);
                        startActivity(i1);
                    }
                }
            }
        });
    }
}
package com.example.Assignment3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class MainActivity3 extends AppCompatActivity {


    Button button;
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        button = findViewById(R.id.button3);
        radioGroup = findViewById(R.id.radioGroup1);
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
                    Intent i1 = new Intent(MainActivity3.this, MainActivity4.class);
                    if(id == R.id.radioButton5)
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
package com.example.acme.csci3130_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button GoButton = findViewById(R.id.Gobutton);
        GoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText InputEditText = findViewById(R.id.InputeditText);
                TextView TheFoo = findViewById(R.id.TheFoo);
                TheFoo.setText(InputEditText.getText().toString()+"");
            }
        });
    }
}


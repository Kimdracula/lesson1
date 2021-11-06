package com.homework.lesson1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EditTextActivity extends MainActivity{
    Button buttonActivity2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_text);
        buttonActivity2 = findViewById(R.id.buttonActivity2);
        buttonActivity2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(EditTextActivity.this,MainActivity.class);
                startActivity(intent2);
            }
        });

    }
    }


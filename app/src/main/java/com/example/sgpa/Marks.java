package com.example.sgpa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Marks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marks2);
        Intent intent = getIntent();
        TextView marks = (TextView)findViewById(R.id.message);
        marks.setText(Double.toString(intent.getDoubleExtra("Marks", 0.0)));
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(Marks.this, Main1Activity.class);
        startActivity(intent);
        finish();
    }
}

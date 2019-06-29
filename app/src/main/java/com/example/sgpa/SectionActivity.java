package com.example.sgpa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class SectionActivity extends AppCompatActivity {

    String a[] = {"A", "B"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_section);
        Spinner spinner = (Spinner)findViewById(R.id.spinner);
        Button button = (Button)findViewById(R.id.next);
        ArrayAdapter<String> aa= new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, a);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(aa);
        Intent intent = getIntent();
        final int[] s = {intent.getIntExtra("sem", 0)};
        final int[] pos = {0};
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                pos[0] = position+1;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s[0] = s[0]*10 + pos[0];
                Intent i = new Intent(SectionActivity.this, gradeActivity.class);
                i.putExtra("final", s[0]);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(SectionActivity.this, Main1Activity.class);
        startActivity(intent);
        finish();
    }
}

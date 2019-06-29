package com.example.sgpa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Main1Activity extends AppCompatActivity {

    String arr[] = {"First","Second","Third","Fourth","Fifth","Sixth","Seventh","Eighth"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);

        Button button = (Button)findViewById(R.id.next);
        Spinner spin =  (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, arr);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);
        final int[] pos = {1};
        spin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                pos[0] = position + 1;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(pos[0] == 1 || pos[0] == 2)
                {
                    Intent intent = new Intent(Main1Activity.this, SectionActivity.class);
                    intent.putExtra("sem",pos[0]);
                    startActivity(intent);
                    finish();
                }
                else
                {
                    Intent intent = new Intent(Main1Activity.this, BranchActivity.class);
                    intent.putExtra("sem",pos[0]);
                    startActivity(intent);
                    finish();
                }
            }
        });
    }
}

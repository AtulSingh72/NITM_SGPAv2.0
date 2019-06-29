package com.example.sgpa;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntro2Fragment;

public class IntroActivity extends AppIntro2 {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addSlide(AppIntro2Fragment.newInstance("First step", "Select your Semester.", R.drawable.semester, Color.rgb(8, 148, 208)));
        addSlide(AppIntro2Fragment.newInstance("Second step", "Select your Branch or Section accordingly.", R.drawable.branch, Color.rgb(8, 148, 208)));
        addSlide(AppIntro2Fragment.newInstance("Third step", "Enter your Expected Grades for the subjects.", R.drawable.grades, Color.rgb(8, 148, 208)));
        addSlide(AppIntro2Fragment.newInstance("Done!", "Cool! You are done! See your result.", R.drawable.result, Color.rgb(8, 148, 208)));

        showSkipButton(true);

    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent intent = new Intent(IntroActivity.this, Main1Activity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent intent = new Intent(IntroActivity.this, Main1Activity.class);
        startActivity(intent);
        finish();
    }
}

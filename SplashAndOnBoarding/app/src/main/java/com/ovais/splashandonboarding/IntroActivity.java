package com.ovais.splashandonboarding;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;


public class IntroActivity extends AppIntro {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addSlide(AppIntroFragment.newInstance(getResources().getString(R.string.chef_title),getResources().getString(R.string.chef_description),
                R.drawable.chef, ContextCompat.getColor(getApplicationContext(), R.color.backgoundColor)));
        addSlide(AppIntroFragment.newInstance(getResources().getString(R.string.dineIn_title),getResources().getString(R.string.dineIn_description01),
                R.drawable.dinnertable, ContextCompat.getColor(getApplicationContext(), R.color.backgoundColor)));
        addSlide(AppIntroFragment.newInstance(getResources().getString(R.string.payment_title),getResources().getString(R.string.payment_description04),
                R.drawable.payment, ContextCompat.getColor(getApplicationContext(), R.color.backgoundColor)));

    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        Intent intent=new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Intent intent=new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
        finish();
    }


}

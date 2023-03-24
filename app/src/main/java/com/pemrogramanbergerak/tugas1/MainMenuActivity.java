package com.pemrogramanbergerak.tugas1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.pemrogramanbergerak.tugas1.databinding.ActivityMainMenuBinding;

public class MainMenuActivity extends DrawerBaseActivity {

    ActivityMainMenuBinding activityMainMenuBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainMenuBinding = ActivityMainMenuBinding.inflate(getLayoutInflater());
        allocateActivityTitle("Main Menu");
        setContentView(activityMainMenuBinding.getRoot());
    }
}
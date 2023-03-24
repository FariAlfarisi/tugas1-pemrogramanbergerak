package com.pemrogramanbergerak.tugas1;

import android.os.Bundle;

import com.pemrogramanbergerak.tugas1.databinding.ActivityPhpactivityBinding;

public class PHPActivity extends DrawerBaseActivity {

    ActivityPhpactivityBinding activityPhpactivityBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityPhpactivityBinding = ActivityPhpactivityBinding.inflate(getLayoutInflater());
        setContentView(activityPhpactivityBinding.getRoot());
        allocateActivityTitle("PHP");
    }
}
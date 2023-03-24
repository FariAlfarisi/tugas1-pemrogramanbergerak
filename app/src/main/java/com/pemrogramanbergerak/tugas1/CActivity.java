package com.pemrogramanbergerak.tugas1;

import android.os.Bundle;

import com.pemrogramanbergerak.tugas1.databinding.ActivityCactivityBinding;

public class CActivity extends DrawerBaseActivity {

    ActivityCactivityBinding activityCactivityBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityCactivityBinding = ActivityCactivityBinding.inflate(getLayoutInflater());
        setContentView(activityCactivityBinding.getRoot());
        allocateActivityTitle("C");
    }
}
package com.pemrogramanbergerak.tugas1;

import android.os.Bundle;

import com.pemrogramanbergerak.tugas1.databinding.ActivityJavaBinding;

public class JavaActivity extends DrawerBaseActivity {

    ActivityJavaBinding activityJavaBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityJavaBinding = ActivityJavaBinding.inflate(getLayoutInflater());
        setContentView(activityJavaBinding.getRoot());
        allocateActivityTitle("Java");
    }
}
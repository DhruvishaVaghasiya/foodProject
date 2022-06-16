package com.example.foodsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ProfilePageActivity extends AppCompatActivity {

    TextView PnumEdt,EmailEdt,UrNameEdt,NameEdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        initView();
    }

    private void initView() {
        PnumEdt=findViewById(R.id.PnumEdt);
        EmailEdt=findViewById(R.id.EmailEdt);
        UrNameEdt=findViewById(R.id.UrNameEdt);
        NameEdt=findViewById(R.id.NameEdt);

    }
}
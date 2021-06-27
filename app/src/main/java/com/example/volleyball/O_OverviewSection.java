package com.example.volleyball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class O_OverviewSection extends AppCompatActivity {
    private ImageButton imageButton;
    private Button originBtn, wGrowthBtn, eventsBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview_section);

        //assigning...
        imageButton = (ImageButton) findViewById(R.id.backBtn);
        originBtn = (Button) findViewById(R.id.origin);
        wGrowthBtn = (Button) findViewById(R.id.wGrowth);
        eventsBtn = (Button) findViewById(R.id.events);

        //back to Home section
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toHomeSection = new Intent(O_OverviewSection.this, HomeActivity.class);
                startActivity(toHomeSection);
                finish();
            }
        });

        //
        originBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toOriginContainer = new Intent(O_OverviewSection. this, OverviewOriginContainer.class);
                startActivity(toOriginContainer);
                finish();
            }
        });

        wGrowthBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toWGrowthContainer = new Intent(O_OverviewSection. this, OverviewWGrowthContainer.class);
                startActivity(toWGrowthContainer);
                finish();

            }
        });

        eventsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toEventsContainer = new Intent(O_OverviewSection. this, OverviewEventsContainer.class);
                startActivity(toEventsContainer);
                finish();

            }
        });
    }
}
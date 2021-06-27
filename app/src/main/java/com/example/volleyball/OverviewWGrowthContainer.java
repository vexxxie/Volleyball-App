package com.example.volleyball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class OverviewWGrowthContainer extends AppCompatActivity {
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview_wgrowth_container);

        imageButton = (ImageButton) findViewById(R.id.wwgBackBtn);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toOverviewSection = new Intent(OverviewWGrowthContainer. this, O_OverviewSection.class);
                startActivity(toOverviewSection);
                finish();
            }
        });
    }
}
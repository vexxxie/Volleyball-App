package com.example.volleyball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class OverviewOriginContainer extends AppCompatActivity {
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview_origin_container);

        imageButton = (ImageButton) findViewById(R.id.origBackBtn);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toOverviewSection = new Intent(OverviewOriginContainer. this, O_OverviewSection.class);
                startActivity(toOverviewSection);
                finish();
            }
        });
    }
}
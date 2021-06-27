package com.example.volleyball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class F_FacilitiesSection extends AppCompatActivity {
    private ImageButton imageButton;
    private Button vCourtBtn, linesBtn, zoneAreasBtn, netPostBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facilities);

        imageButton = (ImageButton) findViewById(R.id.faciBackBtn);
        vCourtBtn = (Button) findViewById(R.id.vCourt);
        linesBtn = (Button) findViewById(R.id.lines);
        zoneAreasBtn = (Button) findViewById(R.id.zoneAreas);
        netPostBtn = (Button) findViewById(R.id.netPost);


        //back to home activity
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toHome = new Intent(F_FacilitiesSection. this, HomeActivity.class);
                startActivity(toHome);
                finish();
            }
        });

        vCourtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toVCourtContainer = new Intent(F_FacilitiesSection. this, FacilitiesVCourtContainer.class);
                startActivity(toVCourtContainer);
                finish();
            }
        });

        linesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toLineContainer = new Intent(F_FacilitiesSection. this, FacilitiesLineContainer.class);
                startActivity(toLineContainer);
                finish();
            }
        });

        zoneAreasBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toZAreasContainer = new Intent(F_FacilitiesSection. this, FacilitiesZAreasContainer.class);
                startActivity(toZAreasContainer);
                finish();
            }
        });

        netPostBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toNetPostContainer = new Intent(F_FacilitiesSection. this, FacilitiesNetPostContainer.class);
                startActivity(toNetPostContainer);
                finish();
            }
        });



    }
}
package com.example.volleyball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    private Button firstBtn, secBtn, thirdBtn, fourthBtn, fifthBtn, sixthBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        //assigning vars...
        firstBtn = (Button) findViewById(R.id.overview);
        secBtn = (Button) findViewById(R.id.skills);
        thirdBtn = (Button) findViewById(R.id.terminologies);
        fourthBtn = (Button) findViewById(R.id.equipments);
        fifthBtn = (Button) findViewById(R.id.facilities);
        sixthBtn = (Button) findViewById(R.id.rules);


        //overview section
        firstBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toOverview = new Intent(HomeActivity.this, O_OverviewSection.class);
                startActivity(toOverview);
                finish();
            }
        });

        //basic skills
        secBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toBasicSkills = new Intent(HomeActivity.this, BS_BasicSkillsSection.class);
                startActivity(toBasicSkills);
                finish();
            }
        });

        //basic terminologies
        thirdBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toBasicTerminologies = new Intent(HomeActivity.this, BT_BasicTermSection.class);
                startActivity(toBasicTerminologies);
                finish();
            }
        });
        
        //equipments
        fourthBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent e = new Intent(HomeActivity.this, E_EquipmentsSection.class);
                startActivity(e);
                finish();
            }
        });

        //facilities
        fifthBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toFacilities = new Intent(HomeActivity.this, F_FacilitiesSection.class);
                startActivity(toFacilities);
                finish();
            }
        });

        //rules
        sixthBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toRules = new Intent(HomeActivity.this, R_RulesContainer.class);
                startActivity(toRules);
                finish();
            }
        });

    }
}
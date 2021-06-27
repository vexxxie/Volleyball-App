package com.example.volleyball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BS_BasicSkillsSection extends AppCompatActivity {
    private ImageButton imageButton;
    private Button servingBtn, passingBtn, hittingBtn, blockingBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_skills_section);


        imageButton = (ImageButton) findViewById(R.id.backBtn);
        servingBtn = (Button) findViewById(R.id.servingSkill);
        passingBtn = (Button) findViewById(R.id.passingSkill);
        hittingBtn = (Button) findViewById(R.id.hittingSkill);
        blockingBtn = (Button) findViewById(R.id.blockingSkill);

        //back to Home Section
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toHomeSection = new Intent(BS_BasicSkillsSection.this, HomeActivity.class);
                startActivity(toHomeSection);
                finish();
            }
        });

        servingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toServingContainer = new Intent(BS_BasicSkillsSection. this, BSServingContainer.class);
                startActivity(toServingContainer);
                finish();
            }
        });

        passingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toPassingContainer = new Intent(BS_BasicSkillsSection. this, BSPassingContainer.class);
                startActivity(toPassingContainer);
                finish();
            }
        });

        hittingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toHittingContainer = new Intent(BS_BasicSkillsSection. this, BSHittingContainer.class);
                startActivity(toHittingContainer);
                finish();
            }
        });

        blockingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toBlockingContainer = new Intent(BS_BasicSkillsSection. this, BSkillBlockingContainer.class);
                startActivity(toBlockingContainer);
                finish();
            }
        });

    }
}
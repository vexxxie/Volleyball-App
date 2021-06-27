package com.example.volleyball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class BSHittingContainer extends AppCompatActivity {
    private ImageButton imageButton;
    private Button title1, title2, title3, title4, title5, title6, title7, title8;
    private TextView content1, content2, content3, content4, content5, content6, content7, content8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bskill_hittingskill_container);

        imageButton = findViewById(R.id.skillBackBtn);

        title1 = findViewById(R.id.titleDump);
        content1 = findViewById(R.id.contentTheServe);
        title2 = findViewById(R.id.titleHardDriven);
        content2 = findViewById(R.id.contentScoring);
        title3 = findViewById(R.id.titleOffSpeed);
        content3 = findViewById(R.id.contentFloatServe);
        title4 = findViewById(R.id.titleSlideAttack);
        content4 = findViewById(R.id.contentPlayingGame);
        title5 = findViewById(R.id.titleCrossCourt);
        content5 = findViewById(R.id.contentJumpServe);
        title6 = findViewById(R.id.titleLineShot);
        content6 = findViewById(R.id.contentSkyBall);
        title7 = findViewById(R.id.titleCutShot);
        content7 = findViewById(R.id.contentCutShot);
        title8 = findViewById(R.id.titleOpenHand);
        content8 = findViewById(R.id.contentOpenHand);

        content1.setVisibility(View.GONE);
        content2.setVisibility(View.GONE);
        content3.setVisibility(View.GONE);
        content4.setVisibility(View.GONE);
        content5.setVisibility(View.GONE);
        content6.setVisibility(View.GONE);
        content7.setVisibility(View.GONE);
        content8.setVisibility(View.GONE);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toFacilities = new Intent(BSHittingContainer. this, BS_BasicSkillsSection.class);
                startActivity(toFacilities);
                finish();
            }
        });

        title1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(content1.getVisibility() == View.GONE){
                    content1.setVisibility(View.VISIBLE);
                }
                else{
                    content1.setVisibility(View.GONE);
                }
            }
        });

        title2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(content2.getVisibility() == View.GONE){
                    content2.setVisibility(View.VISIBLE);
                }
                else{
                    content2.setVisibility(View.GONE);
                }
            }
        });

        title3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(content3.getVisibility() == View.GONE){
                    content3.setVisibility(View.VISIBLE);
                }
                else{
                    content3.setVisibility(View.GONE);
                }
            }
        });

        title4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(content4.getVisibility() == View.GONE){
                    content4.setVisibility(View.VISIBLE);
                }
                else{
                    content4.setVisibility(View.GONE);
                }
            }
        });

        title5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(content5.getVisibility() == View.GONE){
                    content5.setVisibility(View.VISIBLE);
                }
                else{
                    content5.setVisibility(View.GONE);
                }
            }
        });

        title6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(content6.getVisibility() == View.GONE){
                    content6.setVisibility(View.VISIBLE);
                }
                else{
                    content6.setVisibility(View.GONE);
                }
            }
        });

        title7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(content7.getVisibility() == View.GONE){
                    content7.setVisibility(View.VISIBLE);
                }
                else{
                    content7.setVisibility(View.GONE);
                }
            }
        });

        title8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(content8.getVisibility() == View.GONE){
                    content8.setVisibility(View.VISIBLE);
                }
                else{
                    content8.setVisibility(View.GONE);
                }
            }
        });

    }
}
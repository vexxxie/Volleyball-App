package com.example.volleyball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class BSServingContainer extends AppCompatActivity {
    private ImageButton imageButton;
    private Button title1, title2, title3, title4, title5, title6;
    private TextView content1, content2, content3, content4, content5, content6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_skill_serving_container);

        imageButton = findViewById(R.id.skillBackBtn);

        title1 = findViewById(R.id.titleUnderhandServe);
        content1 = findViewById(R.id.contentTheServe);
        title2 = findViewById(R.id.titleScoring);
        content2 = findViewById(R.id.contentScoring);
        title3 = findViewById(R.id.titleRotation);
        content3 = findViewById(R.id.contentFloatServe);
        title4 = findViewById(R.id.titlePlayingGame);
        content4 = findViewById(R.id.contentPlayingGame);
        title5 = findViewById(R.id.titleJumpServe);
        content5 = findViewById(R.id.contentJumpServe);
        title6 = findViewById(R.id.titleSkyBall);
        content6 = findViewById(R.id.contentSkyBall);

        content1.setVisibility(View.GONE);
        content2.setVisibility(View.GONE);
        content3.setVisibility(View.GONE);
        content4.setVisibility(View.GONE);
        content5.setVisibility(View.GONE);
        content6.setVisibility(View.GONE);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toFacilities = new Intent(BSServingContainer. this, BS_BasicSkillsSection.class);
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
    }
}
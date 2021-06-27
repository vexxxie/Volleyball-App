package com.example.volleyball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class R_RulesContainer extends AppCompatActivity {
    private ImageButton imageButton;
    private Button title1, title2, title3, title4, title5;
    private TextView content1, content2, content3, content4, content5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules_container);

        imageButton = findViewById(R.id.ruleBackBtn);

        title1 = findViewById(R.id.titleTheServe);
        content1 = findViewById(R.id.contentTheServe);
        title2 = findViewById(R.id.titleScoring);
        content2 = findViewById(R.id.contentScoring);
        title3 = findViewById(R.id.titleRotation);
        content3 = findViewById(R.id.contentRotation);
        title4 = findViewById(R.id.titlePlayingGame);
        content4 = findViewById(R.id.contentPlayingGame);
        title5 = findViewById(R.id.titleBasicViolations);
        content5 = findViewById(R.id.contentBasicViolations);

        content1.setVisibility(View.GONE);
        content2.setVisibility(View.GONE);
        content3.setVisibility(View.GONE);
        content4.setVisibility(View.GONE);
        content5.setVisibility(View.GONE);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toHome = new Intent(R_RulesContainer. this, HomeActivity.class);
                startActivity(toHome);
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
    }
}
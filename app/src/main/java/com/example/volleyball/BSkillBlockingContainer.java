package com.example.volleyball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class BSkillBlockingContainer extends AppCompatActivity {
    private ImageButton imageButton;
    private Button title1, title2;
    private TextView content1, content2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_skill_blocking_container);

        imageButton = findViewById(R.id.skillBackBtn);

        title1 = findViewById(R.id.titleUnderhandServe);
        content1 = findViewById(R.id.contentTheServe);
        title2 = findViewById(R.id.titleScoring);
        content2 = findViewById(R.id.contentScoring);

        content1.setVisibility(View.GONE);
        content2.setVisibility(View.GONE);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toFacilities = new Intent(BSkillBlockingContainer. this, BS_BasicSkillsSection.class);
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

    }
}
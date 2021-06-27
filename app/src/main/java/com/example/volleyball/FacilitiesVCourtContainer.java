package com.example.volleyball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class FacilitiesVCourtContainer extends AppCompatActivity {
    private ImageButton imageButton;
    private Button title1, title2, title3, title4;
    private TextView content1, content2, content3, content4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facilities_vcourt_container);

        imageButton = (ImageButton) findViewById(R.id.vCBackBtn);

        title1 = findViewById(R.id.titleCourt);
        content1 = findViewById(R.id.contentCourt);
        title2 = findViewById(R.id.titlePlayingArea);
        content2 = findViewById(R.id.contentPlayingArea);
        title3 = findViewById(R.id.titleDimensions);
        content3 = findViewById(R.id.contentDimensions);
        title4 = findViewById(R.id.titlePlayingSurface);
        content4 = findViewById(R.id.contentPlayingSurface);

        content1.setVisibility(View.GONE);
        content2.setVisibility(View.GONE);
        content3.setVisibility(View.GONE);
        content4.setVisibility(View.GONE);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toFacilitiesSection = new Intent(FacilitiesVCourtContainer. this, F_FacilitiesSection.class);
                startActivity(toFacilitiesSection);
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
    }
}
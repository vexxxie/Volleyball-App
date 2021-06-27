package com.example.volleyball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class OverviewEventsContainer extends AppCompatActivity {
    private ImageButton imageButton;
    private Button title1, title2, title3, title4, title5, title6, title7,
            title8, title9, title10, title11, title12, title13, title14;
    private TextView content1, content2, content3, content4, content5, content6, content7,
            content8, content9, content10, content11, content12, content13, content14;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overview_events_container);

        imageButton = (ImageButton) findViewById(R.id.eventsBackBtn);

        title1 = findViewById(R.id.event1);
        content1 = findViewById(R.id.contentTheServe);
        title2 = findViewById(R.id.event2);
        content2 = findViewById(R.id.contentScoring);
        title3 = findViewById(R.id.event3);
        content3 = findViewById(R.id.contentFloatServe);
        title4 = findViewById(R.id.event4);
        content4 = findViewById(R.id.contentPlayingGame);
        title5 = findViewById(R.id.event5);
        content5 = findViewById(R.id.contentJumpServe);
        title6 = findViewById(R.id.event6);
        content6 = findViewById(R.id.contentSkyBall);
        title7 = findViewById(R.id.event7);
        content7 = findViewById(R.id.contentCutShot);
        title8 = findViewById(R.id.event8);
        content8 = findViewById(R.id.contentOpenHand);
        title9 = findViewById(R.id.event9);
        content9 = findViewById(R.id.content9);
        title10 = findViewById(R.id.event10);
        content10 = findViewById(R.id.content10);
        title11 = findViewById(R.id.event11);
        content11 = findViewById(R.id.content11);
        title12 = findViewById(R.id.event12);
        content12 = findViewById(R.id.content12);
        title13 = findViewById(R.id.event13);
        content13 = findViewById(R.id.content13);
        title14 = findViewById(R.id.event14);
        content14 = findViewById(R.id.content14);

        content1.setVisibility(View.GONE);
        content2.setVisibility(View.GONE);
        content3.setVisibility(View.GONE);
        content4.setVisibility(View.GONE);
        content5.setVisibility(View.GONE);
        content6.setVisibility(View.GONE);
        content7.setVisibility(View.GONE);
        content8.setVisibility(View.GONE);
        content9.setVisibility(View.GONE);
        content10.setVisibility(View.GONE);
        content11.setVisibility(View.GONE);
        content12.setVisibility(View.GONE);
        content13.setVisibility(View.GONE);
        content14.setVisibility(View.GONE);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toOverviewSection = new Intent(OverviewEventsContainer.this, O_OverviewSection.class);
                startActivity(toOverviewSection);
                finish();
            }
        });

        title1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (content1.getVisibility() == View.GONE) {
                    content1.setVisibility(View.VISIBLE);
                } else {
                    content1.setVisibility(View.GONE);
                }
            }
        });

        title2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (content2.getVisibility() == View.GONE) {
                    content2.setVisibility(View.VISIBLE);
                } else {
                    content2.setVisibility(View.GONE);
                }
            }
        });

        title3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (content3.getVisibility() == View.GONE) {
                    content3.setVisibility(View.VISIBLE);
                } else {
                    content3.setVisibility(View.GONE);
                }
            }
        });

        title4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (content4.getVisibility() == View.GONE) {
                    content4.setVisibility(View.VISIBLE);
                } else {
                    content4.setVisibility(View.GONE);
                }
            }
        });

        title5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (content5.getVisibility() == View.GONE) {
                    content5.setVisibility(View.VISIBLE);
                } else {
                    content5.setVisibility(View.GONE);
                }
            }
        });

        title6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (content6.getVisibility() == View.GONE) {
                    content6.setVisibility(View.VISIBLE);
                } else {
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

        title9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(content9.getVisibility() == View.GONE){
                    content9.setVisibility(View.VISIBLE);
                }
                else{
                    content9.setVisibility(View.GONE);
                }
            }
        });

        title10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(content10.getVisibility() == View.GONE){
                    content10.setVisibility(View.VISIBLE);
                }
                else{
                    content10.setVisibility(View.GONE);
                }
            }
        });

        title11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(content11.getVisibility() == View.GONE){
                    content11.setVisibility(View.VISIBLE);
                }
                else{
                    content11.setVisibility(View.GONE);
                }
            }
        });

        title12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(content12.getVisibility() == View.GONE){
                    content12.setVisibility(View.VISIBLE);
                }
                else{
                    content12.setVisibility(View.GONE);
                }
            }
        });

        title13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(content13.getVisibility() == View.GONE){
                    content13.setVisibility(View.VISIBLE);
                }
                else{
                    content13.setVisibility(View.GONE);
                }
            }
        });

        title14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(content14.getVisibility() == View.GONE){
                    content14.setVisibility(View.VISIBLE);
                }
                else{
                    content14.setVisibility(View.GONE);
                }
            }
        });




    }
}
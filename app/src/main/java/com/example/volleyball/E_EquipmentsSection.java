package com.example.volleyball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class E_EquipmentsSection extends AppCompatActivity {
    private ImageButton imageButton;
    private Button ankleBtn, armBtn, bagBtn, ballBtn, ballHammockBtn, ballPumpBtn, cartBtn, clipboardBtn, elbowPadsBtn, fingerTapeBtn, floorTapeBtn,
                    jerseyBtn, kneePadBtn, penaltyCardBtn, polesBtn, recoveryGearBtn, rotationLocatorBtn, scoreCardBtn, servingMachineBtn, shoesBtn, waterBottleBtn;
    private LinearLayout linear1, linear2, linear3, linear4, linear5,linear6,linear7,linear8,linear9,linear10,linear11,linear12,linear13,linear14, linear15, linear16,linear17,
            linear18,linear19,linear20,linear21;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipments_section);

        imageButton = (ImageButton) findViewById(R.id.equipBackBtn);

        ankleBtn = (Button) findViewById(R.id.titleAnkle);
        linear1 = (LinearLayout) findViewById(R.id.contentAnkle);
        armBtn = (Button) findViewById(R.id.titleArm);
        linear2 = (LinearLayout) findViewById(R.id.contentArm);
        bagBtn = (Button) findViewById(R.id.titleBag);
        linear3 = (LinearLayout) findViewById(R.id.contentBag);
        ballBtn = (Button) findViewById(R.id.titleBall);
        linear4 = (LinearLayout) findViewById(R.id.contentBall);
        ballHammockBtn = (Button) findViewById(R.id.titleBallHammock);
        linear5 = (LinearLayout) findViewById(R.id.contentBallHammock);
        ballPumpBtn = (Button) findViewById(R.id.titleBallPump);
        linear6 = (LinearLayout) findViewById(R.id.contentBallPump);
        cartBtn = (Button) findViewById(R.id.titleCart);
        linear7 = (LinearLayout) findViewById(R.id.contentCart);
        clipboardBtn= (Button) findViewById(R.id.titleClipboard);
        linear8 = (LinearLayout) findViewById(R.id.contentClipboard);
        elbowPadsBtn = (Button) findViewById(R.id.titleElbowPads);
        linear9 = (LinearLayout) findViewById(R.id.contentElbowPads);
        fingerTapeBtn = (Button) findViewById(R.id.titleFingerTape);
        linear10 = (LinearLayout) findViewById(R.id.contentFingerTape);
        floorTapeBtn = (Button) findViewById(R.id.titleFloorTape);
        linear11 = (LinearLayout) findViewById(R.id.contentFloorTape);
        jerseyBtn = (Button) findViewById(R.id.titleJersey);
        linear12 = (LinearLayout) findViewById(R.id.contentJersey);
        kneePadBtn = (Button) findViewById(R.id.titleKneePad);
        linear13 = (LinearLayout) findViewById(R.id.contentKneePad);
        penaltyCardBtn = (Button) findViewById(R.id.titlePenaltyCard);
        linear14 = (LinearLayout) findViewById(R.id.contentPenaltyCard);
        polesBtn = (Button) findViewById(R.id.titlePoles);
        linear15 = (LinearLayout) findViewById(R.id.contentPoles);
        recoveryGearBtn = (Button) findViewById(R.id.titleRecoveryGear);
        linear16 = (LinearLayout) findViewById(R.id.contentRecoveryGear);
        rotationLocatorBtn = (Button) findViewById(R.id.titleRotationLocator);
        linear17 = (LinearLayout) findViewById(R.id.contentRotationLocator);
        scoreCardBtn = (Button) findViewById(R.id.titleScoreCard);
        linear18 = (LinearLayout) findViewById(R.id.contentScoreCard);
        servingMachineBtn = (Button) findViewById(R.id.titleServingMachines);
        linear19 = (LinearLayout) findViewById(R.id.contentServingMachines);
        shoesBtn = (Button) findViewById(R.id.titleShoes);
        linear20 = (LinearLayout) findViewById(R.id.contentShoes);
        waterBottleBtn = (Button) findViewById(R.id.titleWaterBottle);
        linear21 = (LinearLayout) findViewById(R.id.contentWaterBottle);


        linear1.setVisibility(View.GONE);
        linear2.setVisibility(View.GONE);
        linear3.setVisibility(View.GONE);
        linear4.setVisibility(View.GONE);
        linear5.setVisibility(View.GONE);
        linear6.setVisibility(View.GONE);
        linear7.setVisibility(View.GONE);
        linear8.setVisibility(View.GONE);
        linear9.setVisibility(View.GONE);
        linear10.setVisibility(View.GONE);
        linear11.setVisibility(View.GONE);
        linear12.setVisibility(View.GONE);
        linear13.setVisibility(View.GONE);
        linear14.setVisibility(View.GONE);
        linear15.setVisibility(View.GONE);
        linear16.setVisibility(View.GONE);
        linear17.setVisibility(View.GONE);
        linear18.setVisibility(View.GONE);
        linear19.setVisibility(View.GONE);
        linear20.setVisibility(View.GONE);
        linear21.setVisibility(View.GONE);


        //back to home activity
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toHome = new Intent(E_EquipmentsSection. this, HomeActivity.class);
                startActivity(toHome);
                finish();
            }
        });

        ankleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(linear1.getVisibility() == View.GONE){
                    linear1.setVisibility(View.VISIBLE);
                }
                else{
                    linear1.setVisibility(View.GONE);
                }
            }
        });

        armBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(linear2.getVisibility() == View.GONE){
                    linear2.setVisibility(View.VISIBLE);
                }
                else{
                    linear2.setVisibility(View.GONE);
                }
            }
        });

        bagBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(linear3.getVisibility() == View.GONE){
                    linear3.setVisibility(View.VISIBLE);
                }
                else{
                    linear3.setVisibility(View.GONE);
                }
            }
        });

        ballBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(linear4.getVisibility() == View.GONE){
                    linear4.setVisibility(View.VISIBLE);
                }
                else{
                    linear4.setVisibility(View.GONE);
                }
            }
        });

        ballHammockBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(linear5.getVisibility() == View.GONE){
                    linear5.setVisibility(View.VISIBLE);
                }
                else{
                    linear5.setVisibility(View.GONE);
                }
            }
        });

        ballPumpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(linear6.getVisibility() == View.GONE){
                    linear6.setVisibility(View.VISIBLE);
                }
                else{
                    linear6.setVisibility(View.GONE);
                }
            }
        });

        cartBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(linear7.getVisibility() == View.GONE){
                    linear7.setVisibility(View.VISIBLE);
                }
                else{
                    linear7.setVisibility(View.GONE);
                }
            }
        });

        clipboardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(linear8.getVisibility() == View.GONE){
                    linear8.setVisibility(View.VISIBLE);
                }
                else{
                    linear8.setVisibility(View.GONE);
                }
            }
        });

        elbowPadsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(linear9.getVisibility() == View.GONE){
                    linear9.setVisibility(View.VISIBLE);
                }
                else{
                    linear9.setVisibility(View.GONE);
                }
            }
        });

        fingerTapeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(linear10.getVisibility() == View.GONE){
                    linear10.setVisibility(View.VISIBLE);
                }
                else{
                    linear10.setVisibility(View.GONE);
                }
            }
        });

        floorTapeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(linear11.getVisibility() == View.GONE){
                    linear11.setVisibility(View.VISIBLE);
                }
                else{
                    linear11.setVisibility(View.GONE);
                }
            }
        });

        jerseyBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(linear12.getVisibility() == View.GONE){
                    linear12.setVisibility(View.VISIBLE);
                }
                else{
                    linear12.setVisibility(View.GONE);
                }
            }
        });

        kneePadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(linear13.getVisibility() == View.GONE){
                    linear13.setVisibility(View.VISIBLE);
                }
                else{
                    linear13.setVisibility(View.GONE);
                }
            }
        });

        penaltyCardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(linear14.getVisibility() == View.GONE){
                    linear14.setVisibility(View.VISIBLE);
                }
                else{
                    linear14.setVisibility(View.GONE);
                }
            }
        });

        polesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(linear15.getVisibility() == View.GONE){
                    linear15.setVisibility(View.VISIBLE);
                }
                else{
                    linear15.setVisibility(View.GONE);
                }
            }
        });

        recoveryGearBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(linear16.getVisibility() == View.GONE){
                    linear16.setVisibility(View.VISIBLE);
                }
                else{
                    linear16.setVisibility(View.GONE);
                }
            }
        });

        rotationLocatorBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(linear17.getVisibility() == View.GONE){
                    linear17.setVisibility(View.VISIBLE);
                }
                else{
                    linear17.setVisibility(View.GONE);
                }
            }
        });

        scoreCardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(linear18.getVisibility() == View.GONE){
                    linear18.setVisibility(View.VISIBLE);
                }
                else{
                    linear18.setVisibility(View.GONE);
                }
            }
        });

        servingMachineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(linear19.getVisibility() == View.GONE){
                    linear19.setVisibility(View.VISIBLE);
                }
                else{
                    linear19.setVisibility(View.GONE);
                }
            }
        });

        shoesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(linear20.getVisibility() == View.GONE){
                    linear20.setVisibility(View.VISIBLE);
                }
                else{
                    linear20.setVisibility(View.GONE);
                }
            }
        });

        waterBottleBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(linear21.getVisibility() == View.GONE){
                    linear21.setVisibility(View.VISIBLE);
                }
                else{
                    linear21.setVisibility(View.GONE);
                }
            }
        });

    }
}
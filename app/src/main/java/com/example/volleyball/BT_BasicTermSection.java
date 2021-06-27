package com.example.volleyball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BT_BasicTermSection extends AppCompatActivity {
    private ImageButton imageButton;
    private Button aceBtn, assistBtn, attackBtn, attackerBtn, attackBlockBtn, attackErrorBtn, attackLineBtn, brCourtBtn, brAttackBtn, backSetBtn, baselineBtn, blockBtn, blockingErrorBtn, centerLineBtn, closingBtn,
            coverBtn, crossCourtBtn, cutShotBtn, defenseBtn, dinkBtn, doubleBlockBtn, doubleHitBtn, downBallBtn, fiveOneBtn, floaterBtn, foreArmBtn, fourTwoBtn, freeBallBtn, gamePlanBtn, heldBallBtn, hitterBtn, hittingPercentageBtn,
            joustBtn, jumpServeBtn, keyPlayerBtn, killBtn, liberoBtn, lineUpBtn, lineServeBtn, lineShotBtn, loadBtn, middleBackBtn, middleBlockerBtn, mintonetteBtn, netHeightBtn, offBlockerBtn, offSpeedShotsBtn, outsideHitterBtn,
            overhandPassBtn, overhandServeBtn, passBtn, pancakeBtn, partyBallBtn, pipeBtn, playBtn, quickSetBtn, rallyScoringBtn, readyPositionBtn, redCardBtn, rotationBtn, seamBtn, serveBtn, setAttackBtn, spikeBtn, substitutionBtn,
            tandemBtn, threemeterLineBtn, toolBtn, touchBtn, transitionBtn, tripleBlockBtn, underhandServeBtn, wServeBtn, wipeBtn, yellowCardBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_terms_section);

        imageButton = (ImageButton) findViewById(R.id.btsBackBtn);

        aceBtn = (Button) findViewById(R.id.ace);
        assistBtn = (Button) findViewById(R.id.assist);
        attackBtn = (Button) findViewById(R.id.attack);
        attackerBtn = (Button) findViewById(R.id.attacker);
        attackBlockBtn = (Button) findViewById(R.id.attackBlock);
        attackErrorBtn = (Button) findViewById(R.id.attackError);
        attackLineBtn = (Button) findViewById(R.id.attackLine);
        brCourtBtn = (Button) findViewById(R.id.brCourt);
        brAttackBtn = (Button) findViewById(R.id.brAttack);
        backSetBtn = (Button) findViewById(R.id.backSet);
        baselineBtn = (Button) findViewById(R.id.baseline);
        blockBtn = (Button) findViewById(R.id.block);
        blockingErrorBtn = (Button) findViewById(R.id.blockingError);
        centerLineBtn = (Button) findViewById(R.id.centerLine);
        closingBtn = (Button) findViewById(R.id.closing);
        coverBtn = (Button) findViewById(R.id.cover);
        crossCourtBtn = (Button) findViewById(R.id.crossCourt);
        cutShotBtn = (Button) findViewById(R.id.cutShot);
        defenseBtn = (Button) findViewById(R.id.defense);
        dinkBtn = (Button) findViewById(R.id.dink);
        doubleBlockBtn = (Button) findViewById(R.id.doubleBlock);
        doubleHitBtn = (Button) findViewById(R.id.doubleHit);
        downBallBtn = (Button) findViewById(R.id.downBall);
        fiveOneBtn = (Button) findViewById(R.id.fiveOne);
        floaterBtn = (Button) findViewById(R.id.floater);
        foreArmBtn = (Button) findViewById(R.id.foreArm);
        fourTwoBtn = (Button) findViewById(R.id.fourTwo);
        freeBallBtn = (Button) findViewById(R.id.freeBall);
        gamePlanBtn = (Button) findViewById(R.id.gamePlan);
        heldBallBtn = (Button) findViewById(R.id.heldBall);
        hitterBtn = (Button) findViewById(R.id.hitter);
        hittingPercentageBtn = (Button) findViewById(R.id.hittingPercentage);
        joustBtn = (Button) findViewById(R.id.joust);
        jumpServeBtn = (Button) findViewById(R.id.jumpServe);
        keyPlayerBtn = (Button) findViewById(R.id.keyPlayer);
        killBtn = (Button) findViewById(R.id.kill);
        liberoBtn = (Button) findViewById(R.id.libero);
        lineUpBtn = (Button) findViewById(R.id.lineUp);
        lineServeBtn = (Button) findViewById(R.id.lineServe);
        lineShotBtn = (Button) findViewById(R.id.lineShot);
        loadBtn = (Button) findViewById(R.id.load);
        middleBackBtn = (Button) findViewById(R.id.middleBack);
        middleBlockerBtn = (Button) findViewById(R.id.middleBlocker);
        mintonetteBtn = (Button) findViewById(R.id.mintonette);
        netHeightBtn = (Button) findViewById(R.id.netHeight);
        offBlockerBtn =(Button) findViewById(R.id.offBlocker);
        offSpeedShotsBtn = (Button) findViewById(R.id.offSpeedShots);
        outsideHitterBtn = (Button) findViewById(R.id.outsideHitter);
        overhandPassBtn = (Button) findViewById(R.id.overhandPass);
        overhandServeBtn = (Button) findViewById(R.id.overhandServe);
        passBtn = (Button) findViewById(R.id.pass);
        pancakeBtn = (Button) findViewById(R.id.pancake);
        partyBallBtn = (Button) findViewById(R.id.partyBall);
        pipeBtn = (Button) findViewById(R.id.pipe);
        playBtn = (Button) findViewById(R.id.play);
        quickSetBtn = (Button) findViewById(R.id.quickSet);
        rallyScoringBtn = (Button) findViewById(R.id.rallyScoring);
        readyPositionBtn = (Button) findViewById(R.id.readyPosition);
        redCardBtn = (Button) findViewById(R.id.redCard);
        rotationBtn = (Button) findViewById(R.id.rotation);
        seamBtn = (Button) findViewById(R.id.seam);
        serveBtn = (Button) findViewById(R.id.serve);
        setAttackBtn = (Button) findViewById(R.id.setAttack);
        spikeBtn = (Button) findViewById(R.id.spike);
        substitutionBtn = (Button) findViewById(R.id.substitution);
        tandemBtn = (Button) findViewById(R.id.tandem);
        threemeterLineBtn = (Button) findViewById(R.id.threemeterLine);
        toolBtn = (Button) findViewById(R.id.tool);
        touchBtn = (Button) findViewById(R.id.touch);
        transitionBtn = (Button) findViewById(R.id.transition);
        tripleBlockBtn = (Button) findViewById(R.id.tripleBlock);
        underhandServeBtn = (Button) findViewById(R.id.underhandServe);
        wServeBtn = (Button) findViewById(R.id.wServe);
        wipeBtn = (Button) findViewById(R.id.wipe);
        yellowCardBtn = (Button) findViewById(R.id.yellowCard);

        //back to home activity
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toHome = new Intent(BT_BasicTermSection. this, HomeActivity.class);
                startActivity(toHome);
                finish();
            }
        });


        aceBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term1));

                toContainer.putExtra("Definition", getText(R.string.term1_definition));
                startActivity(toContainer);
                finish();

            }
        });

        assistBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term2));

                toContainer.putExtra("Definition", getText(R.string.term2_definition));
                startActivity(toContainer);
                finish();
            }
        });

        attackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term3));

                toContainer.putExtra("Definition", getText(R.string.term3_definition));
                startActivity(toContainer);
                finish();
            }
        });

        attackerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term4));

                toContainer.putExtra("Definition", getText(R.string.term4_definition));
                startActivity(toContainer);
                finish();
            }
        });

        attackBlockBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term5));

                toContainer.putExtra("Definition", getText(R.string.term5_definition));
                startActivity(toContainer);
                finish();
            }
        });

        attackErrorBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term6));

                toContainer.putExtra("Definition", getText(R.string.term6_definition));
                startActivity(toContainer);
                finish();
            }
        });

        attackLineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term7));

                toContainer.putExtra("Definition", getText(R.string.term7_definition));
                startActivity(toContainer);
                finish();
            }
        });

        brCourtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term8));

                toContainer.putExtra("Definition", getText(R.string.term8_definition));
                startActivity(toContainer);
                finish();
            }
        });

        brAttackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term9));

                toContainer.putExtra("Definition", getText(R.string.term9_definition));
                startActivity(toContainer);
                finish();
            }
        });

        backSetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term10));

                toContainer.putExtra("Definition", getText(R.string.term10_definition));
                startActivity(toContainer);
                finish();
            }
        });

        baselineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term11));

                toContainer.putExtra("Definition", getText(R.string.term11_definition));
                startActivity(toContainer);
                finish();
            }
        });

        blockBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term12));

                toContainer.putExtra("Definition", getText(R.string.term12_definition));
                startActivity(toContainer);
                finish();
            }
        });

        blockingErrorBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term13));

                toContainer.putExtra("Definition", getText(R.string.term13_definition));
                startActivity(toContainer);
                finish();
            }
        });

        centerLineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term14));

                toContainer.putExtra("Definition", getText(R.string.term14_definition));
                startActivity(toContainer);
                finish();
            }
        });

        closingBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term15));

                toContainer.putExtra("Definition", getText(R.string.term15_definition));
                startActivity(toContainer);
                finish();
            }
        });

        coverBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term16));

                toContainer.putExtra("Definition", getText(R.string.term16_definition));
                startActivity(toContainer);
                finish();
            }
        });

        crossCourtBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term17));

                toContainer.putExtra("Definition", getText(R.string.term17_definition));
                startActivity(toContainer);
                finish();
            }
        });

        cutShotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term18));

                toContainer.putExtra("Definition", getText(R.string.term18_definition));
                startActivity(toContainer);
                finish();
            }
        });

        defenseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term19));

                toContainer.putExtra("Definition", getText(R.string.term19_definition));
                startActivity(toContainer);
                finish();
            }
        });

        dinkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term20));

                toContainer.putExtra("Definition", getText(R.string.term20_definition));
                startActivity(toContainer);
                finish();
            }
        });

        doubleBlockBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term21));

                toContainer.putExtra("Definition", getText(R.string.term21_definition));
                startActivity(toContainer);
                finish();
            }
        });

        doubleHitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term22));

                toContainer.putExtra("Definition", getText(R.string.term22_definition));
                startActivity(toContainer);
                finish();
            }
        });

        downBallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term23));

                toContainer.putExtra("Definition", getText(R.string.term23_definition));
                startActivity(toContainer);
                finish();
            }
        });

        fiveOneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term24));

                toContainer.putExtra("Definition", getText(R.string.term24_definition));
                startActivity(toContainer);
                finish();
            }
        });

        floaterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term25));

                toContainer.putExtra("Definition", getText(R.string.term25_definition));
                startActivity(toContainer);
                finish();
            }
        });

       foreArmBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term26));

                toContainer.putExtra("Definition", getText(R.string.term26_definition));
                startActivity(toContainer);
                finish();
            }
        });

        fourTwoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term27));

                toContainer.putExtra("Definition", getText(R.string.term27_definition));
                startActivity(toContainer);
                finish();
            }
        });

        freeBallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term28));

                toContainer.putExtra("Definition", getText(R.string.term28_definition));
                startActivity(toContainer);
                finish();
            }
        });

        gamePlanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term29));

                toContainer.putExtra("Definition", getText(R.string.term29_definition));
                startActivity(toContainer);
                finish();
            }
        });

        heldBallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term30));

                toContainer.putExtra("Definition", getText(R.string.term30_definition));
                startActivity(toContainer);
                finish();
            }
        });

        hitterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term31));

                toContainer.putExtra("Definition", getText(R.string.term31_definition));
                startActivity(toContainer);
                finish();
            }
        });

        hittingPercentageBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term32));

                toContainer.putExtra("Definition", getText(R.string.term32_definition));
                startActivity(toContainer);
                finish();
            }
        });

        joustBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term33));

                toContainer.putExtra("Definition", getText(R.string.term33_definition));
                startActivity(toContainer);
                finish();
            }
        });

        jumpServeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term34));

                toContainer.putExtra("Definition", getText(R.string.term34_definition));
                startActivity(toContainer);
                finish();
            }
        });

        keyPlayerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term35));

                toContainer.putExtra("Definition", getText(R.string.term35_definition));
                startActivity(toContainer);
                finish();
            }
        });

        killBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term36));

                toContainer.putExtra("Definition", getText(R.string.term36_definition));
                startActivity(toContainer);
                finish();
            }
        });

        liberoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term37));

                toContainer.putExtra("Definition", getText(R.string.term37_definition));
                startActivity(toContainer);
                finish();
            }
        });

        lineUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term38));

                toContainer.putExtra("Definition", getText(R.string.term38_definition));
                startActivity(toContainer);
                finish();
            }
        });

        lineServeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term39));

                toContainer.putExtra("Definition", getText(R.string.term39_definition));
                startActivity(toContainer);
                finish();
            }
        });

        lineShotBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term40));

                toContainer.putExtra("Definition", getText(R.string.term40_definition));
                startActivity(toContainer);
                finish();
            }
        });

        loadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term41));

                toContainer.putExtra("Definition", getText(R.string.term41_definition));
                startActivity(toContainer);
                finish();
            }
        });

        middleBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term42));

                toContainer.putExtra("Definition", getText(R.string.term42_definition));
                startActivity(toContainer);
                finish();
            }
        });

        middleBlockerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term43));

                toContainer.putExtra("Definition", getText(R.string.term43_definition));
                startActivity(toContainer);
                finish();
            }
        });

        mintonetteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term44));

                toContainer.putExtra("Definition", getText(R.string.term44_definition));
                startActivity(toContainer);
                finish();
            }
        });

        netHeightBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term45));

                toContainer.putExtra("Definition", getText(R.string.term45_definition));
                startActivity(toContainer);
                finish();
            }
        });

        offBlockerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term46));

                toContainer.putExtra("Definition", getText(R.string.term46_definition));
                startActivity(toContainer);
                finish();
            }
        });

        offSpeedShotsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term47));

                toContainer.putExtra("Definition", getText(R.string.term47_definition));
                startActivity(toContainer);
                finish();
            }
        });

        outsideHitterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term48));

                toContainer.putExtra("Definition", getText(R.string.term48_definition));
                startActivity(toContainer);
                finish();
            }
        });

        overhandPassBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term49));

                toContainer.putExtra("Definition", getText(R.string.term49_definition));
                startActivity(toContainer);
                finish();
            }
        });

        overhandServeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term50));

                toContainer.putExtra("Definition", getText(R.string.term50_definition));
                startActivity(toContainer);
                finish();
            }
        });

        passBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term51));

                toContainer.putExtra("Definition", getText(R.string.term51_definition));
                startActivity(toContainer);
                finish();
            }
        });

        pancakeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term52));

                toContainer.putExtra("Definition", getText(R.string.term52_definition));
                startActivity(toContainer);
                finish();
            }
        });

        partyBallBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term53));

                toContainer.putExtra("Definition", getText(R.string.term53_definition));
                startActivity(toContainer);
                finish();
            }
        });

        pipeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term54));

                toContainer.putExtra("Definition", getText(R.string.term54_definition));
                startActivity(toContainer);
                finish();
            }
        });

        playBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term55));

                toContainer.putExtra("Definition", getText(R.string.term55_definition));
                startActivity(toContainer);
                finish();
            }
        });

        quickSetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term56));

                toContainer.putExtra("Definition", getText(R.string.term56_definition));
                startActivity(toContainer);
                finish();
            }
        });

        rallyScoringBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term57));

                toContainer.putExtra("Definition", getText(R.string.term57_definition));
                startActivity(toContainer);
                finish();
            }
        });

        readyPositionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term58));

                toContainer.putExtra("Definition", getText(R.string.term58_definition));
                startActivity(toContainer);
                finish();
            }
        });

        redCardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term59));

                toContainer.putExtra("Definition", getText(R.string.term59_definition));
                startActivity(toContainer);
                finish();
            }
        });

        rotationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term60));

                toContainer.putExtra("Definition", getText(R.string.term60_definition));
                startActivity(toContainer);
                finish();
            }
        });

        seamBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term61));

                toContainer.putExtra("Definition", getText(R.string.term61_definition));
                startActivity(toContainer);
                finish();
            }
        });

        serveBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term62));

                toContainer.putExtra("Definition", getText(R.string.term62_definition));
                startActivity(toContainer);
                finish();
            }
        });

        setAttackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term63));

                toContainer.putExtra("Definition", getText(R.string.term63_definition));
                startActivity(toContainer);
                finish();
            }
        });

        spikeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term64));

                toContainer.putExtra("Definition", getText(R.string.term64_definition));
                startActivity(toContainer);
                finish();
            }
        });

        substitutionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term65));

                toContainer.putExtra("Definition", getText(R.string.term65_definition));
                startActivity(toContainer);
                finish();
            }
        });

        tandemBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term66));

                toContainer.putExtra("Definition", getText(R.string.term66_definition));
                startActivity(toContainer);
                finish();
            }
        });

        threemeterLineBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term67));

                toContainer.putExtra("Definition", getText(R.string.term67_definition));
                startActivity(toContainer);
                finish();
            }
        });

        toolBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term68));

                toContainer.putExtra("Definition", getText(R.string.term68_definition));
                startActivity(toContainer);
                finish();
            }
        });

        touchBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term69));

                toContainer.putExtra("Definition", getText(R.string.term69_definition));
                startActivity(toContainer);
                finish();
            }
        });

        transitionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term70));

                toContainer.putExtra("Definition", getText(R.string.term70_definition));
                startActivity(toContainer);
                finish();
            }
        });

        tripleBlockBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term71));

                toContainer.putExtra("Definition", getText(R.string.term71_definition));
                startActivity(toContainer);
                finish();
            }
        });

        underhandServeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term72));

                toContainer.putExtra("Definition", getText(R.string.term72_definition));
                startActivity(toContainer);
                finish();
            }
        });

        wipeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term73));

                toContainer.putExtra("Definition", getText(R.string.term73_definition));
                startActivity(toContainer);
                finish();
            }
        });

        wServeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term74));

                toContainer.putExtra("Definition", getText(R.string.term74_definition));
                startActivity(toContainer);
                finish();
            }
        });

        yellowCardBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toContainer = new Intent(BT_BasicTermSection. this, BTTermContainer.class);
                toContainer.putExtra("Term",getText(R.string.term75));

                toContainer.putExtra("Definition", getText(R.string.term75_definition));
                startActivity(toContainer);
                finish();
            }
        });

    }
}
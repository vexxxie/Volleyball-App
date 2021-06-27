package com.example.volleyball;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BTTermContainer extends AppCompatActivity {
    private TextView termContainer, definitionContainer;
    private Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_terms_container);

        termContainer = (TextView) findViewById(R.id.term);
        definitionContainer = (TextView) findViewById(R.id.definition);
        backBtn = (Button) findViewById(R.id.btBackBtn);

        //back to BT_BasicTermSection
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toTermSection = new Intent(BTTermContainer. this, BT_BasicTermSection.class);
                startActivity(toTermSection);
                finish();

            }
        });

        Intent getTermAndDefinition = getIntent();
        String getTerm = getTermAndDefinition.getStringExtra("Term");
        String getDefinition = getTermAndDefinition.getStringExtra("Definition");

        termContainer.setText(getTerm);
        definitionContainer.setText(getDefinition);


    }
}
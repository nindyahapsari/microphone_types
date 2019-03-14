package com.nindyahapsari.micropocket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailsActivity extends AppCompatActivity {

    Button micro1, micro2, micro3, micro4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        micro1 = (Button) findViewById(R.id.btn_micro_1);
        micro2 = (Button) findViewById(R.id.btn_micro_2);
        micro3 = (Button) findViewById(R.id.btn_micro_3);
        micro4 = (Button) findViewById(R.id.btn_micro_4);


        micro1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetailsActivity.this, FirstMicroActivity.class);
                startActivity(intent);
            }
        });

    }
}

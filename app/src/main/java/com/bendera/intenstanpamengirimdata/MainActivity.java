package com.bendera.intenstanpamengirimdata;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView goRide = (ImageView)
                findViewById(R.id.goride);
        ImageView goFood = (ImageView)
                findViewById(R.id.gofood);

        goRide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GoRide.class);
                startActivity(intent);
            }
        }
        );
        goFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, GoFood.class);
                startActivity(intent);
            }
        });

    }
}

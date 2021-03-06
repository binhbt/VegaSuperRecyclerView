package com.malinskiy.superrecyclerview.sample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.malinskiy.superrecyclerview.sample.sectioned.HomeActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chooser);

        findViewById(R.id.button_list_sample).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VegaListVerticalActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.button_list_sample_horizontal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VegaListHorizontalActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.button_grid_horizontal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VegaGridHorizontalActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.button_grid_sample).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VegaGridVerticalActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.button_staggered_sample).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VegaStaggedVerticalActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.button_stagged_grid_horizontal).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VegaStaggedHorizontalActivity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.button_swipe_sample).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VegaSwipeActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.button_header_sample).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, VegaHeaderAdapterActivity.class);
                startActivity(intent);
            }
        });

        findViewById(R.id.button_sectioned).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });
    }
}

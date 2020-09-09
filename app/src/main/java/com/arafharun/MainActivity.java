package com.arafharun;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView alphabet_page;
    private ImageView colours_page;
    private ImageView numbers_page;
    private ImageView nurseries_page;
    private ImageView shapes_page;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        alphabet_page = (ImageView) findViewById(R.id.alphabets);
        alphabet_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAlpha();
            }
        });

        numbers_page = (ImageView) findViewById(R.id.numbers);
        numbers_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNum();
            }
        });

        nurseries_page = (ImageView) findViewById(R.id.nurseries);
        nurseries_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNurseries();
            }
        });

        shapes_page = (ImageView) findViewById(R.id.shapes);
        shapes_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openShapes();
            }
        });

        colours_page = (ImageView) findViewById(R.id.colors);
        colours_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openColours();
            }
        });
    }
    public void openNum() {
        Intent intent = new Intent(this, Number.class);
        startActivity(intent);
    }
    public void openNurseries() {
        Intent intent = new Intent(this, Nurseries.class);
        startActivity(intent);
    }

    public void openShapes() {
        Intent intent = new Intent(this, Shapes.class);
        startActivity(intent);
    }

    public void openColours() {
        Intent intent = new Intent(this, Colours.class);
        startActivity(intent);
    }

    public void openAlpha() {
        Intent intent = new Intent(this, Alphabets.class);
        startActivity(intent);
    }



}
package com.MSI.Helper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;


public class selectionPage extends AppCompatActivity {

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selection_page);

        LinearLayout ld1 = findViewById(R.id.ld1);
        LinearLayout ld2 = findViewById(R.id.ld2);
        LinearLayout ld3 = findViewById(R.id.ld3);
        LinearLayout ld4 = findViewById(R.id.ld4);
        LinearLayout ld5 = findViewById(R.id.ld5);
        LinearLayout ld6 = findViewById(R.id.ld6);
        LinearLayout ld7 = findViewById(R.id.ld7);
        LinearLayout ld8 = findViewById(R.id.ld8);
        LinearLayout ld9 = findViewById(R.id.ld9);
        LinearLayout ld10 = findViewById(R.id.ld10);

        TextView txt1 = findViewById(R.id.txt1);
        TextView txt2 = findViewById(R.id.txt2);


        ld1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Intent intent1 = new Intent(selectionPage.this , firstlink.class);
                startActivity(intent1);
            }
        });
        ld2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                Intent intent2 = new Intent(selectionPage.this , secondlink.class);
                startActivity(intent2);
            }
        });
        ld3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view3) {
                Intent intent3 = new Intent(selectionPage.this , thirdlink.class);
                startActivity(intent3);
            }
        });
        ld4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view4) {
                Intent intent4 = new Intent(selectionPage.this , fourthlink.class);
                startActivity(intent4);
            }
        });
        ld5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view5) {
                Intent intent5 = new Intent(selectionPage.this , fifthlink.class);
                startActivity(intent5);
            }
        });
        ld6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view6) {
                Intent intent6 = new Intent(selectionPage.this , sixthlink.class);
                startActivity(intent6);
            }
        });
        ld7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view7) {
                Intent intent7 = new Intent(selectionPage.this , seventhlink.class);
                startActivity(intent7);
            }
        });
        ld8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view8) {
                Intent intent8 = new Intent(selectionPage.this , eighthlink.class);
                startActivity(intent8);
            }
        });
        ld9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view9) {
                Intent intent9 = new Intent(selectionPage.this , ninthlink.class);
                startActivity(intent9);
            }
        });
        ld10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view10) {
                Intent intent10 = new Intent(selectionPage.this , tenthlink.class);
                startActivity(intent10);
            }
        });
        txt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view11) {
                Intent txt = new Intent(selectionPage.this , selectionPage.class);
                startActivity(txt);
            }
        });
        txt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view12) {
                Intent tzt = new Intent(selectionPage.this , selectionPage.class);
                startActivity(tzt);
            }
        });

    }

}

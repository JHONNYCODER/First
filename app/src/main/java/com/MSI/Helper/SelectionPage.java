package com.MSI.Helper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import memes.MemesActivity;


public class SelectionPage extends AppCompatActivity {

    FirebaseAuth mAuth;
    SharedPreferences sharedPreferences ;

    private static final String SHARED_PREF_NAME = "mypref";
    private static final String KEY_NAME = "name";

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


        TextView log  = findViewById(R.id.log);
        TextView team = findViewById(R.id.team);

        mAuth=FirebaseAuth.getInstance(); //get user details
        sharedPreferences = getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
        ld1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view1) {
                Intent intent1 = new Intent(SelectionPage.this , firstlink.class);
                startActivity(intent1);
            }
        });
        ld2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view2) {
                Intent intent2 = new Intent(SelectionPage.this , secondlink.class);
                startActivity(intent2);
            }
        });
        ld3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view3) {
                Intent intent3 = new Intent(SelectionPage.this , thirdlink.class);
                startActivity(intent3);
            }
        });
        ld4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view4) {
                Intent intent4 = new Intent(SelectionPage.this , fourthlink.class);
                startActivity(intent4);
            }
        });
        ld5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view5) {
                Intent intent5 = new Intent(SelectionPage.this , fifthlink.class);
                startActivity(intent5);
            }
        });
        ld6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view6) {
                Intent intent6 = new Intent(SelectionPage.this , sixthlink.class);
                startActivity(intent6);
            }
        });
        ld7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view7) {
                Intent intent7 = new Intent(SelectionPage.this , seventhlink.class);
                startActivity(intent7);
            }
        });
        ld8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view8) {
                Intent intent8 = new Intent(SelectionPage.this , eighthlink.class);
                startActivity(intent8);
            }
        });
        ld9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view9) {
                Intent intent9 = new Intent(SelectionPage.this , MemesActivity.class);
                startActivity(intent9);
            }
        });
        team.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view12) {
                Intent tzt = new Intent(SelectionPage.this , TeamMates.class);
                startActivity(tzt);
            }
        });
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mAuth.signOut();                                            //logout (firebase)
                sharedPreferences = getSharedPreferences(SHARED_PREF_NAME,MODE_PRIVATE);
                Boolean name = sharedPreferences.getBoolean(KEY_NAME,false);

                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    editor.putBoolean(KEY_NAME,false);
                    editor.apply();
                    finish();
                Toast.makeText(SelectionPage.this, "Logged Out",Toast.LENGTH_SHORT).show();


                Intent intent=new Intent(SelectionPage.this, LoginPage.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK |Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });

    }

}

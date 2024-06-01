package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.airbnb.lottie.LottieAnimationView;

public class semestermarks extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_semestermarks);
        TextView heading;
        LottieAnimationView y20_11,y20_12,y20_21,y20_22,y20_31,y20_32,y20_41,y20_42,y20_total,back;
        String y1_1,y1_2,y2_1,y2_2,y3_1,y3_2,y4_1,y4_2,total,gettingheading;
        y1_1=getIntent().getStringExtra("1_1");
        y1_2=getIntent().getStringExtra("1_2");
        y2_1=getIntent().getStringExtra("2_1");
        y2_2=getIntent().getStringExtra("2_2");
        y3_1=getIntent().getStringExtra("3_1");
        y3_2=getIntent().getStringExtra("3_2");
        y4_1=getIntent().getStringExtra("4_1");
        y4_2=getIntent().getStringExtra("4_2");
        total=getIntent().getStringExtra("total");
        gettingheading=getIntent().getStringExtra("headingset");
        y20_11=findViewById(R.id.y20_11);
        y20_12=findViewById(R.id.y20_12);
        y20_21=findViewById(R.id.y20_21);
        y20_22=findViewById(R.id.y20_22);
        y20_31=findViewById(R.id.y20_31);
        y20_32=findViewById(R.id.y20_32);
        y20_41=findViewById(R.id.y20_41);
        y20_42=findViewById(R.id.y20_42);
        y20_total=findViewById(R.id.y20_total);
        back=findViewById(R.id.backanimationbutton);
        heading=findViewById(R.id.resultsheading);
        heading.setText(gettingheading);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backint=new Intent(semestermarks.this, branchresults.class);
                startActivity(backint);
                finish();
            }
        });
        y20_11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(y1_1.isEmpty()){
                    Toast.makeText(semestermarks.this, "Not Released yet", Toast.LENGTH_SHORT).show();
                }
                else {
                    gotoUrl(y1_1);
                }
            }
        });
        y20_12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(y1_2.isEmpty()){
                    Toast.makeText(semestermarks.this, "Not Released yet", Toast.LENGTH_SHORT).show();
                }
                else {
                    gotoUrl(y1_2);
                }
            }
        });
        y20_21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(y2_1.isEmpty()){
                    Toast.makeText(semestermarks.this, "Not Released yet", Toast.LENGTH_SHORT).show();
                }
                else {
                    gotoUrl(y2_1);
                }
            }
        });
        y20_22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(y2_2.isEmpty()){
                    Toast.makeText(semestermarks.this, "Not Released yet", Toast.LENGTH_SHORT).show();
                }
                else {
                    gotoUrl(y2_2);
                }
            }
        });
        y20_31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(y3_1.isEmpty()){
                    Toast.makeText(semestermarks.this, "Not Released yet", Toast.LENGTH_SHORT).show();
                }
                else {
                    gotoUrl(y3_1);
                }
            }
        });
        y20_32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(y3_2.isEmpty()){
                    Toast.makeText(semestermarks.this, "Not Released yet", Toast.LENGTH_SHORT).show();
                }
                else {
                    gotoUrl(y3_2);
                }
            }
        });
        y20_41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(y4_1.isEmpty()){
                    Toast.makeText(semestermarks.this,"Not Released yet",Toast.LENGTH_SHORT).show();
                }
                else {
                    gotoUrl(y4_1);
                }
            }
        });
        y20_42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(y4_2.isEmpty()){
                    Toast.makeText(semestermarks.this,"Not Released yet",Toast.LENGTH_SHORT).show();
                }
                else {
                    gotoUrl(y4_2);
                }
            }
        });
        y20_total.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(total.isEmpty())
                {
                    Toast.makeText(semestermarks.this, "not Released yet", Toast.LENGTH_SHORT).show();
                }
                else {
                    gotoUrl(total);
                }
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

    }

    private void gotoUrl(String url) {
        Uri uri= Uri.parse(url);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
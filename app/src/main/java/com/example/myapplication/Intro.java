package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public class Intro extends AppCompatActivity implements SwipeRefreshLayout.OnRefreshListener{
    EditText aat1,aat2,mid1,mid2;
    SwipeRefreshLayout refresh;
    Button button,back;
    TextView results,grade;
    double a1=0,a2=0,m1=0,m2=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_intro);
        aat1=(EditText) findViewById(R.id.aat1);
        aat2=(EditText) findViewById(R.id.aat2);
        mid1=(EditText) findViewById(R.id.mid1);
        mid2=(EditText) findViewById(R.id.mid2);
        button =(Button) findViewById(R.id.button);
        results=(TextView) findViewById(R.id.results);
        grade=(TextView)findViewById(R.id.status);
        back =(Button) findViewById(R.id.backmovebutton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Intro.this,homepage.class);
                startActivity(intent);
                finish();
            }
        });
//        refresh.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(Intro.this,Intro.class);
//                startActivity(intent);
//                finish();
//            }
//        });
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!aat1.getText().toString().isEmpty())
                    a1=Double.parseDouble(aat1.getText().toString());
                if(!aat2.getText().toString().isEmpty())
                    a2=Double.parseDouble(aat2.getText().toString());
                if(!mid1.getText().toString().isEmpty())
                    m1=Double.parseDouble(mid1.getText().toString());
                if(!mid2.getText().toString().isEmpty())
                    m2=Double.parseDouble(mid2.getText().toString());
                double a=(a1+a2)/2;
                double b=Math.max(m1,m2);
                double c=Math.min(m1,m2);
                double finalval;
                b=3*b/7;
                c=c/7;
                finalval=Math.ceil(a+b+c);
                if(finalval>=15)
                {
                    results.setText("Marks="+finalval);
                    grade.setText("Status=Pass");
                }
                else {
                    results.setText("Marks="+finalval);
                    grade.setText("Status=Fail");
                }

            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    public void onRefresh() {

    }
}
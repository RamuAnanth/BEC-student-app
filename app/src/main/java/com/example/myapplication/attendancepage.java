package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class attendancepage extends AppCompatActivity {
double per;
int total,attend;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_attendancepage);
        EditText totalcount,attendecount,percentreqquire;
        TextView response;
        Button submit,back;
        totalcount=findViewById(R.id.totalcount);
        attendecount=findViewById(R.id.attendedcount);
        percentreqquire=findViewById(R.id.percentreq);
        response=findViewById(R.id.attendenceresult);
        submit=findViewById(R.id.attendsubmit);
        back=findViewById(R.id.backbutton);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(attendancepage.this, homepage.class);
                startActivity(intent);
                finish();
            }
        });
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    total = Integer.parseInt(totalcount.getText().toString());
                    attend = Integer.parseInt(attendecount.getText().toString());
                    per = Double.parseDouble(percentreqquire.getText().toString());

                    if (total <= 0 || attend < 0 || per <= 0) {
                        response.setText("Please enter valid fields above 👆");
                    } else if (attend > total) {
                        response.setText("Attended periods cannot be more than total periods.");
                    } else {
                        int initialAttend = attend;
                        int initialTotal = total;
                        while (true) {
                            double currentPercentage = (double) attend / total * 100;
                            if (currentPercentage >= per) {
                                response.setText("You need to attend " + (attend - initialAttend) + " more periods to reach " + per + "% attendance.");
                                break;
                            } else {
                                attend++;
                                total++;
                            }
                        }
                    }
                } catch (NumberFormatException e) {
                    response.setText("Please enter valid numbers in all fields 👆.");
                }
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewParent;
import android.widget.ArrayAdapter;
import android.widget.*;
import android.view.View;
import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;

public class homepage extends AppCompatActivity {
    Button logout,aboutpage,menu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_homepage);
        FirebaseMessaging.getInstance().getToken().addOnCompleteListener(new OnCompleteListener<String>() {
            @Override
            public void onComplete(@NonNull Task<String> task) {
                if(task.isSuccessful())
                {
                    if(!task.isSuccessful()){
                        Log.e("TokenDetails","Token Failed to recive");
                        return;
                    }
                    String token=task.getResult();
                    Log.d("Token",token);
                }
            }
        });
        logout=findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(homepage.this,signinpage.class));
                finish();
            }
        });
        menu=findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopupMenu(v);
            }
        });
        aboutpage=findViewById(R.id.about);
        aboutpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(homepage.this,about.class);
                startActivity(intent);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void showPopupMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        popupMenu.inflate(R.menu.popup_menu);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Intent attendancecal=new Intent(homepage.this,attendancepage.class);
                Intent internalcal=new Intent(homepage.this,Intro.class);
                Intent intent=new Intent(homepage.this,supportpage.class);
                Intent signin=new Intent(homepage.this, signinpage.class);
                Intent signup=new Intent(homepage.this, signuppage.class);
                Intent semmarks=new Intent(homepage.this,branchresults.class);
                int itemId = item.getItemId();
                if (itemId == R.id.item1) {
                    startActivity(internalcal);
                    finish();
                    return true;
                } else if (itemId == R.id.item2) {
                    startActivity(attendancecal);
                    finish();
                    return true;
                } else if (itemId == R.id.item3) {
                    startActivity(semmarks);
                    finish();
                    return true;
                } else if (itemId == R.id.item4) {
//                    startActivity(signin);
//                    finish();
                    Toast.makeText(homepage.this, "Not Build at", Toast.LENGTH_SHORT).show();
                    return true;
                } else if (itemId== R.id.item5) {
//                    startActivity(signup);
//                    finish();
                    Toast.makeText(homepage.this, "Not Build at", Toast.LENGTH_SHORT).show();
                    return true;
                }
                else if(itemId== R.id.item6){
                    startActivity(intent);
                    finish();
                    return true;
                }

                else{
                    return false;
                }
            }
        });
        popupMenu.show();
    }
}
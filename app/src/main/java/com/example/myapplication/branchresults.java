package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class branchresults extends AppCompatActivity {
    Spinner branch,registraion;
    Button rsubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_branchresults);
        registraion=findViewById(R.id.regulation);
        branch=findViewById(R.id.branch);
        rsubmit=findViewById(R.id.resultssubmitbutton);
        ArrayAdapter<CharSequence> reg=ArrayAdapter.createFromResource(this,R.array.regulation,android.R.layout.simple_spinner_item);
        reg.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        registraion.setAdapter(reg);
        ArrayAdapter<CharSequence> bra=ArrayAdapter.createFromResource(this,R.array.branch,android.R.layout.simple_spinner_item);
        bra.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        branch.setAdapter(bra);
        rsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String regster=registraion.getSelectedItem().toString();
                String branchs=branch.getSelectedItem().toString();
                if((regster.equals("Y20/L21")||regster.equals("Y21/L22"))&&(branchs.equals("AIML"))) {
                    Toast.makeText(branchresults.this, "There is no such branch in the given year.Please choose the correct branch.",Toast.LENGTH_SHORT).show();

                } else if ((regster.equals("Y10")||regster.equals("Y11")||regster.equals("Y12")||regster.equals("Y13")||regster.equals("Y14")||regster.equals("Y15")||regster.equals("Y16")||regster.equals("Y17")||regster.equals("Y18")||regster.equals("Y19"))&&(branchs.equals("AIML")||branchs.equals("CB")||branchs.equals("DS"))) {
                    Toast.makeText(branchresults.this,"There is no such branch in the given year. Please choose the correct branch",Toast.LENGTH_SHORT).show();
                } else if (regster.equals("Y23/L24")&&branchs.equals("EIE")) {
                    Toast.makeText(branchresults.this,"There is no such branch in the given year. Please choose the correct branch",Toast.LENGTH_SHORT).show();

                } else if(regster.equals("Y10")||regster.equals("Y11")||regster.equals("Y12")||regster.equals("Y13")||regster.equals("Y14")||regster.equals("Y15")||regster.equals("Y16")||regster.equals("Y17")){
                    Intent intenty10_y17=new Intent(branchresults.this, semestermarks.class);
                    intenty10_y17.putExtra("1_1","http://becbapatla.ac.in:8080/STUDENTINFO/index.html");
                    intenty10_y17.putExtra("1_2","http://becbapatla.ac.in:8080/STUDENTINFO/index.html");
                    intenty10_y17.putExtra("2_1","http://becbapatla.ac.in:8080/STUDENTINFO/index.html");
                    intenty10_y17.putExtra("2_2","http://becbapatla.ac.in:8080/STUDENTINFO/index.html");
                    intenty10_y17.putExtra("3_1","http://becbapatla.ac.in:8080/STUDENTINFO/index.html");
                    intenty10_y17.putExtra("3_2","http://becbapatla.ac.in:8080/STUDENTINFO/index.html");
                    intenty10_y17.putExtra("4_1","http://becbapatla.ac.in:8080/STUDENTINFO/index.html");
                    intenty10_y17.putExtra("4_2","http://becbapatla.ac.in:8080/STUDENTINFO/index.html");
                    intenty10_y17.putExtra("total","http://becbapatla.ac.in:8080/STUDENTINFO/index.html");
                    intenty10_y17.putExtra("headingset",regster+branchs+" Results");
                    startActivity(intenty10_y17);

                } else if (regster.equals("Y18")||regster.equals("Y19")) {
                    Intent intenty18_y19=new Intent(branchresults.this, semestermarks.class);
                    intenty18_y19.putExtra("1_1","http://becbapatla.ac.in:8080/STUDENTINFO/index_r18.html");
                    intenty18_y19.putExtra("1_2","http://becbapatla.ac.in:8080/STUDENTINFO/index_r18.html");
                    intenty18_y19.putExtra("2_1","http://becbapatla.ac.in:8080/STUDENTINFO/index_r18.html");
                    intenty18_y19.putExtra("2_2","http://becbapatla.ac.in:8080/STUDENTINFO/index_r18.html");
                    intenty18_y19.putExtra("3_1","http://becbapatla.ac.in:8080/STUDENTINFO/index_r18.html");
                    intenty18_y19.putExtra("3_2","http://becbapatla.ac.in:8080/STUDENTINFO/index_r18.html");
                    intenty18_y19.putExtra("4_1","http://becbapatla.ac.in:8080/STUDENTINFO/index_r18.html");
                    intenty18_y19.putExtra("4_2","http://becbapatla.ac.in:8080/STUDENTINFO/index_r18.html");
                    intenty18_y19.putExtra("total","http://becbapatla.ac.in:8080/STUDENTINFO/index_r18.html");
                    intenty18_y19.putExtra("headingset",regster+branchs+" Results");
                    startActivity(intenty18_y19);
                } else if(regster.equals("Y20/L21") && branchs.equals("CSE")) {
                        Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                        intent20_23.putExtra("1_1","http://www.becbapatla.ac.in:8080/collegeresults/11_r20_reg_jul21_3t4l.html");
                        intent20_23.putExtra("1_2","http://www.becbapatla.ac.in:8080/collegeresults/12_r20_reg_oct21_6t3l.html");
                        intent20_23.putExtra("2_1","http://www.becbapatla.ac.in:8080/collegeresults/21_r20_reg_mar22_5t3l.html");
                        intent20_23.putExtra("2_2","http://www.becbapatla.ac.in:8080/collegeresults/22_r20_reg_aug22_5t3l.html");
                        intent20_23.putExtra("3_1","http://www.becbapatla.ac.in:8080/collegeresults/31_r20_reg_feb23_5t3l.html");
                        intent20_23.putExtra("3_2","http://www.becbapatla.ac.in:8080/collegeresults/32_r20_reg_aug23_5t3l.html");
                        intent20_23.putExtra("4_1","http://becbapatla.ac.in:8080/collegeresults/41_r20_reg_jan24_5t2l.html");
                        intent20_23.putExtra("4_2","http://becbapatla.ac.in:8080/collegeresults/42_r20_reg_apr24_0t1l.html");
                        intent20_23.putExtra("total","http://becbapatla.ac.in:8080/STUDENTINFO/index_r20.html");
                        intent20_23.putExtra("headingset",regster+branchs+" Results");
                        startActivity(intent20_23);
                }else if(regster.equals("Y20/L21") && branchs.equals("ECE")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://www.becbapatla.ac.in:8080/collegeresults/11_r20_reg_jul21_4t3l.html");
                    intent20_23.putExtra("1_2","http://www.becbapatla.ac.in:8080/collegeresults/12_r20_reg_oct21_6t3l.html");
                    intent20_23.putExtra("2_1","http://www.becbapatla.ac.in:8080/collegeresults/21_r20_reg_mar22_6t3l.html");
                    intent20_23.putExtra("2_2","http://www.becbapatla.ac.in:8080/collegeresults/22_r20_reg_aug22_6t3l.html");
                    intent20_23.putExtra("3_1","http://www.becbapatla.ac.in:8080/collegeresults/31_r20_reg_feb23_5t4l.html");
                    intent20_23.putExtra("3_2","http://www.becbapatla.ac.in:8080/collegeresults/32_r20_reg_aug23_5t4l.html");
                    intent20_23.putExtra("4_1","http://becbapatla.ac.in:8080/collegeresults/41_r20_reg_jan24_6t1l.html");
                    intent20_23.putExtra("4_2","http://becbapatla.ac.in:8080/collegeresults/42_r20_reg_apr24_0t1l.html");
                    intent20_23.putExtra("total","http://becbapatla.ac.in:8080/STUDENTINFO/index_r20.html");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");
                    startActivity(intent20_23);
                }else if(regster.equals("Y20/L21") && branchs.equals("IT")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://www.becbapatla.ac.in:8080/collegeresults/11_r20_reg_jul21_3t4l.html");
                    intent20_23.putExtra("1_2","http://www.becbapatla.ac.in:8080/collegeresults/12_r20_reg_oct21_6t3l.html");
                    intent20_23.putExtra("2_1","http://www.becbapatla.ac.in:8080/collegeresults/21_r20_reg_mar22_6t3l.html");
                    intent20_23.putExtra("2_2","http://www.becbapatla.ac.in:8080/collegeresults/22_r20_reg_aug22_4t3l.html");
                    intent20_23.putExtra("3_1","http://www.becbapatla.ac.in:8080/collegeresults/31_r20_reg_feb23_5t3l.html");
                    intent20_23.putExtra("3_2","http://www.becbapatla.ac.in:8080/collegeresults/32_r20_reg_aug23_5t3l.html");
                    intent20_23.putExtra("4_1","http://becbapatla.ac.in:8080/collegeresults/41_r20_reg_jan24_5t2l.html");
                    intent20_23.putExtra("4_2","http://becbapatla.ac.in:8080/collegeresults/42_r20_reg_apr24_0t1l.html");
                    intent20_23.putExtra("total","http://becbapatla.ac.in:8080/STUDENTINFO/index_r20.html");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");
                    startActivity(intent20_23);
                }else if(regster.equals("Y20/L21") && branchs.equals("CB")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://www.becbapatla.ac.in:8080/collegeresults/11_r20_reg_jul21_4t3l.html");
                    intent20_23.putExtra("1_2","http://www.becbapatla.ac.in:8080/collegeresults/12_r20_reg_oct21_5t4l.html");
                    intent20_23.putExtra("2_1","http://www.becbapatla.ac.in:8080/collegeresults/21_r20_reg_mar22_5t3l.html");
                    intent20_23.putExtra("2_2","http://www.becbapatla.ac.in:8080/collegeresults/22_r20_reg_aug22_5t3l.html");
                    intent20_23.putExtra("3_1","http://www.becbapatla.ac.in:8080/collegeresults/31_r20_reg_feb23_5t3l.html");
                    intent20_23.putExtra("3_2","http://www.becbapatla.ac.in:8080/collegeresults/32_r20_reg_aug23_5t3l.html");
                    intent20_23.putExtra("4_1","http://becbapatla.ac.in:8080/collegeresults/41_r20_reg_jan24_5t2l.html");
                    intent20_23.putExtra("4_2","http://becbapatla.ac.in:8080/collegeresults/42_r20_reg_apr24_0t1l.html");
                    intent20_23.putExtra("total","http://becbapatla.ac.in:8080/STUDENTINFO/index_r20.html");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");
                    startActivity(intent20_23);
                }else if(regster.equals("Y20/L21") && branchs.equals("DS")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://www.becbapatla.ac.in:8080/collegeresults/11_r20_reg_jul21_4t3l.html");
                    intent20_23.putExtra("1_2","http://www.becbapatla.ac.in:8080/collegeresults/12_r20_reg_oct21_5t4l.html");
                    intent20_23.putExtra("2_1","http://www.becbapatla.ac.in:8080/collegeresults/21_r20_reg_mar22_5t3l.html");
                    intent20_23.putExtra("2_2","http://www.becbapatla.ac.in:8080/collegeresults/22_r20_reg_aug22_5t3l.html");
                    intent20_23.putExtra("3_1","http://www.becbapatla.ac.in:8080/collegeresults/31_r20_reg_feb23_5t3l.html");
                    intent20_23.putExtra("3_2","http://www.becbapatla.ac.in:8080/collegeresults/32_r20_reg_aug23_5t3l.html");
                    intent20_23.putExtra("4_1","http://becbapatla.ac.in:8080/collegeresults/41_r20_reg_jan24_5t2l.html");
                    intent20_23.putExtra("4_2","http://becbapatla.ac.in:8080/collegeresults/42_r20_reg_apr24_0t1l.html");
                    intent20_23.putExtra("total","http://becbapatla.ac.in:8080/STUDENTINFO/index_r20.html");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");
                    startActivity(intent20_23);
                }else if(regster.equals("Y20/L21") && branchs.equals("EEE")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://www.becbapatla.ac.in:8080/collegeresults/11_r20_reg_jul21_3t4l.html");
                    intent20_23.putExtra("1_2","http://www.becbapatla.ac.in:8080/collegeresults/12_r20_reg_oct21_6t3l.html");
                    intent20_23.putExtra("2_1","http://www.becbapatla.ac.in:8080/collegeresults/21_r20_reg_mar22_5t3l.html");
                    intent20_23.putExtra("2_2","http://www.becbapatla.ac.in:8080/collegeresults/22_r20_reg_aug22_5t3l.html");
                    intent20_23.putExtra("3_1","http://www.becbapatla.ac.in:8080/collegeresults/31_r20_reg_feb23_5t3l.html");
                    intent20_23.putExtra("3_2","http://www.becbapatla.ac.in:8080/collegeresults/32_r20_reg_aug23_5t3l.html");
                    intent20_23.putExtra("4_1","http://becbapatla.ac.in:8080/collegeresults/41_r20_reg_jan24_6t1l.html");
                    intent20_23.putExtra("4_2","http://becbapatla.ac.in:8080/collegeresults/42_r20_reg_apr24_0t1l.html");
                    intent20_23.putExtra("total","http://becbapatla.ac.in:8080/STUDENTINFO/index_r20.html");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");
                    startActivity(intent20_23);
                }else if(regster.equals("Y20/L21") && branchs.equals("CE")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://www.becbapatla.ac.in:8080/collegeresults/11_r20_reg_jul21_5t3l.html");
                    intent20_23.putExtra("1_2","http://www.becbapatla.ac.in:8080/collegeresults/12_r20_reg_oct21_4t3l.html");
                    intent20_23.putExtra("2_1","http://www.becbapatla.ac.in:8080/collegeresults/21_r20_reg_mar22_5t3l.html");
                    intent20_23.putExtra("2_2","http://www.becbapatla.ac.in:8080/collegeresults/22_r20_reg_aug22_5t3l.html");
                    intent20_23.putExtra("3_1","http://www.becbapatla.ac.in:8080/collegeresults/31_r20_reg_feb23_5t3l.html");
                    intent20_23.putExtra("3_2","http://www.becbapatla.ac.in:8080/collegeresults/32_r20_reg_aug23_5t3l.html");
                    intent20_23.putExtra("4_1","http://becbapatla.ac.in:8080/collegeresults/41_r20_reg_jan24_6t1l.html");
                    intent20_23.putExtra("4_2","http://becbapatla.ac.in:8080/collegeresults/42_r20_reg_apr24_0t1l.html");
                    intent20_23.putExtra("total","http://becbapatla.ac.in:8080/STUDENTINFO/index_r20.html");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");
                    startActivity(intent20_23);
                }else if(regster.equals("Y20/L21") && branchs.equals("EIE")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://www.becbapatla.ac.in:8080/collegeresults/11_r20_reg_jul21_4t4l.html");
                    intent20_23.putExtra("1_2","http://www.becbapatla.ac.in:8080/collegeresults/12_r20_reg_oct21_5t3l.html");
                    intent20_23.putExtra("2_1","http://www.becbapatla.ac.in:8080/collegeresults/21_r20_reg_mar22_5t3l.html");
                    intent20_23.putExtra("2_2","http://www.becbapatla.ac.in:8080/collegeresults/22_r20_reg_aug22_5t3l.html");
                    intent20_23.putExtra("3_1","http://www.becbapatla.ac.in:8080/collegeresults/31_r20_reg_feb23_5t3l.html");
                    intent20_23.putExtra("3_2","http://www.becbapatla.ac.in:8080/collegeresults/32_r20_reg_aug23_5t3l.html");
                    intent20_23.putExtra("4_1","http://becbapatla.ac.in:8080/collegeresults/41_r20_reg_jan24_6t1l.html");
                    intent20_23.putExtra("4_2","http://becbapatla.ac.in:8080/collegeresults/42_r20_reg_apr24_0t1l.html");
                    intent20_23.putExtra("total","http://becbapatla.ac.in:8080/STUDENTINFO/index_r20.html");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");
                    startActivity(intent20_23);
                }else if(regster.equals("Y20/L21") && branchs.equals("ME")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://www.becbapatla.ac.in:8080/collegeresults/11_r20_reg_jul21_5t3l.html");
                    intent20_23.putExtra("1_2","http://www.becbapatla.ac.in:8080/collegeresults/12_r20_reg_oct21_4t4l.html");
                    intent20_23.putExtra("2_1","http://www.becbapatla.ac.in:8080/collegeresults/21_r20_reg_mar22_5t3l.html");
                    intent20_23.putExtra("2_2","http://www.becbapatla.ac.in:8080/collegeresults/22_r20_reg_aug22_5t3l.html");
                    intent20_23.putExtra("3_1","http://www.becbapatla.ac.in:8080/collegeresults/31_r20_reg_feb23_4t4l.html");
                    intent20_23.putExtra("3_2","http://www.becbapatla.ac.in:8080/collegeresults/32_r20_reg_aug23_4t5l.html");
                    intent20_23.putExtra("4_1","http://becbapatla.ac.in:8080/collegeresults/41_r20_reg_jan24_6t1l.html");
                    intent20_23.putExtra("4_2","http://becbapatla.ac.in:8080/collegeresults/42_r20_reg_apr24_0t1l.html");
                    intent20_23.putExtra("total","http://becbapatla.ac.in:8080/STUDENTINFO/index_r20.html");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");
                    startActivity(intent20_23);
                }else if(regster.equals("Y21/L22") && branchs.equals("CSE")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://www.becbapatla.ac.in:8080/collegeresults/11_r20_reg_apr22_3t4l.html");
                    intent20_23.putExtra("1_2","http://www.becbapatla.ac.in:8080/collegeresults/12_r20_reg_sept22_6t3l.html");
                    intent20_23.putExtra("2_1","http://www.becbapatla.ac.in:8080/collegeresults/21_r20_reg_feb23_5t3l.html");
                    intent20_23.putExtra("2_2","http://www.becbapatla.ac.in:8080/collegeresults/22_r20_reg_aug23_5t3l.html");
                    intent20_23.putExtra("3_1","http://becbapatla.ac.in:8080/collegeresults/31_r20_reg_jan24_5t3l.html");
                    intent20_23.putExtra("3_2","");
                    intent20_23.putExtra("4_1","");
                    intent20_23.putExtra("4_2","");
                    intent20_23.putExtra("total","http://becbapatla.ac.in:8080/STUDENTINFO/index_r20.html");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");
                    startActivity(intent20_23);
                }else if(regster.equals("Y21/L22") && branchs.equals("ECE")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://www.becbapatla.ac.in:8080/collegeresults/11_r20_reg_apr22_4t3l.html");
                    intent20_23.putExtra("1_2","http://www.becbapatla.ac.in:8080/collegeresults/12_r20_reg_sept22_6t3l.html");
                    intent20_23.putExtra("2_1","http://www.becbapatla.ac.in:8080/collegeresults/21_r20_reg_feb23_6t3l.html");
                    intent20_23.putExtra("2_2","http://www.becbapatla.ac.in:8080/collegeresults/22_r20_reg_aug23_6t3l.html");
                    intent20_23.putExtra("3_1","http://becbapatla.ac.in:8080/collegeresults/31_r20_reg_jan24_5t3l.html");
                    intent20_23.putExtra("3_2","");
                    intent20_23.putExtra("4_1","");
                    intent20_23.putExtra("4_2","");
                    intent20_23.putExtra("total","http://becbapatla.ac.in:8080/STUDENTINFO/index_r20.html");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");
                    startActivity(intent20_23);
                }else if(regster.equals("Y21/L22") && branchs.equals("IT")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://www.becbapatla.ac.in:8080/collegeresults/11_r20_reg_apr22_3t4l.html");
                    intent20_23.putExtra("1_2","http://www.becbapatla.ac.in:8080/collegeresults/12_r20_reg_sept22_6t3l.html");
                    intent20_23.putExtra("2_1","http://www.becbapatla.ac.in:8080/collegeresults/21_r20_reg_feb23_6t3l.html");
                    intent20_23.putExtra("2_2","http://www.becbapatla.ac.in:8080/collegeresults/22_r20_reg_aug23_4t3l.html");
                    intent20_23.putExtra("3_1","http://becbapatla.ac.in:8080/collegeresults/31_r20_reg_jan24_5t3l.html");
                    intent20_23.putExtra("3_2","");
                    intent20_23.putExtra("4_1","");
                    intent20_23.putExtra("4_2","");
                    intent20_23.putExtra("total","http://becbapatla.ac.in:8080/STUDENTINFO/index_r20.html");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");
                    startActivity(intent20_23);
                }else if(regster.equals("Y21/L22") && (branchs.equals("CB"))||branchs.equals("DS")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://www.becbapatla.ac.in:8080/collegeresults/11_r20_reg_apr22_4t3l.html");
                    intent20_23.putExtra("1_2","http://www.becbapatla.ac.in:8080/collegeresults/12_r20_reg_sept22_5t4l.html");
                    intent20_23.putExtra("2_1","http://www.becbapatla.ac.in:8080/collegeresults/21_r20_reg_feb23_5t3l.html");
                    intent20_23.putExtra("2_2","http://www.becbapatla.ac.in:8080/collegeresults/22_r20_reg_aug23_5t3l.html");
                    intent20_23.putExtra("3_1","http://becbapatla.ac.in:8080/collegeresults/31_r20_reg_jan24_5t3l.html");
                    intent20_23.putExtra("3_2","");
                    intent20_23.putExtra("4_1","");
                    intent20_23.putExtra("4_2","");
                    intent20_23.putExtra("total","http://becbapatla.ac.in:8080/STUDENTINFO/index_r20.html");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");
                    startActivity(intent20_23);
                }else if(regster.equals("Y21/L22") && branchs.equals("EEE")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://www.becbapatla.ac.in:8080/collegeresults/11_r20_reg_apr22_3t4l.html");
                    intent20_23.putExtra("1_2","http://www.becbapatla.ac.in:8080/collegeresults/12_r20_reg_sept22_5t3l.html");
                    intent20_23.putExtra("2_1","http://www.becbapatla.ac.in:8080/collegeresults/21_r20_reg_feb23_5t3l.html");
                    intent20_23.putExtra("2_2","http://www.becbapatla.ac.in:8080/collegeresults/22_r20_reg_aug23_5t4l.html");
                    intent20_23.putExtra("3_1","http://becbapatla.ac.in:8080/collegeresults/31_r20_reg_jan24_5t4l.html");
                    intent20_23.putExtra("3_2","");
                    intent20_23.putExtra("4_1","");
                    intent20_23.putExtra("4_2","");
                    intent20_23.putExtra("total","http://becbapatla.ac.in:8080/STUDENTINFO/index_r20.html");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");
                    startActivity(intent20_23);
                }else if(regster.equals("Y21/L22") && branchs.equals("CE")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://www.becbapatla.ac.in:8080/collegeresults/11_r20_reg_apr22_5t3l.html");
                    intent20_23.putExtra("1_2","http://www.becbapatla.ac.in:8080/collegeresults/12_r20_reg_sept22_4t3l.html");
                    intent20_23.putExtra("2_1","http://www.becbapatla.ac.in:8080/collegeresults/21_r20_reg_feb23_5t4l.html");
                    intent20_23.putExtra("2_2","http://www.becbapatla.ac.in:8080/collegeresults/22_r20_reg_aug23_5t4l.html");
                    intent20_23.putExtra("3_1","http://becbapatla.ac.in:8080/collegeresults/31_r20_reg_jan24_5t3l.html");
                    intent20_23.putExtra("3_2","");
                    intent20_23.putExtra("4_1","");
                    intent20_23.putExtra("4_2","");
                    intent20_23.putExtra("total","http://becbapatla.ac.in:8080/STUDENTINFO/index_r20.html");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");
                    startActivity(intent20_23);
                }else if(regster.equals("Y21/L22") && branchs.equals("EIE")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://www.becbapatla.ac.in:8080/collegeresults/11_r20_reg_apr22_4t4l.html");
                    intent20_23.putExtra("1_2","http://www.becbapatla.ac.in:8080/collegeresults/12_r20_reg_sept22_5t3l.html");
                    intent20_23.putExtra("2_1","http://www.becbapatla.ac.in:8080/collegeresults/21_r20_reg_feb23_5t4l.html");
                    intent20_23.putExtra("2_2","http://www.becbapatla.ac.in:8080/collegeresults/22_r20_reg_aug23_5t4l.html");
                    intent20_23.putExtra("3_1","http://becbapatla.ac.in:8080/collegeresults/31_r20_reg_jan24_5t3l.html");
                    intent20_23.putExtra("3_2","");
                    intent20_23.putExtra("4_1","");
                    intent20_23.putExtra("4_2","");
                    intent20_23.putExtra("total","http://becbapatla.ac.in:8080/STUDENTINFO/index_r20.html");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");
                    startActivity(intent20_23);
                }else if(regster.equals("Y21/L22") && branchs.equals("ME")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://www.becbapatla.ac.in:8080/collegeresults/11_r20_reg_apr22_5t3l.html");
                    intent20_23.putExtra("1_2","http://www.becbapatla.ac.in:8080/collegeresults/12_r20_reg_sept22_4t4l.html");
                    intent20_23.putExtra("2_1","http://www.becbapatla.ac.in:8080/collegeresults/21_r20_reg_feb23_5t4l.html");
                    intent20_23.putExtra("2_2","http://www.becbapatla.ac.in:8080/collegeresults/22_r20_reg_aug23_5t4l.html");
                    intent20_23.putExtra("3_1","http://becbapatla.ac.in:8080/collegeresults/31_r20_reg_jan24_4t4l.html");
                    intent20_23.putExtra("3_2","");
                    intent20_23.putExtra("4_1","");
                    intent20_23.putExtra("4_2","");
                    intent20_23.putExtra("total","http://becbapatla.ac.in:8080/STUDENTINFO/index_r20.html");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");

                    startActivity(intent20_23);
                }else if(regster.equals("Y22/L23") && branchs.equals("CSE")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://www.becbapatla.ac.in:8080/collegeresults/11_r20_reg_mar23_3t4l.html");
                    intent20_23.putExtra("1_2","http://www.becbapatla.ac.in:8080/collegeresults/12_r20_reg_aug23_6t3l.html");
                    intent20_23.putExtra("2_1","http://becbapatla.ac.in:8080/collegeresults/21_r20_reg_jan24_5t3l.html");
                    intent20_23.putExtra("2_2","");
                    intent20_23.putExtra("3_1","");
                    intent20_23.putExtra("3_2","");
                    intent20_23.putExtra("4_1","");
                    intent20_23.putExtra("4_2","");
                    intent20_23.putExtra("total","http://becbapatla.ac.in:8080/STUDENTINFO/index_r20.html");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");

                    startActivity(intent20_23);
                }else if (regster.equals("Y22/L23") && branchs.equals("AIML")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://www.becbapatla.ac.in:8080/collegeresults/11_r20_reg_mar23_5t3l.html");
                    intent20_23.putExtra("1_2","http://www.becbapatla.ac.in:8080/collegeresults/12_r20_reg_aug23_5t3l.html");
                    intent20_23.putExtra("2_1","http://becbapatla.ac.in:8080/collegeresults/21_r20_reg_jan24_5t4l.html");
                    intent20_23.putExtra("2_2","");
                    intent20_23.putExtra("3_1","");
                    intent20_23.putExtra("3_2","");
                    intent20_23.putExtra("4_1","");
                    intent20_23.putExtra("4_2","");
                    intent20_23.putExtra("total","http://becbapatla.ac.in:8080/STUDENTINFO/index_r20.html");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");
                    startActivity(intent20_23);

                } else if(regster.equals("Y22/L23") && branchs.equals("ECE")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://www.becbapatla.ac.in:8080/collegeresults/11_r20_reg_mar23_4t3l.html");
                    intent20_23.putExtra("1_2","http://www.becbapatla.ac.in:8080/collegeresults/12_r20_reg_aug23_6t3l.html");
                    intent20_23.putExtra("2_1","http://becbapatla.ac.in:8080/collegeresults/21_r20_reg_jan24_6t3l.html");
                    intent20_23.putExtra("2_2","");
                    intent20_23.putExtra("3_1","");
                    intent20_23.putExtra("3_2","");
                    intent20_23.putExtra("4_1","");
                    intent20_23.putExtra("4_2","");
                    intent20_23.putExtra("total","http://becbapatla.ac.in:8080/STUDENTINFO/index_r20.html");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");

                    startActivity(intent20_23);
                }else if(regster.equals("Y22/L23") && branchs.equals("IT")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://www.becbapatla.ac.in:8080/collegeresults/11_r20_reg_mar23_3t4l.html");
                    intent20_23.putExtra("1_2","http://www.becbapatla.ac.in:8080/collegeresults/12_r20_reg_aug23_6t3l.html");
                    intent20_23.putExtra("2_1","http://becbapatla.ac.in:8080/collegeresults/21_r20_reg_jan24_6t3l.html");
                    intent20_23.putExtra("2_2","");
                    intent20_23.putExtra("3_1","");
                    intent20_23.putExtra("3_2","");
                    intent20_23.putExtra("4_1","");
                    intent20_23.putExtra("4_2","");
                    intent20_23.putExtra("total","http://becbapatla.ac.in:8080/STUDENTINFO/index_r20.html");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");

                    startActivity(intent20_23);
                }else if(regster.equals("Y22/L23") && (branchs.equals("CB")&&branchs.equals("DS"))) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://www.becbapatla.ac.in:8080/collegeresults/11_r20_reg_mar23_4t3l.html");
                    intent20_23.putExtra("1_2","http://www.becbapatla.ac.in:8080/collegeresults/12_r20_reg_aug23_5t4l.html");
                    intent20_23.putExtra("2_1","http://becbapatla.ac.in:8080/collegeresults/21_r20_reg_jan24_5t3l.html");
                    intent20_23.putExtra("2_2","");
                    intent20_23.putExtra("3_1","");
                    intent20_23.putExtra("3_2","");
                    intent20_23.putExtra("4_1","");
                    intent20_23.putExtra("4_2","");
                    intent20_23.putExtra("total","http://becbapatla.ac.in:8080/STUDENTINFO/index_r20.html");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");

                    startActivity(intent20_23);
                }else if(regster.equals("Y22/L23") && branchs.equals("EEE")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://www.becbapatla.ac.in:8080/collegeresults/11_r20_reg_mar23_3t4l.html");
                    intent20_23.putExtra("1_2","http://www.becbapatla.ac.in:8080/collegeresults/12_r20_reg_aug23_6t3l.html");
                    intent20_23.putExtra("2_1","http://becbapatla.ac.in:8080/collegeresults/21_r20_reg_jan24_5t3l.html");
                    intent20_23.putExtra("2_2","");
                    intent20_23.putExtra("3_1","");
                    intent20_23.putExtra("3_2","");
                    intent20_23.putExtra("4_1","");
                    intent20_23.putExtra("4_2","");
                    intent20_23.putExtra("total","http://becbapatla.ac.in:8080/STUDENTINFO/index_r20.html");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");

                    startActivity(intent20_23);
                }else if(regster.equals("Y22/L23") && branchs.equals("CE")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://www.becbapatla.ac.in:8080/collegeresults/11_r20_reg_mar23_5t3l.html");
                    intent20_23.putExtra("1_2","http://www.becbapatla.ac.in:8080/collegeresults/12_r20_reg_aug23_4t3l.html");
                    intent20_23.putExtra("2_1","http://becbapatla.ac.in:8080/collegeresults/21_r20_reg_jan24_5t4l.html");
                    intent20_23.putExtra("2_2","");
                    intent20_23.putExtra("3_1","");
                    intent20_23.putExtra("3_2","");
                    intent20_23.putExtra("4_1","");
                    intent20_23.putExtra("4_2","");
                    intent20_23.putExtra("total","http://becbapatla.ac.in:8080/STUDENTINFO/index_r20.html");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");

                    startActivity(intent20_23);
                }else if(regster.equals("Y22/L23") && branchs.equals("EIE")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://www.becbapatla.ac.in:8080/collegeresults/11_r20_reg_mar23_5t3l.html");
                    intent20_23.putExtra("1_2","http://www.becbapatla.ac.in:8080/collegeresults/12_r20_reg_aug23_5t3l.html");
                    intent20_23.putExtra("2_1","http://becbapatla.ac.in:8080/collegeresults/21_r20_reg_jan24_5t4l.html");
                    intent20_23.putExtra("2_2","");
                    intent20_23.putExtra("3_1","");
                    intent20_23.putExtra("3_2","");
                    intent20_23.putExtra("4_1","");
                    intent20_23.putExtra("4_2","");
                    intent20_23.putExtra("total","http://becbapatla.ac.in:8080/STUDENTINFO/index_r20.html");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");

                    startActivity(intent20_23);
                }else if(regster.equals("Y22/L23") && branchs.equals("ME")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://www.becbapatla.ac.in:8080/collegeresults/11_r20_reg_mar23_5t3l.html");
                    intent20_23.putExtra("1_2","http://www.becbapatla.ac.in:8080/collegeresults/12_r20_reg_aug23_4t4l.html");
                    intent20_23.putExtra("2_1","http://becbapatla.ac.in:8080/collegeresults/21_r20_reg_jan24_5t4l.html");
                    intent20_23.putExtra("2_2","");
                    intent20_23.putExtra("3_1","");
                    intent20_23.putExtra("3_2","");
                    intent20_23.putExtra("4_1","");
                    intent20_23.putExtra("4_2","");
                    intent20_23.putExtra("total","http://becbapatla.ac.in:8080/STUDENTINFO/index_r20.html");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");

                    startActivity(intent20_23);
                }else if(regster.equals("Y23/L24") && branchs.equals("CSE")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://becbapatla.ac.in:8080/collegeresults/11_r20_reg_feb24_4t3l.html");
                    intent20_23.putExtra("1_2","");
                    intent20_23.putExtra("2_1","");
                    intent20_23.putExtra("2_2","");
                    intent20_23.putExtra("3_1","");
                    intent20_23.putExtra("3_2","");
                    intent20_23.putExtra("4_1","");
                    intent20_23.putExtra("4_2","");
                    intent20_23.putExtra("total","");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");

                    startActivity(intent20_23);
                } else if (regster.equals("Y23/L24") && branchs.equals("AIML")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://becbapatla.ac.in:8080/collegeresults/11_r20_reg_feb24_5t3l.html");
                    intent20_23.putExtra("1_2","");
                    intent20_23.putExtra("2_1","");
                    intent20_23.putExtra("2_2","");
                    intent20_23.putExtra("3_1","");
                    intent20_23.putExtra("3_2","");
                    intent20_23.putExtra("4_1","");
                    intent20_23.putExtra("4_2","");
                    intent20_23.putExtra("total","");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");

                    startActivity(intent20_23);

                } else if(regster.equals("Y23/L24") && branchs.equals("ECE")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://becbapatla.ac.in:8080/collegeresults/11_r20_reg_feb24_4t3l.html");
                    intent20_23.putExtra("1_2","");
                    intent20_23.putExtra("2_1","");
                    intent20_23.putExtra("2_2","");
                    intent20_23.putExtra("3_1","");
                    intent20_23.putExtra("3_2","");
                    intent20_23.putExtra("4_1","");
                    intent20_23.putExtra("4_2","");
                    intent20_23.putExtra("total","");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");

                    startActivity(intent20_23);
                }else if(regster.equals("Y23/L24") && branchs.equals("IT")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://becbapatla.ac.in:8080/collegeresults/11_r20_reg_feb24_3t4l.html");
                    intent20_23.putExtra("1_2","");
                    intent20_23.putExtra("2_1","");
                    intent20_23.putExtra("2_2","");
                    intent20_23.putExtra("3_1","");
                    intent20_23.putExtra("3_2","");
                    intent20_23.putExtra("4_1","");
                    intent20_23.putExtra("4_2","");
                    intent20_23.putExtra("total","");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");

                    startActivity(intent20_23);
                }else if(regster.equals("Y23/L24") && (branchs.equals("CB")&&branchs.equals("DS"))) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://becbapatla.ac.in:8080/collegeresults/11_r20_reg_feb24_5t3l.html");
                    intent20_23.putExtra("1_2","");
                    intent20_23.putExtra("2_1","");
                    intent20_23.putExtra("2_2","");
                    intent20_23.putExtra("3_1","");
                    intent20_23.putExtra("3_2","");
                    intent20_23.putExtra("4_1","");
                    intent20_23.putExtra("4_2","");
                    intent20_23.putExtra("total","");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");

                    startActivity(intent20_23);
                }else if(regster.equals("Y23/L24") && branchs.equals("EEE")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://becbapatla.ac.in:8080/collegeresults/11_r20_reg_feb24_3t4l.html");
                    intent20_23.putExtra("1_2","");
                    intent20_23.putExtra("2_1","");
                    intent20_23.putExtra("2_2","");
                    intent20_23.putExtra("3_1","");
                    intent20_23.putExtra("3_2","");
                    intent20_23.putExtra("4_1","");
                    intent20_23.putExtra("4_2","");
                    intent20_23.putExtra("total","");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");

                    startActivity(intent20_23);
                }else if(regster.equals("Y23/L24") && branchs.equals("CE")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://becbapatla.ac.in:8080/collegeresults/11_r20_reg_feb24_5t3l.html");
                    intent20_23.putExtra("1_2","");
                    intent20_23.putExtra("2_1","");
                    intent20_23.putExtra("2_2","");
                    intent20_23.putExtra("3_1","");
                    intent20_23.putExtra("3_2","");
                    intent20_23.putExtra("4_1","");
                    intent20_23.putExtra("4_2","");
                    intent20_23.putExtra("total","");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");

                    startActivity(intent20_23);
                }else if(regster.equals("Y23/L24") && branchs.equals("ME")) {
                    Intent intent20_23=new Intent(branchresults.this,semestermarks.class);
                    intent20_23.putExtra("1_1","http://becbapatla.ac.in:8080/collegeresults/11_r20_reg_feb24_5t3l.html");
                    intent20_23.putExtra("1_2","");
                    intent20_23.putExtra("2_1","");
                    intent20_23.putExtra("2_2","");
                    intent20_23.putExtra("3_1","");
                    intent20_23.putExtra("3_2","");
                    intent20_23.putExtra("4_1","");
                    intent20_23.putExtra("4_2","");
                    intent20_23.putExtra("total","");
                    intent20_23.putExtra("headingset",regster+branchs+" Results");

                    startActivity(intent20_23);
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
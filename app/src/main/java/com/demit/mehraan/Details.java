package com.demit.mehraan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Details extends AppCompatActivity {

    int next;
    int a;
    int map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        this.next=getIntent().getIntExtra("next",0);
        this.a=getIntent().getIntExtra("a",0);
        this.map=getIntent().getIntExtra("map",0);

        if (next==1){

            getSupportFragmentManager().beginTransaction().replace(R.id.detailfragid,new TaskDetails()).commit();

        }

        else if(next==2){

            getSupportFragmentManager().beginTransaction().replace(R.id.detailfragid,new PostedTaskDetails()).commit();

        }

        else if(next==3){

            getSupportFragmentManager().beginTransaction().replace(R.id.detailfragid,new MyAssignment()).commit();

        }

        else if(next==4){

            getSupportFragmentManager().beginTransaction().replace(R.id.detailfragid,new ChatLayout()).commit();

        }

        else if(next==5){

            getSupportFragmentManager().beginTransaction().replace(R.id.detailfragid,new Skills()).commit();

        }

        else if(next==6){

            getSupportFragmentManager().beginTransaction().replace(R.id.detailfragid,new ChangePassword()).commit();

        }

        else if(next==7){

            getSupportFragmentManager().beginTransaction().replace(R.id.detailfragid,new ContactUs()).commit();

        }

        else if(next==8){

            getSupportFragmentManager().beginTransaction().replace(R.id.detailfragid,new TermAndConditions()).commit();

        }

        else if(next==9){

            getSupportFragmentManager().beginTransaction().replace(R.id.detailfragid,new Profile()).commit();

        }

        else if(next==10){

            getSupportFragmentManager().beginTransaction().replace(R.id.detailfragid,new ShowOnMap(map)).commit();

        }




    }
}

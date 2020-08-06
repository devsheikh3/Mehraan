package com.demit.mehraan;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;


public class More extends Fragment {
    TextView name, edit, skills, changepass, verification, contactus, tandc,logout;
    CircleImageView dp;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_more, container, false);

        name=view.findViewById(R.id.accountnameid);
        edit=view.findViewById(R.id.editbtnid);
        skills=view.findViewById(R.id.skillsid);
        changepass=view.findViewById(R.id.changepassid);
        verification=view.findViewById(R.id.verificationid);
        contactus=view.findViewById(R.id.contactusid);
        tandc=view.findViewById(R.id.tandcid);
        logout=view.findViewById(R.id.logoutid);
        dp=view.findViewById(R.id.accountdpid);

        edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getContext(),Details.class);
                intent.putExtra("next",9);
                startActivity(intent);

            }
        });

        skills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getContext(),Details.class);
                intent.putExtra("next",5);
                v.getContext().startActivity(intent);

            }
        });

        changepass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getContext(),Details.class);
                intent.putExtra("next",6);
                startActivity(intent);

            }
        });

        contactus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getContext(),Details.class);
                intent.putExtra("next",7);
                startActivity(intent);

            }
        });

        tandc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getContext(),Details.class);
                intent.putExtra("next",8);
                startActivity(intent);

            }
        });

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                showDialogue(view);

            }
        });

        return view;
    }

    private void showDialogue() {
    }


    private void showDialogue(View view) {
        AlertDialog.Builder builder= new AlertDialog.Builder(getContext(),R.style.AlertDialogueTheme);
        View view2 = LayoutInflater.from(getContext()).inflate(R.layout.alert_dialogue,(ConstraintLayout)view.findViewById(R.id.alertdialogueid));
        builder.setView(view2);
        ((TextView)view2.findViewById(R.id.dialgueheading)).setText("Add this meal in weekly schedule?");
        ((TextView)view2.findViewById(R.id.dialogueratingvalueid)).setText("2.5");
        ((Button)view2.findViewById(R.id.dialguenegativebtn)).setText("cancel");
        ((Button)view2.findViewById(R.id.dialguepositivebtn)).setText("submit");

        final AlertDialog alertDialog=builder.create();
        view2.findViewById(R.id.dialguepositivebtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alertDialog.hide();

            }
        });

        view2.findViewById(R.id.dialguenegativebtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                alertDialog.hide();

            }
        });

        if (alertDialog.getWindow()!=null){

            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));

        }

        alertDialog.show();

    }





}

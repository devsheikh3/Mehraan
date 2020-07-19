package com.demit.mehraan;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class Skills extends Fragment {

    ImageView backskills;
    RecyclerView skilllist;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_skills, container, false);
        backskills=view.findViewById(R.id.backskillsid);
        skilllist=view.findViewById(R.id.skilllistid);
        backskills.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getContext(),Dashboard.class);
                intent.putExtra("back",4);
                startActivity(intent);

            }
        });

        skilllist.setLayoutManager(new GridLayoutManager(getContext(),3));
        String[] name={"Plummber","Teacher","Eye Surgeon","paleontologist","fire brigadier","Always Believe In Your Self"};
        skilllist.setAdapter(new SkillsAdapter(name));




        return view;
    }
}

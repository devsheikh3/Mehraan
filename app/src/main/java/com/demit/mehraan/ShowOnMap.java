package com.demit.mehraan;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;


public class ShowOnMap extends Fragment {
    ImageView backmaps;

    int map;

    public ShowOnMap(int map) {
        this.map=map;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_show_on_map, container, false);

        backmaps=view.findViewById(R.id.backmapsid);
        backmaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(map==1){
                    getFragmentManager().beginTransaction().replace(R.id.detailfragid,new TaskDetails()).commit();
                }
                else if(map==2){
                    getFragmentManager().beginTransaction().replace(R.id.detailfragid,new PostedTaskDetails()).commit();
                }


            }
        });


        return view;

    }
}

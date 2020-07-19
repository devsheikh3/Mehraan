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

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_show_on_map, container, false);

        backmaps=view.findViewById(R.id.backskillsid);
        backmaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(getContext(),Dashboard.class);
                intent.putExtra("back",10);
                startActivity(intent);

            }
        });


        return view;

    }
}

package com.demit.mehraan;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class GoogleMapCopy extends Fragment {
    TextView destination, current, estTime;
    Button preview;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_google_map_copy, container, false);

        destination=view.findViewById(R.id.startid);
        current=view.findViewById(R.id.currentid);
        estTime=view.findViewById(R.id.estimatedtimeid);
        preview=view.findViewById(R.id.previewbtnid);


        return view;
    }
}

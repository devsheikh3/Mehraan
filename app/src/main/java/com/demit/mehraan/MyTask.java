package com.demit.mehraan;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class MyTask extends Fragment {

    RecyclerView assignedlist, postedlist;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_my_task, container, false);

        assignedlist=view.findViewById(R.id.tasksassignedlistid);
        postedlist=view.findViewById(R.id.taskspostedlistid);

        assignedlist.setLayoutManager(new LinearLayoutManager(getContext()));
        postedlist.setLayoutManager(new LinearLayoutManager(getContext()));

        String[] name={"Task number 5","Task number 6","Task number 7",};
        String[] price={"120","450","200"};
        String[] location={"task location 3","task location 4","task location 5"};
        String[] comments={"12","45","20","12","50","0","50"};
        String[] offers={"10","50","20","10","40","0","0"};
        int[] image={R.drawable.melogo,R.drawable.melogo,R.drawable.melogo,R.drawable.melogo,R.drawable.melogo,R.drawable.melogo,R.drawable.melogo};
        int a=2;
        assignedlist.setAdapter(new AssignmentAdapter(name,location,price,comments,offers,image));
        postedlist.setAdapter(new EarnMoneyAdapter(name,location,price,comments,offers,image,a));





        return view;
    }
}

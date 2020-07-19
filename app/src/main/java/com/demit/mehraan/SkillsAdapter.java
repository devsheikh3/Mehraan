package com.demit.mehraan;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SkillsAdapter extends RecyclerView.Adapter<SkillsAdapter.SkillsViewHolder> {
    public SkillsAdapter(String[] skill) {
        this.skill = skill;
    }

    private String[] skill;

    @NonNull
    @Override
    public SkillsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater= LayoutInflater.from(parent.getContext());
        View view=inflater.inflate(R.layout.skills_view,parent,false);

        return new SkillsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SkillsViewHolder holder, int position) {

        String skilltxt=skill[position];
        holder.skillname.setText(skilltxt);

    }

    @Override
    public int getItemCount() {
        return skill.length;
    }

    public class SkillsViewHolder extends RecyclerView.ViewHolder{
        TextView skillname;
        public SkillsViewHolder(@NonNull View itemView) {
            super(itemView);
            skillname=itemView.findViewById(R.id.skillnameid);
        }
    }
}

package com.example.programming_quotes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PQAdapter extends RecyclerView.Adapter<PQViewHolder> {

    private Context mcontext;
    private List<ProgrammingQuotes> mprogrammingQuotes;

    public PQAdapter (Context context, List<ProgrammingQuotes> programmingQuotes){
        mcontext = context;
        mprogrammingQuotes = programmingQuotes;
    }

    @NonNull
    @Override
    public PQViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pq,parent,false);
        return new PQViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PQViewHolder holder, int position) {
        ProgrammingQuotes programmingQuotes = mprogrammingQuotes.get(position);
        holder.getTxtPQ().setText(programmingQuotes.getAuthor());
        holder.getTxtPQA().setText(programmingQuotes.getEn());

    }

    @Override
    public int getItemCount() {
        return mprogrammingQuotes.size();
    }
}

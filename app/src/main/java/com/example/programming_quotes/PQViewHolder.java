package com.example.programming_quotes;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PQViewHolder extends RecyclerView.ViewHolder {
    private TextView txtPQ,txtPQA;
    public PQViewHolder(@NonNull View itemView) {
        super(itemView);
        txtPQ = itemView.findViewById(R.id.TxtPQ);
        txtPQA = itemView.findViewById(R.id.TxtPQA);

    }


    public TextView getTxtPQ() {
        return txtPQ;
    }

    public void setTxtPQ(TextView txtPQ) {
        this.txtPQ = txtPQ;
    }

    public TextView getTxtPQA(){
        return txtPQA;
    }

    public void setTxtPQA(TextView txtPQA) {
        this.txtPQA = txtPQA;
    }
}



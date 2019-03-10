package com.nindyahapsari.micropocket;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.HolderBrand> {


    @NonNull
    @Override
    public HolderBrand onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull HolderBrand holderBrand, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public class HolderBrand extends RecyclerView.ViewHolder{
        public HolderBrand(View itemView){
            super(itemView);
        }
    }
}

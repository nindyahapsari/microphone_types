package com.nindyahapsari.micropocket;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class HolderBrand extends RecyclerView.ViewHolder {


    TextView mMicroBrand;


    public HolderBrand(@NonNull View itemView) {
        super(itemView);

        mMicroBrand = (TextView) itemView.findViewById(R.id.tv_micro_home_list);
    }
}

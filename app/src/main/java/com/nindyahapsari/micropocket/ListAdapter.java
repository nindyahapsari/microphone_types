package com.nindyahapsari.micropocket;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.HolderBrand> {

    public static final String TAG = "List Adapter";

    private Context mContext;
    private ArrayList<Model> mListModel;



    public ListAdapter(Context mContext, ArrayList<Model> mListModel) {
        this.mContext = mContext;
        this.mListModel = mListModel;
    }


    @NonNull
    @Override
    public HolderBrand onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(R.layout.cardview_micro_home, null);
        return new HolderBrand(view);

//        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_home, viewGroup, false);
//        return new HolderBrand(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HolderBrand holder, int position) {

        Log.d(TAG, "onBindViewHolder: called");

        Model model = mListModel.get(position);

        holder.tvBrand.setText(model.getBrand());
        holder.tvDescription.setText(model.getDescription());
        holder.tvDummyText.setText(model.getDummytext());

    }

    @Override
    public int getItemCount() {
        return mListModel.size();
    }



    class HolderBrand extends RecyclerView.ViewHolder{

        TextView tvBrand, tvDescription, tvDummyText;

        public HolderBrand(View itemView){
            super(itemView);

            tvBrand = (TextView) itemView.findViewById(R.id.tv_micro_home_list);
            tvDescription = (TextView) itemView.findViewById(R.id.tv_shortdesc);
            tvDummyText = (TextView) itemView.findViewById(R.id.tv_dummydesc);


        }
    }


}

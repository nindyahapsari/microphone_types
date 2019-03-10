package com.nindyahapsari.micropocket;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class HomeActivity extends AppCompatActivity {

    RecyclerView mRecyclerView;
    ListAdapter listAdapter;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);


        // set properties
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview_home);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);



        // adapter
        listAdapter = new ListAdapter(this.getBrands());
        mRecyclerView.setAdapter(listAdapter);



    }

    private ArrayList<Model> getBrands(){
        ArrayList<Model> models = new ArrayList<>();

        Model brand = new Model();
        brand.setBrand("Neumann");
        models.add(brand);

        brand = new Model();
        brand.setBrand("Sennheiser");
        models.add(brand);

        brand = new Model();
        brand.setBrand("AKG");
        models.add(brand);

        return models;


    }

}

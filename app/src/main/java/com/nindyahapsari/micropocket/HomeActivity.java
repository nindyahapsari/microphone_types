package com.nindyahapsari.micropocket;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity{

    public static final String TAG = "Home Activity";


    RecyclerView mRecyclerView;


    ArrayList<Model> modelList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Log.d(TAG, "starting");



        mRecyclerView = (RecyclerView) findViewById(R.id.rv_home);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        modelList = new ArrayList<>();

        modelList.add(new Model("Neumann", "Lorem ipsum dolor sit amet", "consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam "));
        modelList.add(new Model("Sennheiser", "Lorem ipsum dolor sit amet", "consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam"));
        modelList.add(new Model("AKG", "Lorem ipsum dolor sit amet", "consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam"));
        modelList.add(new Model("Mic 4", "Lorem ipsum dolor sit amet", "consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam"));
        modelList.add(new Model("Mic 5", "Lorem ipsum dolor sit amet", "consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam"));
        modelList.add(new Model("Mic 6", "Lorem ipsum dolor sit amet", "consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam"));
        modelList.add(new Model("Mic 7", "Lorem ipsum dolor sit amet", "consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam"));
        modelList.add(new Model("Mic 8", "Lorem ipsum dolor sit amet", "consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam"));
        modelList.add(new Model("Mic 9", "Lorem ipsum dolor sit amet", "consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam"));
        modelList.add(new Model("Mic 10", "Lorem ipsum dolor sit amet", "consetetur sadipscing elitr, sed diam nonumy eirmod tempor invidunt ut labore et dolore magna aliquyam erat, sed diam"));

        ListAdapter mAdapter = new ListAdapter(this, modelList);
        mRecyclerView.setAdapter(mAdapter);



    }



}

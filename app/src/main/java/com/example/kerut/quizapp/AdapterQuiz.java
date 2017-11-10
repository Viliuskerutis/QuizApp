package com.example.kerut.quizapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.List;

/**
 * Created by kerut on 08/11/2017.
 */

public class AdapterQuiz extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context context;
    private LayoutInflater inflater;
    List<Apklausa> data = Collections.emptyList();
    Apklausa current;
    int currentPos = 0;

    // create constructor to initialize cotext and data sent from SearchActivity
    public AdapterQuiz(Context context, List<Apklausa> data) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        this.data = data;
    }

    //Inflate the layout when ViewHolder create
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.container_lithuania, parent, false);
        MyHolder holder = new MyHolder(view);
        return holder;
    }

    // Bind data
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        //Get current possition of item in RecyclerView to bind data and assign values from list
        MyHolder myHolder = (MyHolder) holder;
        Apklausa current = data.get(position);
        myHolder.textvartotojas.setText("Vartotojas: " + current.getVartotojas());
        myHolder.textkiekis.setText("Atsakyta teisingai klausimų: " + current.getKiekis() + "0%");
        myHolder.textdata.setText("Data: " + current.getData());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView textvartotojas;
        TextView textkiekis;
        TextView textdata;


        // create constructor to get vidget reference
        public MyHolder(View itemView) {
            super(itemView);
            textvartotojas = (TextView) itemView.findViewById(R.id.textvartotojas);
            textkiekis = (TextView) itemView.findViewById(R.id.textkiekis);
            textdata = (TextView) itemView.findViewById(R.id.textdata);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(context, "Start Quiz Now!", Toast.LENGTH_LONG).show();
        }
    }
}

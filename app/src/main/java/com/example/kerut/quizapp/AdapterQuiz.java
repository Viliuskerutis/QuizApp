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
    List<SearchContainer> data = Collections.emptyList();

    // create constructor to initialize context and data sent from SearchActivity
    public AdapterQuiz(Context context, List<SearchContainer> data) {
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
        SearchContainer current = data.get(position);
        myHolder.textusername.setText("Vartotojas: " + current.getUsername());

        if(current.getTopic().equals("Quiz about Lithuania"))
            myHolder.textcount.setText("Atsakyta teisingai klausimų: " + current.getCount() + "/10");
        if(current.getTopic().equals("Famous dates of Lithuania"))
            myHolder.textcount.setText("Atsakyta teisingai klausimų: " + current.getCount() + "/30");

        myHolder.texttopic.setText("Quiz: " + current.getTopic());
        myHolder.texttime.setText("Data: " + current.getTime());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class MyHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView textusername;
        TextView textcount;
        TextView texttopic;
        TextView texttime;


        // create constructor to get vidget reference
        public MyHolder(View itemView) {
            super(itemView);
            textusername = itemView.findViewById(R.id.textvartotojas);
            textcount = itemView.findViewById(R.id.textkiekis);
            texttopic = itemView.findViewById(R.id.textdata);
            texttime = itemView.findViewById(R.id.textdata2);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Toast.makeText(context, "Start Quiz Now!", Toast.LENGTH_LONG).show();
        }
    }
}

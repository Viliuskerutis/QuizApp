package com.example.kerut.quizapp;

import java.util.HashMap;
import java.util.List;

public class FirstQuizData {

    List<HashMap> list;

    FirstQuizData(){}

    public void addData(HashMap<String, String> hashMap){
        list.add(hashMap);
    }

    public List<HashMap> getList(){
        return list;
    }

}

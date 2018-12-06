package com.example.kerut.quizapp;

/**
 * Created by kerut on 08/11/2017.
 */

public class SearchContainer {
    private String id;
    private String username;
    private String count;
    private String topic;
    private String time;

    public SearchContainer(String username, String count, String topic, String time) {
        this.username = username;
        this.count = count;
        this.topic = topic;
        this.time = time;
    }

    public String getTime() { return time; }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public String getCount() {
        return count;
    }

    public String getTopic() {
        return topic;
    }

}

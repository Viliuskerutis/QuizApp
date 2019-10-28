package com.example.kerut.quizapp;

import org.junit.Assert;
import org.junit.Test;

public class SearchContainerTest {

    @Test
    public void getTime() {
        SearchContainer searchContainer = new SearchContainer("aaa", "5", "aaa", "aaa");
        String time = searchContainer.getTime();

        Assert.assertEquals("aaa", time);
    }

    @Test
    public void getTimeWrong() {
        SearchContainer searchContainer = new SearchContainer("aaa", "5", "aaa", "aaa");
        String time = searchContainer.getTime();

        Assert.assertNotNull("aab", time);
    }

    @Test
    public void getId() {
        SearchContainer searchContainer = new SearchContainer("aaa", "5", "aaa", "aaa");
        searchContainer.setId("1");
        String Id = searchContainer.getId();

        Assert.assertEquals("1", Id);
    }

    @Test
    public void getIdWrong() {
        SearchContainer searchContainer = new SearchContainer("aaa", "5", "aaa", "aaa");
        searchContainer.setId("1");
        String Id = searchContainer.getId();

        Assert.assertNotEquals("2", Id);
    }

    @Test
    public void setId() {
        SearchContainer searchContainer = new SearchContainer("aaa", "5", "aaa", "aaa");
        searchContainer.setId("1");
        String Id = searchContainer.getId();

        Assert.assertEquals("1", Id);
    }

    @Test
    public void setIdWrong() {
        SearchContainer searchContainer = new SearchContainer("aaa", "5", "aaa", "aaa");
        searchContainer.setId("1");
        String Id = searchContainer.getId();

        Assert.assertNotEquals("2", Id);
    }

    @Test
    public void getUsername() {
        SearchContainer searchContainer = new SearchContainer("aaa", "5", "aaa", "aaa");
        String username = searchContainer.getUsername();

        Assert.assertEquals("aaa", username);
    }

    @Test
    public void getUsernameWrong() {
        SearchContainer searchContainer = new SearchContainer("aaa", "5", "aaa", "aaa");
        String username = searchContainer.getUsername();

        Assert.assertNotEquals("aab", username);
    }

    @Test
    public void getCountWrong() {
        SearchContainer searchContainer = new SearchContainer("aaa", "5", "aaa", "aaa");
        String count = searchContainer.getCount();

        Assert.assertNotEquals("6", count);
    }

    @Test
    public void getCount() {
        SearchContainer searchContainer = new SearchContainer("aaa", "5", "aaa", "aaa");
        String count = searchContainer.getCount();

        Assert.assertEquals("5", count);
    }

    @Test
    public void getTopic() {
        SearchContainer searchContainer = new SearchContainer("aaa", "5", "aaa", "aaa");
        String topic = searchContainer.getTopic();

        Assert.assertEquals("aaa", topic);
    }

    @Test
    public void getTopicWrong() {
        SearchContainer searchContainer = new SearchContainer("aaa", "5", "aaa", "aaa");
        String topic = searchContainer.getTopic();

        Assert.assertNotEquals("aab", topic);
    }
}
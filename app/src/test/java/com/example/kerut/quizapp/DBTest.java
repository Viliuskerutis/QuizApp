package com.example.kerut.quizapp;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Random;

public class DBTest {

    @Test
    public void sendPostRequestWrongURL() {
        DB db = new DB();
        HashMap<String, String> data = new HashMap<String, String>();
        data.put("username", "aaa");
        data.put("password", "aaa");
        data.put("email", "aaa");
        String response = db.sendPostRequest("http://saitynas.byethost.com/mobile/registertoquiz.php", data);

        Assert.assertNotEquals("200", response);
    }

    @Test
    public void sendPostRequestRegisterUserExists() {
        DB db = new DB();
        HashMap<String, String> data = new HashMap<String, String>();
        data.put("username", "aaa");
        data.put("password", "aaa");
        data.put("email", "aaa");
        String response = db.sendPostRequest("http://saitynas.byethost14.com/mobile/registertoquiz.php", data);

        Assert.assertEquals("username or email already exist", response);
    }

    @Test
    public void sendPostRequestRegister() {
        DB db = new DB();
        Random random = new Random();
        HashMap<String, String> data = new HashMap<String, String>();
        String aaa = "aaa" + random.nextInt(1000000) + "";
        data.put("username", aaa);
        data.put("password", aaa);
        data.put("email", aaa);
        String response = db.sendPostRequest("http://saitynas.byethost14.com/mobile/registertoquiz.php", data);

        Assert.assertEquals("200", response);
    }

    @Test
    public void sendPostRequestLoginUserExists() {
        DB db = new DB();
        HashMap<String, String> data = new HashMap<String, String>();
        data.put("username", "aaa");
        data.put("password", "aaa");
        String response = db.sendPostRequest("http://saitynas.byethost14.com/mobile/logintoquiz.php", data);

        Assert.assertEquals("202", response);
    }

    @Test
    public void sendPostRequestLogin() {
        DB db = new DB();
        Random random = new Random();
        HashMap<String, String> data = new HashMap<String, String>();
        String aaa = "aaa" + random.nextInt(1000000) + "";
        data.put("username", aaa);
        data.put("password", aaa);
        String response = db.sendPostRequest("http://saitynas.byethost14.com/mobile/logintoquiz.php", data);

        Assert.assertNotEquals("202", response);
    }

    @Test
    public void sendPostRequestLithuaniaDatesQuiz() {
        DB db = new DB();
        HashMap<String, String> data = new HashMap<String, String>();
        data.put("vartotojas", "aaa");
        data.put("kiekis", "5");
        data.put("pavadinimas", "aaa");
        data.put("minnuokrypis", "5");
        data.put("maxnuokrypis", "5");
        data.put("neatsakyta", "5");
        String response = db.sendPostRequest("http://saitynas.byethost14.com/mobile/quizdates.php", data);

        Assert.assertEquals("200", response);
    }

    @Test
    public void sendPostRequestLithuaniaQuiz() {
        DB db = new DB();
        HashMap<String, String> data = new HashMap<String, String>();
        data.put("vartotojas", "aaa");
        data.put("kiekis", "5");
        data.put("pavadinimas", "aaa");
        String response = db.sendPostRequest("http://saitynas.byethost14.com/mobile/quizlithuania.php", data);

        Assert.assertEquals("200", response);
    }
}
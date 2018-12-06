package com.example.kerut.quizapp;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LithuaniaDateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lithuania_date);


        setKlausimus();

        Button baigti = findViewById(R.id.Baigti);
        baigti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int atsakytiTeisingai = 0;
                int neatsakyti = 0;
                List<Integer> nuokrypis = new ArrayList<Integer>();
                int kiekis = 0;

                List<String> data = new ArrayList<String>();
                User user = new User(getApplicationContext());
                data.add(0, user.getUsernameForLogin());

                try {

                    EditText pirmasAtsakymas = findViewById(R.id.PirmasAtsakymas);
                    if (pirmasAtsakymas.getText().toString().equals(getString(R.string.pirmasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!pirmasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(pirmasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.pirmasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }

                    EditText antrasAtsakymas = findViewById(R.id.AntrasAtsakymas);
                    if (antrasAtsakymas.getText().toString().equals(getString(R.string.antrasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!antrasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(antrasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.antrasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }

                    EditText trečiasAtsakymas = findViewById(R.id.TrečiasAtsakymas);
                    if (trečiasAtsakymas.getText().toString().equals(getString(R.string.trečiasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!trečiasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(trečiasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.trečiasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }

                    EditText ketvirtasAtsakymas = findViewById(R.id.KetvirtasAtsakymas);
                    if (ketvirtasAtsakymas.getText().toString().equals(getString(R.string.ketvirtasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!ketvirtasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(ketvirtasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.ketvirtasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }

                    EditText penktasAtsakymas = findViewById(R.id.PenktasAtsakymas);
                    if (penktasAtsakymas.getText().toString().equals(getString(R.string.penktasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!penktasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(penktasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.penktasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }

                    EditText šeštasAtsakymas = findViewById(R.id.ŠeštasAtsakymas);
                    if (šeštasAtsakymas.getText().toString().equals(getString(R.string.šeštasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!šeštasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(šeštasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.šeštasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }

                    EditText septintasAtsakymas = findViewById(R.id.SeptintasAtsakymas);
                    if (septintasAtsakymas.getText().toString().equals(getString(R.string.septintasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!septintasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(septintasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.septintasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }

                    EditText aštuntasAtsakymas = findViewById(R.id.AštuntasAtsakymas);
                    if (aštuntasAtsakymas.getText().toString().equals(getString(R.string.aštuntasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!aštuntasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(aštuntasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.aštuntasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }

                    EditText devintasAtsakymas = findViewById(R.id.DevintasAtsakymas);
                    if (devintasAtsakymas.getText().toString().equals(getString(R.string.devintasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!devintasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(devintasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.devintasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }

                    EditText dešimtasAtsakymas = findViewById(R.id.DešimtasAtsakymas);
                    if (dešimtasAtsakymas.getText().toString().equals(getString(R.string.dešimtasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!dešimtasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(dešimtasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.dešimtasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }

                    EditText vienuoliktasAtsakymas = findViewById(R.id.VienuoliktasAtsakymas);
                    if (vienuoliktasAtsakymas.getText().toString().equals(getString(R.string.vienuoliktasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!vienuoliktasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(vienuoliktasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.vienuoliktasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }

                    EditText dvyliktasAtsakymas = findViewById(R.id.DvyliktasAtsakymas);
                    if (dvyliktasAtsakymas.getText().toString().equals(getString(R.string.dvyliktasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!dvyliktasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(dvyliktasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.dvyliktasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }

                    EditText tryliktasAtsakymas = findViewById(R.id.TryliktasAtsakymas);
                    if (tryliktasAtsakymas.getText().toString().equals(getString(R.string.tryliktasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!tryliktasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(tryliktasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.tryliktasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }

                    EditText keturioliktasAtsakymas = findViewById(R.id.KeturioliktasAtsakymas);
                    if (keturioliktasAtsakymas.getText().toString().equals(getString(R.string.keturioliktasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!keturioliktasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(keturioliktasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.keturioliktasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }

                    EditText penkioliktasAtsakymas = findViewById(R.id.PenkioliktasAtsakymas);
                    if (penkioliktasAtsakymas.getText().toString().equals(getString(R.string.penkioliktasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!penkioliktasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(penkioliktasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.penkioliktasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }

                    EditText šešioliktasAtsakymas = findViewById(R.id.ŠešioliktasAtsakymas);
                    if (šešioliktasAtsakymas.getText().toString().equals(getString(R.string.šešioliktasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!šešioliktasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(šešioliktasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.šešioliktasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }

                    EditText septynioliktasAtsakymas = findViewById(R.id.SeptynioliktasAtsakymas);
                    if (septynioliktasAtsakymas.getText().toString().equals(getString(R.string.septynioliktasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!septynioliktasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(septynioliktasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.septynioliktasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }

                    EditText aštuonioliktasAtsakymas = findViewById(R.id.AštuonioliktasAtsakymas);
                    if (aštuonioliktasAtsakymas.getText().toString().equals(getString(R.string.aštuonioliktasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!aštuonioliktasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(aštuonioliktasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.aštuonioliktasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }

                    EditText devynioliktasAtsakymas = findViewById(R.id.DevynioliktasAtsakymas);
                    if (devynioliktasAtsakymas.getText().toString().equals(getString(R.string.devynioliktasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!devynioliktasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(devynioliktasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.devynioliktasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }

                    EditText dvidešimtasAtsakymas = findViewById(R.id.DvidešimtasAtsakymas);
                    if (dvidešimtasAtsakymas.getText().toString().equals(getString(R.string.dvidešimtasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!dvidešimtasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(dvidešimtasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.dvidešimtasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }

                    EditText dvidešimtpirmasAtsakymas = findViewById(R.id.DvidešimtpirmasAtsakymas);
                    if (dvidešimtpirmasAtsakymas.getText().toString().equals(getString(R.string.dvidešimtpirmasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!dvidešimtpirmasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(dvidešimtpirmasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.dvidešimtpirmasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }

                    EditText dvidešimtantrasAtsakymas = findViewById(R.id.DvidešimtantrasAtsakymas);
                    if (dvidešimtantrasAtsakymas.getText().toString().equals(getString(R.string.dvidešimtantrasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!dvidešimtantrasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(dvidešimtantrasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.dvidešimtantrasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }

                    EditText dvidešimttrečiasAtsakymas = findViewById(R.id.DvidešimttrečiasAtsakymas);
                    if (dvidešimttrečiasAtsakymas.getText().toString().equals(getString(R.string.dvidešimttrečiasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!dvidešimttrečiasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(dvidešimttrečiasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.dvidešimttrečiasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }

                    EditText dvidešimtketvirtasAtsakymas = findViewById(R.id.DvidešimtketvirtasAtsakymas);
                    if (dvidešimtketvirtasAtsakymas.getText().toString().equals(getString(R.string.dvidešimtketvirtasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!dvidešimtketvirtasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(dvidešimtketvirtasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.dvidešimtketvirtasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }

                    EditText dvidešimtpenktasAtsakymas = findViewById(R.id.DvidešimtpenktasAtsakymas);
                    if (dvidešimtpenktasAtsakymas.getText().toString().equals(getString(R.string.dvidešimtpenktasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!dvidešimtpenktasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(dvidešimtpenktasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.dvidešimtpenktasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }

                    EditText dvidešimtšeštasAtsakymas = findViewById(R.id.DvidešimtšeštasAtsakymas);
                    if (dvidešimtšeštasAtsakymas.getText().toString().equals(getString(R.string.dvidešimtšeštasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!dvidešimtšeštasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(dvidešimtšeštasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.dvidešimtšeštasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }

                    EditText dvidešimtseptintasAtsakymas = findViewById(R.id.DvidešimtseptintasAtsakymas);
                    if (dvidešimtseptintasAtsakymas.getText().toString().equals(getString(R.string.dvidešimtseptintasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!dvidešimtseptintasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(dvidešimtseptintasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.dvidešimtseptintasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }

                    EditText dvidešimtaštuntasAtsakymas = findViewById(R.id.DvidešimtaštuntasAtsakymas);
                    if (dvidešimtaštuntasAtsakymas.getText().toString().equals(getString(R.string.dvidešimtaštuntasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!dvidešimtaštuntasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(dvidešimtaštuntasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.dvidešimtaštuntasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }

                    EditText dvidešimtdevintasAtsakymas = findViewById(R.id.DvidešimtdevintasAtsakymas);
                    if (dvidešimtdevintasAtsakymas.getText().toString().equals(getString(R.string.dvidešimtdevintasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!dvidešimtdevintasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(dvidešimtdevintasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.dvidešimtdevintasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }

                    EditText trisdešimtasAtsakymas = findViewById(R.id.TrisdešimtasAtsakymas);
                    if (trisdešimtasAtsakymas.getText().toString().equals(getString(R.string.trisdešimtasAtsakymas))) {
                        atsakytiTeisingai++;
                    } else if (!trisdešimtasAtsakymas.getText().toString().isEmpty()) {
                        nuokrypis.add(kiekis++, Math.abs(Integer.parseInt(trisdešimtasAtsakymas.getText().toString()) - Integer.parseInt(getString(R.string.trisdešimtasAtsakymas))));
                    } else {
                        neatsakyti++;
                    }
                } catch (Exception e) {
                    Toast.makeText(LithuaniaDateActivity.this, "Buvo įvestas netinkamas skaičius, bandykite dar kartą", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(LithuaniaDateActivity.this, QuizActivity.class);
                    startActivity(intent);
                }

                data.add(1, "" + atsakytiTeisingai + "/30");

                setContentView(R.layout.project_test_ending);

                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;

                for (Integer i : nuokrypis) {
                    if (i < min) {
                        min = i;
                    }
                    if (i > max) {
                        max = i;
                    }
                }

                if (min != 2147483647)
                    data.add(2, "" + min + "");
                else data.add(2, "-");

                if (max != -2147483648)
                    data.add(3, "" + max + "");
                else data.add(3, "-");

                data.add(4, "" + neatsakyti + "");
                System.out.println(data.get(2) + "\n" + data.get(3) + "\n" + data.get(4));
                System.out.println(data);
                addResultToDB(data);

                TextView textView = findViewById(R.id.Ivertis);
                NumberFormat formatter = new DecimalFormat("#0.00");

                if (atsakytiTeisingai < 15)
                    textView.setText("Deja.. Jūs surinkote vos: " + formatter.format(atsakytiTeisingai / 30D * 100D) + "%");
                else if (atsakytiTeisingai >= 15 && atsakytiTeisingai < 24)
                    textView.setText("Neblogai! Jūs surinkote: " + formatter.format(atsakytiTeisingai / 30D * 100D) + "%");
                else
                    textView.setText("Puikiai! Jūs surinkote: " + formatter.format(atsakytiTeisingai / 30D * 100D) + "%");

                TextView teisingi = findViewById(R.id.Teisingi);
                teisingi.setText(R.string.teisingi);

                TextView kiekteisingi = findViewById(R.id.keikTeisingi);
                kiekteisingi.setText(atsakytiTeisingai + "/" + 30);

                TextView nepasirinkta = findViewById(R.id.Neatsakyti);
                nepasirinkta.setText(R.string.neatsakyta);

                TextView kieknepasirinkta = findViewById(R.id.keikNeatsakyti);
                kieknepasirinkta.setText(neatsakyti + "/" + 30);

                TextView minNuokrypis = findViewById(R.id.minNuokrypis);
                minNuokrypis.setText(R.string.minNuokrypis);
                TextView koksminNuokrypis = findViewById(R.id.koksmin);

                if (min != Integer.MAX_VALUE) {
                    koksminNuokrypis.setText("" + min + "");
                } else koksminNuokrypis.setText("-");

                TextView maxNuokrypis = findViewById(R.id.maxNuokrypis);
                maxNuokrypis.setText(R.string.maxNuokrypis);
                TextView koksmaxNuokrypis = findViewById(R.id.koksmax);

                if (max != Integer.MIN_VALUE) {
                    koksmaxNuokrypis.setText("" + max + "");
                } else koksmaxNuokrypis.setText("-");

                Button getback = findViewById(R.id.ending_getback);
                getback.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(LithuaniaDateActivity.this, QuizActivity.class);
                        startActivity(intent);
                    }
                });

                Button chechtheanswers = findViewById(R.id.ending_checkanswers);
                chechtheanswers.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        setContentView(R.layout.check_the_answers);

                        TextView correct = findViewById(R.id.correctsentence);
                        correct.setText(getString(R.string.pirmasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.pirmasAtsakymas) +
                                "\n\n\n" + getString(R.string.antrasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.antrasAtsakymas) +
                                "\n\n\n" + getString(R.string.trečiasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.trečiasAtsakymas) +
                                "\n\n\n" + getString(R.string.ketvirtasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.ketvirtasAtsakymas) +
                                "\n\n\n" + getString(R.string.penktasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.penktasAtsakymas) +
                                "\n\n\n" + getString(R.string.šeštasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.šeštasAtsakymas) +
                                "\n\n\n" + getString(R.string.septintasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.septintasAtsakymas) +
                                "\n\n\n" + getString(R.string.aštuntasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.aštuntasAtsakymas) +
                                "\n\n\n" + getString(R.string.devintasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.devintasAtsakymas) +
                                "\n\n\n" + getString(R.string.dešimtasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.dešimtasAtsakymas) +
                                "\n\n\n" + getString(R.string.vienuoliktasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.vienuoliktasAtsakymas) +
                                "\n\n\n" + getString(R.string.dvyliktasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.dvyliktasAtsakymas) +
                                "\n\n\n" + getString(R.string.tryliktasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.tryliktasAtsakymas) +
                                "\n\n\n" + getString(R.string.keturioliktasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.keturioliktasAtsakymas) +
                                "\n\n\n" + getString(R.string.penkioliktasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.penkioliktasAtsakymas) +
                                "\n\n\n" + getString(R.string.šešioliktasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.šešioliktasAtsakymas) +
                                "\n\n\n" + getString(R.string.septynioliktasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.septynioliktasAtsakymas) +
                                "\n\n\n" + getString(R.string.aštuonioliktasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.aštuonioliktasAtsakymas) +
                                "\n\n\n" + getString(R.string.devynioliktasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.devynioliktasAtsakymas) +
                                "\n\n\n" + getString(R.string.dvidešimtasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.dvidešimtasAtsakymas) +
                                "\n\n\n" + getString(R.string.dvidešimtpirmasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.dvidešimtpirmasAtsakymas) +
                                "\n\n\n" + getString(R.string.dvidešimtantrasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.dvidešimtantrasAtsakymas) +
                                "\n\n\n" + getString(R.string.dvidešimttrečiasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.dvidešimttrečiasAtsakymas) +
                                "\n\n\n" + getString(R.string.dvidešimtketvirtasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.dvidešimtketvirtasAtsakymas) +
                                "\n\n\n" + getString(R.string.dvidešimtpenktasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.dvidešimtpenktasAtsakymas) +
                                "\n\n\n" + getString(R.string.dvidešimtšestasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.dvidešimtšeštasAtsakymas) +
                                "\n\n\n" + getString(R.string.dvidešimtseptintasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.dvidešimtseptintasAtsakymas) +
                                "\n\n\n" + getString(R.string.dvidešimtaštuntasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.dvidešimtaštuntasAtsakymas) +
                                "\n\n\n" + getString(R.string.dvidešimtdevintasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.dvidešimtdevintasAtsakymas) +
                                "\n\n\n" + getString(R.string.trisdešimtasKlausimas) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.trisdešimtasAtsakymas));

                        Button getback = findViewById(R.id.ending_getback);
                        getback.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent goToQuizActivity = new Intent(LithuaniaDateActivity.this, QuizActivity.class);
                                startActivity(goToQuizActivity);
                            }
                        });
                    }
                });
            }
        });


    }

    private void addResultToDB(final List<String> duom) {

        class addResult extends AsyncTask<String, Void, String> {
            ProgressDialog loading;
            DB database = new DB();

            @Override
            protected void onPreExecute() {
                super.onPreExecute();
                loading = ProgressDialog.show(LithuaniaDateActivity.this, getString(R.string.Login_please_wait), null, true, true);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
            }

            @Override
            protected String doInBackground(String... params) {
                HashMap<String, String> data = new HashMap<String, String>();
                data.put("vartotojas", params[0]);
                data.put("kiekis", params[1]);
                data.put("pavadinimas", getText(R.string.project_quiz).toString());
                data.put("minnuokrypis", params[2]);
                data.put("maxnuokrypis", params[3]);
                data.put("neatsakyta", params[4]);

                String result = database.sendPostRequest(getString(R.string.URL_QuizDates), data);

                return result;
            }
        }
        addResult newResult = new addResult();
        newResult.execute(duom.get(0), duom.get(1), duom.get(2), duom.get(3), duom.get(4));
    }

    private void setKlausimus() {
        TextView pirmasklausimas = findViewById(R.id.PirmasKlausimas);
        pirmasklausimas.setText(R.string.pirmasKlausimas);

        TextView antrasklausimas = findViewById(R.id.AntrasKlausimas);
        antrasklausimas.setText(R.string.antrasKlausimas);

        TextView trečiasklausimas = findViewById(R.id.TrečiasKlausimas);
        trečiasklausimas.setText(R.string.trečiasKlausimas);

        TextView ketvirtasklausimas = findViewById(R.id.KetvirtasKlausimas);
        ketvirtasklausimas.setText(R.string.ketvirtasKlausimas);

        TextView penktasklausimas = findViewById(R.id.PenktasKlausimas);
        penktasklausimas.setText(R.string.penktasKlausimas);

        TextView šeštasklausimas = findViewById(R.id.ŠeštasKlausimas);
        šeštasklausimas.setText(R.string.šeštasKlausimas);

        TextView septintasklausimas = findViewById(R.id.SeptintasKlausimas);
        septintasklausimas.setText(R.string.septintasKlausimas);

        TextView aštuntasklausimas = findViewById(R.id.AštuntasKlausimas);
        aštuntasklausimas.setText(R.string.aštuntasKlausimas);

        TextView devintasklausimas = findViewById(R.id.DevintasKlausimas);
        devintasklausimas.setText(R.string.devintasKlausimas);

        TextView dešimtasklausimas = findViewById(R.id.DešimtasKlausimas);
        dešimtasklausimas.setText(R.string.dešimtasKlausimas);

        TextView vienuoliktasklausimas = findViewById(R.id.VienuoliktasKlausimas);
        vienuoliktasklausimas.setText(R.string.vienuoliktasKlausimas);

        TextView dvyliktasklausimas = findViewById(R.id.DvyliktasKlausimas);
        dvyliktasklausimas.setText(R.string.dvyliktasKlausimas);

        TextView tryliktasklausimas = findViewById(R.id.TryliktasKlausimas);
        tryliktasklausimas.setText(R.string.tryliktasKlausimas);

        TextView keturioliktasklausimas = findViewById(R.id.KeturioliktasKlausimas);
        keturioliktasklausimas.setText(R.string.keturioliktasKlausimas);

        TextView penkioliktasklausimas = findViewById(R.id.PenkioliktasKlausimas);
        penkioliktasklausimas.setText(R.string.penkioliktasKlausimas);

        TextView šešioliktasklausimas = findViewById(R.id.ŠešioliktasKlausimas);
        šešioliktasklausimas.setText(R.string.šešioliktasKlausimas);

        TextView septynioliktasklausimas = findViewById(R.id.SeptynioliktasKlausimas);
        septynioliktasklausimas.setText(R.string.septynioliktasKlausimas);

        TextView aštuonioliktasklausimas = findViewById(R.id.AštuonioliktasKlausimas);
        aštuonioliktasklausimas.setText(R.string.aštuonioliktasKlausimas);

        TextView devynioliktasklausimas = findViewById(R.id.DevynioliktasKlausimas);
        devynioliktasklausimas.setText(R.string.devynioliktasKlausimas);

        TextView dvidešimtasklausimas = findViewById(R.id.DvidešimtasKlausimas);
        dvidešimtasklausimas.setText(R.string.dvidešimtasKlausimas);

        TextView dvidešimtpirmasklausimas = findViewById(R.id.DvidešimtpirmasKlausimas);
        dvidešimtpirmasklausimas.setText(R.string.dvidešimtpirmasKlausimas);

        TextView dvidešimtantrasklausimas = findViewById(R.id.DvidešimtantrasKlausimas);
        dvidešimtantrasklausimas.setText(R.string.dvidešimtantrasKlausimas);

        TextView dvidešimttrečiasklausimas = findViewById(R.id.DvidešimttrečiasKlausimas);
        dvidešimttrečiasklausimas.setText(R.string.dvidešimttrečiasKlausimas);

        TextView dvidešimtketvirtasklausimas = findViewById(R.id.DvidešimtketvirtasKlausimas);
        dvidešimtketvirtasklausimas.setText(R.string.dvidešimtketvirtasKlausimas);

        TextView dvidešimtpenktasklausimas = findViewById(R.id.DvidešimtpenktasKlausimas);
        dvidešimtpenktasklausimas.setText(R.string.dvidešimtpenktasKlausimas);

        TextView dvidešimtšeštasklausimas = findViewById(R.id.DvidešimtšeštasKlausimas);
        dvidešimtšeštasklausimas.setText(R.string.dvidešimtšestasKlausimas);

        TextView dvidešimtseptintasklausimas = findViewById(R.id.DvidešimtseptintasKlausimas);
        dvidešimtseptintasklausimas.setText(R.string.dvidešimtseptintasKlausimas);

        TextView dvidešimtaštuntasklausimas = findViewById(R.id.DvidešimtaštuntasKlausimas);
        dvidešimtaštuntasklausimas.setText(R.string.dvidešimtaštuntasKlausimas);

        TextView dvidešimtdevintasklausimas = findViewById(R.id.DvidešimtdevintasKlausimas);
        dvidešimtdevintasklausimas.setText(R.string.dvidešimtdevintasKlausimas);

        TextView trisdešimtasklausimas = findViewById(R.id.TrisdešimtasKlausimas);
        trisdešimtasklausimas.setText(R.string.trisdešimtasKlausimas);
    }
}

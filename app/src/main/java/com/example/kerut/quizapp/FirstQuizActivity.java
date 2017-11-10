package com.example.kerut.quizapp;

import android.app.ProgressDialog;
import android.content.ContentQueryMap;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

public class FirstQuizActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_quiz);

        final RadioGroup nato = (RadioGroup) findViewById(R.id.Nato_RadioButton);
        final RadioButton natoTeisingas = (RadioButton) findViewById(R.id.NATO_2004);
        natoTeisingas.setText(getText(R.string.on2004));

        final RadioGroup karalius = (RadioGroup) findViewById(R.id.Karalius_RadioButton);
        final RadioButton karaliusTeisingas = (RadioButton) findViewById(R.id.Karalius_Mindaugas);
        karaliusTeisingas.setText(getText(R.string.Mindaugas));

        final RadioGroup butiarnebuti = (RadioGroup) findViewById(R.id.Hamletas_RadioButton);
        final RadioButton butiarnebutiTeisingas = (RadioButton) findViewById(R.id.Hamletas);
        butiarnebutiTeisingas.setText(getText(R.string.Hamletas));

        final RadioGroup lygumos = (RadioGroup) findViewById(R.id.Lygumos_RadioButton);
        final RadioButton lygumosTeisingas = (RadioButton) findViewById(R.id.o75);
        lygumosTeisingas.setText(getText(R.string.o75));

        final RadioGroup centras = (RadioGroup) findViewById(R.id.Centras_RadioButton);
        final RadioButton centrasTeisingas = (RadioButton) findViewById(R.id.o1989);
        centrasTeisingas.setText(getText(R.string.o1989));

        final RadioGroup paper = (RadioGroup) findViewById(R.id.Paper_RadioButton);
        final RadioButton paperTeisingas = (RadioButton) findViewById(R.id.newyorktimes);
        paperTeisingas.setText(getText(R.string.newYorkTimes));

        final RadioGroup olimp = (RadioGroup) findViewById(R.id.Olimp_RadioButton);
        final RadioButton olimpTeisingas = (RadioButton) findViewById(R.id.o1924);
        olimpTeisingas.setText(getText(R.string.o1924));

        final RadioGroup internet = (RadioGroup) findViewById(R.id.Internet_RadioButton);
        final RadioButton internetTeisingas = (RadioButton) findViewById(R.id.o45);
        internetTeisingas.setText(getText(R.string.o45));

        final RadioGroup taxes = (RadioGroup) findViewById(R.id.Taxes_RadioButton);
        final RadioButton taxesTeisingas = (RadioButton) findViewById(R.id.x3);
        taxesTeisingas.setText(getText(R.string.x3));

        final RadioGroup duona = (RadioGroup) findViewById(R.id.Duona_RadioButton);
        final RadioButton duonaTeisingas = (RadioButton) findViewById(R.id.o110kg);
        duonaTeisingas.setText(getText(R.string.o110kg));

        Button endQuiz = (Button) findViewById(R.id.firstquiz_endnow);
        endQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<String> data = new ArrayList<String>();
                User user = new User(getApplicationContext());
                data.add(0, user.getUsernameForLogin());

                int kiekis = 0;

                final RadioButton[] natoPasirinktas = new RadioButton[1];
                natoPasirinktas[0] = (RadioButton) findViewById(nato.getCheckedRadioButtonId());
                if (natoTeisingas.getText().toString().equals(natoPasirinktas[0].getText().toString())) {
                    kiekis++;
                }

                final RadioButton[] karaliusPasirinktas = new RadioButton[1];
                karaliusPasirinktas[0] = (RadioButton) findViewById(karalius.getCheckedRadioButtonId());
                if (karaliusTeisingas.getText().toString().equals(karaliusPasirinktas[0].getText().toString())) {
                    kiekis++;
                }

                final RadioButton[] butiarnebutiPasirinktas = new RadioButton[1];
                butiarnebutiPasirinktas[0] = (RadioButton) findViewById(butiarnebuti.getCheckedRadioButtonId());
                if (butiarnebutiTeisingas.getText().toString().equals(butiarnebutiPasirinktas[0].getText().toString())) {
                    kiekis++;
                }

                final RadioButton[] lygumosPasirinktas = new RadioButton[1];
                lygumosPasirinktas[0] = (RadioButton) findViewById(lygumos.getCheckedRadioButtonId());
                if (lygumosTeisingas.getText().toString().equals(lygumosPasirinktas[0].getText().toString())) {
                    kiekis++;
                }

                final RadioButton[] centrasPasirinktas = new RadioButton[1];
                centrasPasirinktas[0] = (RadioButton) findViewById(centras.getCheckedRadioButtonId());
                if (centrasTeisingas.getText().toString().equals(centrasPasirinktas[0].getText().toString())) {
                    kiekis++;
                }

                final RadioButton[] paperPasirinktas = new RadioButton[1];
                paperPasirinktas[0] = (RadioButton) findViewById(paper.getCheckedRadioButtonId());
                if (paperTeisingas.getText().toString().equals(paperPasirinktas[0].getText().toString())) {
                    kiekis++;
                }

                final RadioButton[] olimpPasirinktas = new RadioButton[1];
                olimpPasirinktas[0] = (RadioButton) findViewById(olimp.getCheckedRadioButtonId());
                if (olimpTeisingas.getText().toString().equals(olimpPasirinktas[0].getText().toString())) {
                    kiekis++;
                }

                final RadioButton[] internetPasirinktas = new RadioButton[1];
                internetPasirinktas[0] = (RadioButton) findViewById(internet.getCheckedRadioButtonId());
                if (internetTeisingas.getText().toString().equals(internetPasirinktas[0].getText().toString())) {
                    kiekis++;
                }

                final RadioButton[] taxesPasirinktas = new RadioButton[1];
                taxesPasirinktas[0] = (RadioButton) findViewById(taxes.getCheckedRadioButtonId());
                if (taxesTeisingas.getText().toString().equals(taxesPasirinktas[0].getText().toString())) {
                    kiekis++;
                }

                final RadioButton[] duonaPasirinktas = new RadioButton[1];
                duonaPasirinktas[0] = (RadioButton) findViewById(duona.getCheckedRadioButtonId());
                if (duonaTeisingas.getText().toString().equals(duonaPasirinktas[0].getText().toString())) {
                    kiekis++;
                }

                String kiek = "" + kiekis + "";
                data.add(1, kiek);
                addResultToDB(data);
                setContentView(R.layout.test_ending);


                TextView textView = (TextView) findViewById(R.id.endingsentence);
                if (kiekis < 5)
                    textView.setText("Deja.. Jūs surinkote vos: " + kiekis * 10 + "%");
                else if (kiekis >= 5 && kiekis < 9)
                    textView.setText("Neblogai! Jūs surinkote: " + kiekis * 10 + "%");
                else textView.setText("Puikiai! Jūs surinkote: " + kiekis * 10 + "%");

                Button button = (Button) findViewById(R.id.ending_checkanswers);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        setContentView(R.layout.check_the_answers);

                        TextView correct = (TextView) findViewById(R.id.correctsentence);
                        correct.setText(getString(R.string.Nato) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.on2004) +
                                "\n\n\n" + getString(R.string.Karalius) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.Mindaugas) +
                                "\n\n\n" + getString(R.string.Beornot) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.Hamletas) +
                                "\n\n\n" + getString(R.string.Lygumos) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.o75) +
                                "\n\n\n" + getString(R.string.Centras) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.o1989) +
                                "\n\n\n" + getString(R.string.Paper) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.newYorkTimes) +
                                "\n\n\n" + getString(R.string.Olimp) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.o1924) +
                                "\n\n\n" + getString(R.string.Internet) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.o45) +
                                "\n\n\n" + getString(R.string.Taxes) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.x3) +
                                "\n\n\n" + getString(R.string.Duona) + "\n" + getString(R.string.Correct) + "  " + getString(R.string.o110kg));

                        Button getback = (Button) findViewById(R.id.ending_getback);
                        getback.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {
                                Intent goToQuizActivity = new Intent(FirstQuizActivity.this, QuizActivity.class);
                                startActivity(goToQuizActivity);
                            }
                        });
                    }
                });

                Button getback = (Button) findViewById(R.id.ending_getback);
                getback.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent goToQuizActivity = new Intent(FirstQuizActivity.this, QuizActivity.class);
                        startActivity(goToQuizActivity);
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
                loading = ProgressDialog.show(FirstQuizActivity.this, getString(R.string.Login_please_wait), null, true, true);
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
                loading.dismiss();
            }

            @Override
            protected String doInBackground(String... params) {
                HashMap<String, String> data = new HashMap<String, String>();
                data.put("action", "lithuania");
                data.put("vartotojas", params[0]);
                data.put("kiekis", params[1]);
                data.put("pavadinimas", getText(R.string.test_quiz).toString());

                String result = database.sendPostRequest(getString(R.string.URL_DATABASE), data);

                return result;
            }
        }
        addResult newResult = new addResult();
        newResult.execute(duom.get(0), duom.get(1));
    }
}

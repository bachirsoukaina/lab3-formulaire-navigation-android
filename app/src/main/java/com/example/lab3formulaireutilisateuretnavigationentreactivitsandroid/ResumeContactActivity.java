package com.example.lab3formulaireutilisateuretnavigationentreactivitsandroid;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResumeContactActivity extends AppCompatActivity {

    private TextView txtContenuResume999;
    private Button btnRetourForm999;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resume_contact);

        txtContenuResume999 = findViewById(R.id.txtContenuResume999);
        btnRetourForm999 = findViewById(R.id.btnRetourForm999);

        Intent donneesRecues999 = getIntent();

        String nom999 = donneesRecues999.getStringExtra("info_nom_999");
        String mail999 = donneesRecues999.getStringExtra("info_mail_999");
        String tel999 = donneesRecues999.getStringExtra("info_tel_999");
        String adresse999 = donneesRecues999.getStringExtra("info_adresse_999");
        String ville999 = donneesRecues999.getStringExtra("info_ville_999");

        String texteFinal999 =
                "Nom : " + nettoyerValeur999(nom999) +
                        "\nEmail : " + nettoyerValeur999(mail999) +
                        "\nTéléphone : " + nettoyerValeur999(tel999) +
                        "\nAdresse : " + nettoyerValeur999(adresse999) +
                        "\nVille : " + nettoyerValeur999(ville999);

        txtContenuResume999.setText(texteFinal999);

        btnRetourForm999.setOnClickListener(v -> finish());
    }

    private String nettoyerValeur999(String valeur999) {
        return (valeur999 == null || valeur999.trim().isEmpty()) ? "—" : valeur999.trim();
    }
}
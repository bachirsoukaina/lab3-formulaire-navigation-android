package com.example.lab3formulaireutilisateuretnavigationentreactivitsandroid;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText champNom999, champMail999, champTel999, champAdresse999, champVille999;
    private Button btnAfficherResume999;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        champNom999 = findViewById(R.id.champNom999);
        champMail999 = findViewById(R.id.champMail999);
        champTel999 = findViewById(R.id.champTel999);
        champAdresse999 = findViewById(R.id.champAdresse999);
        champVille999 = findViewById(R.id.champVille999);
        btnAfficherResume999 = findViewById(R.id.btnAfficherResume999);

        btnAfficherResume999.setOnClickListener(v -> {
            String valeurNom999 = champNom999.getText().toString().trim();
            String valeurMail999 = champMail999.getText().toString().trim();
            String valeurTel999 = champTel999.getText().toString().trim();
            String valeurAdresse999 = champAdresse999.getText().toString().trim();
            String valeurVille999 = champVille999.getText().toString().trim();

            if (valeurNom999.isEmpty() || valeurMail999.isEmpty()) {
                Toast.makeText(
                        MainActivity.this,
                        "Le nom et l'adresse email sont obligatoires.",
                        Toast.LENGTH_SHORT
                ).show();
                return;
            }

            Intent passageVersResume999 = new Intent(MainActivity.this, ResumeContactActivity.class);

            passageVersResume999.putExtra("info_nom_999", valeurNom999);
            passageVersResume999.putExtra("info_mail_999", valeurMail999);
            passageVersResume999.putExtra("info_tel_999", valeurTel999);
            passageVersResume999.putExtra("info_adresse_999", valeurAdresse999);
            passageVersResume999.putExtra("info_ville_999", valeurVille999);

            startActivity(passageVersResume999);
        });
    }
}
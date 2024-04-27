package com.example.projet_dessin_interactif;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;  // Pour les écouteurs d'événements comme OnClickListener
import androidx.appcompat.app.AppCompatActivity;  // Base des activités AppCompat

import androidx.appcompat.app.AppCompatActivity;

public class HubActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hub);  // Charger le layout sans app:

        // Références des boutons
        Button btnGallery = findViewById(R.id.btn_gallery);
        Button btnOngoingDrawings = findViewById(R.id.btn_ongoing_drawings);
        Button btnCreateDrawing = findViewById(R.id.btn_create_drawing);
        Button btnMyDrawings = findViewById(R.id.btn_my_drawings);

        // Gérer les clics sur les boutons
        btnGallery.setOnClickListener(v -> {
            Intent intent = new Intent(HubActivity.this, GalerieActivity.class);
            startActivity(intent); // Lance LoginActivity
        });

        btnOngoingDrawings.setOnClickListener(v -> {
            Intent intent = new Intent(HubActivity.this, GalerieCouranteActivity.class);
            startActivity(intent); // Lance LoginActivity
        });

        btnCreateDrawing.setOnClickListener(v -> {
            Intent intent = new Intent(HubActivity.this, Creation_dessin.class);  // Crée un Intent
            startActivity(intent);  // Lance la nouvelle activité
        });

        btnMyDrawings.setOnClickListener(v -> {
            Intent intent = new Intent(HubActivity.this, DessinsActivity.class);
            startActivity(intent); // Lance LoginActivit
        });
    }
}
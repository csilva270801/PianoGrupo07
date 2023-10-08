package com.example.pianogrupo07;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AcercaDe extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_acerca_de);
    }
    public void cuadroDialogo(View view) {
        final String[] opciones = {"Piano tradicional", "Piano instrumental", "Piano Animales", "Salir"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Selecciona una opción")
                .setItems(opciones, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                        String opcionSeleccionada = opciones[which];

                        Intent intent;
                        switch (opcionSeleccionada) {
                            case "Piano tradicional":
                                intent = new Intent(AcercaDe.this, MainActivity.class);
                                startActivity(intent);
                                finish();
                                break;
                            case "Piano instrumental":
                                intent = new Intent(AcercaDe.this, piano_instrumentos.class);
                                startActivity(intent);
                                finish();
                                break;
                            case "Piano Animales":
                                intent = new Intent(AcercaDe.this, piano_animales.class);
                                startActivity(intent);
                                finish();
                                break;
                            case "Salir":

                                finishAffinity();
                                System.exit(0);
                                break;



                        }
                    }
                });
        builder.show();
    }

}
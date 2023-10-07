package com.example.pianogrupo07;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class piano_instrumentos extends AppCompatActivity {
    private ImageButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8;
    MediaPlayer mediaPlayer,mediaPlayerActual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano_instrumentos);

        btn1=findViewById(R.id.btnArpa);
        btn2=findViewById(R.id.btnBateria);
        btn3=findViewById(R.id.btnFlauta);
        btn4=findViewById(R.id.btnGuitarra);
        btn5=findViewById(R.id.btnMaracas);
        btn6=findViewById(R.id.btnMarimba);
        btn7=findViewById(R.id.btnTrompeta);
        btn8=findViewById(R.id.btnTriangulo);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopMediaPlayer(); // Detén cualquier reproducción en curso
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.arpa);
                mediaPlayer.start(); // Reproduce el primer sonido
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopMediaPlayer(); // Detén cualquier reproducción en curso
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bateria);
                mediaPlayer.start(); // Reproduce el segundo sonido
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopMediaPlayer(); // Detén cualquier reproducción en curso
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.flautaa);
                mediaPlayer.start(); // Reproduce el primer sonido
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopMediaPlayer(); // Detén cualquier reproducción en curso
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.guitarra);
                mediaPlayer.start(); // Reproduce el segundo sonido
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopMediaPlayer(); // Detén cualquier reproducción en curso
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.maracas);
                mediaPlayer.start(); // Reproduce el primer sonido
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopMediaPlayer(); // Detén cualquier reproducción en curso
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.marimba);
                mediaPlayer.start(); // Reproduce el primer sonido
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopMediaPlayer(); // Detén cualquier reproducción en curso
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.trompeta_1);
                mediaPlayer.start(); // Reproduce el segundo sonido
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopMediaPlayer(); // Detén cualquier reproducción en curso
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.triangulo);
                mediaPlayer.start(); // Reproduce el primer sonido
            }
        });


    }

    private void stopMediaPlayer() {

        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }

    public void cuadroDialogo(View view) {
        final String[] opciones = {"Piano Animales", "Piano tradicional"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Selecciona una opción")
                .setItems(opciones, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                        String opcionSeleccionada = opciones[which];

                        Intent intent;
                        switch (opcionSeleccionada) {
                            case "Piano Animales":
                                intent = new Intent(piano_instrumentos.this, piano_animales.class);
                                startActivity(intent);
                                finish();
                                break;
                            case "Piano tradicional":
                                intent = new Intent(piano_instrumentos.this, MainActivity.class);
                                startActivity(intent);
                                finish();
                                break;
                        }
                    }
                });
        builder.show();
    }

    public void Cerrar(View view) {
        stopMediaPlayer(); // Detén la reproducción de sonidos
        finishAffinity(); // Cierra todas las actividades de la aplicación
        System.exit(0);

    }


}
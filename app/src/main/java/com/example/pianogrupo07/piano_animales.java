package com.example.pianogrupo07;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class piano_animales extends AppCompatActivity {
    private Button btn1,btn2,btn3,btn4,btn5,btn6,btn7;
    MediaPlayer mediaPlayer,mediaPlayerActual;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piano_animales);
        btn1=findViewById(R.id.btnElefante);
        btn2=findViewById(R.id.btnGallo);
        btn3=findViewById(R.id.btnGato);
        btn4=findViewById(R.id.btnLeon);
        btn5=findViewById(R.id.btnVaca);
        btn6=findViewById(R.id.btnMono);
        btn7=findViewById(R.id.btnPerro);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopMediaPlayer();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.elefante);
                mediaPlayer.start();
                Toast toast= Toast.makeText(getApplicationContext(), R.string.es_el_sonido_de_un_elefante, Toast.LENGTH_SHORT);
                toast.show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        toast.cancel();
                    }
                }, 800);


            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopMediaPlayer();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.gallo);
                mediaPlayer.start();
                Toast toast=Toast.makeText(getApplicationContext(), R.string.es_el_sonido_de_un_gallo, Toast.LENGTH_SHORT);
                toast.show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        toast.cancel();
                    }
                }, 800);

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopMediaPlayer();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.gato);
                mediaPlayer.start();
                Toast toast=Toast.makeText(getApplicationContext(), R.string.es_el_sonido_de_un_gato, Toast.LENGTH_SHORT);
                toast.show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        toast.cancel();
                    }
                }, 800);

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopMediaPlayer();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.lion);
                mediaPlayer.start();
                Toast toast=Toast.makeText(getApplicationContext(), R.string.es_el_sonido_de_un_leon, Toast.LENGTH_SHORT);
                toast.show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        toast.cancel();
                    }
                }, 800);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopMediaPlayer();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.vaca);
                mediaPlayer.start();
                Toast toast=Toast.makeText(getApplicationContext(), R.string.es_el_sonido_de_un_vaca, Toast.LENGTH_SHORT);
                toast.show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        toast.cancel();
                    }
                }, 800);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopMediaPlayer();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.mono);
                mediaPlayer.start();
                Toast toast=Toast.makeText(getApplicationContext(), R.string.es_el_sonido_de_un_mono, Toast.LENGTH_SHORT);
                toast.show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        toast.cancel();
                    }
                }, 800);
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopMediaPlayer();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.perro);
                mediaPlayer.start();
                Toast toast= Toast.makeText(getApplicationContext(), R.string.es_el_sonido_de_un_perro, Toast.LENGTH_SHORT);
                toast.show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        toast.cancel();
                    }
                }, 800);
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
        stopMediaPlayer();
        final String[] opciones = {"Piano tradicional", "Piano instrumental"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Selecciona una opción")
                .setItems(opciones, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                        String opcionSeleccionada = opciones[which];

                        Intent intent;
                        switch (opcionSeleccionada) {
                            case "Piano tradicional":
                                stopMediaPlayer();
                                intent = new Intent(piano_animales.this, MainActivity.class);
                                startActivity(intent);
                                finish();
                                break;
                            case "Piano instrumental":
                                stopMediaPlayer();
                                intent = new Intent(piano_animales.this, piano_instrumentos.class);
                                startActivity(intent);
                                finish();
                                break;
                        }
                    }
                });
        builder.show();
    }
    public void salir(View view){
        stopMediaPlayer();
        finishAffinity();
        System.exit(0);

    }


    public void Acercade(View view) {
        stopMediaPlayer();
        Intent intent;
        intent = new Intent(piano_animales.this, AcercaDe.class);
        startActivity(intent);
        finish();


    }
}
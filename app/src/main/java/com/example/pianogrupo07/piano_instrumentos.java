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
                stopMediaPlayer();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.arpa);
                mediaPlayer.start();
                Toast toast = Toast.makeText(getApplicationContext(), R.string.es_el_sonido_de_una_arpa, Toast.LENGTH_SHORT);
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
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bateria);
                mediaPlayer.start();
                Toast toast = Toast.makeText(getApplicationContext(), R.string.es_el_sonido_de_una_bateria, Toast.LENGTH_SHORT);
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
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.flautaa);
                mediaPlayer.start();
                Toast toast = Toast.makeText(getApplicationContext(), R.string.es_el_sonido_de_una_flauta, Toast.LENGTH_SHORT);
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
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.guitarra);
                mediaPlayer.start();
                Toast toast = Toast.makeText(getApplicationContext(), R.string.es_el_sonido_de_una_guitarra, Toast.LENGTH_SHORT);
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
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.maracas);
                mediaPlayer.start();
                Toast toast = Toast.makeText(getApplicationContext(), R.string.es_el_sonido_de_unas_maracas, Toast.LENGTH_SHORT);
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
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.marimba);
                mediaPlayer.start();
                Toast toast = Toast.makeText(getApplicationContext(), R.string.es_el_sonido_de_una_marimba, Toast.LENGTH_SHORT);
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
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.trompeta_1);
                mediaPlayer.start();
                Toast toast = Toast.makeText(getApplicationContext(), R.string.es_el_sonido_de_una_trompeta, Toast.LENGTH_SHORT);
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
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                stopMediaPlayer();
                mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.triangulo);
                mediaPlayer.start();
                Toast toast = Toast.makeText(getApplicationContext(), R.string.es_el_sonido_de_un_triangulo, Toast.LENGTH_SHORT);
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
    public void salir(View view){
        stopMediaPlayer();
        finishAffinity();
        System.exit(0);

    }


    public void Acercade(View view) {
        stopMediaPlayer();
        Intent intent;
        intent = new Intent(piano_instrumentos.this, AcercaDe.class);
        startActivity(intent);
        finish();


    }




}
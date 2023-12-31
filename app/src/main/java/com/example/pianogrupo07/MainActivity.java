package com.example.pianogrupo07;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer,mediaPlayerActual;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SonidoDo(View view) {
        MediaPlayer sonido = MediaPlayer.create(MainActivity.this, R.raw.do1);
        Toast toast= Toast.makeText(MainActivity.this, R.string.nota_musical_do, Toast.LENGTH_SHORT);
        toast.show();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                toast.cancel();
            }
        }, 600);
        if (sonido.isPlaying()){
            sonido.stop();
        } else {
            try{
                sonido.start();
            } catch (IllegalStateException e){
                e.printStackTrace();
            }
        }
    }

    public void SonidoRe(View view) {
        MediaPlayer sonido = MediaPlayer.create(MainActivity.this, R.raw.re);
        Toast toast= Toast.makeText(MainActivity.this, R.string.nota_musical_re, Toast.LENGTH_SHORT);
        toast.show();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                toast.cancel();
            }
        }, 600);
        if (sonido.isPlaying()){
            sonido.stop();
        } else {
            try{
                sonido.start();
            } catch (IllegalStateException e){
                e.printStackTrace();
            }
        }
    }

    public void SonidoMi(View view) {
        MediaPlayer sonido = MediaPlayer.create(MainActivity.this, R.raw.mi);
        Toast toast= Toast.makeText(MainActivity.this, R.string.nota_musical_mi, Toast.LENGTH_SHORT);
        toast.show();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                toast.cancel();
            }
        }, 600);
        if (sonido.isPlaying()){
            sonido.stop();
        } else {
            try{
                sonido.start();
            } catch (IllegalStateException e){
                e.printStackTrace();
            }
        }
    }

    public void SonidoFa(View view) {
        MediaPlayer sonido = MediaPlayer.create(MainActivity.this, R.raw.fa);
        Toast toast = Toast.makeText(MainActivity.this, R.string.nota_musical_fa, Toast.LENGTH_SHORT);
        toast.show();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                toast.cancel();
            }
        }, 600);
        if (sonido.isPlaying()){
            sonido.stop();
        } else {
            try{
                sonido.start();
            } catch (IllegalStateException e){
                e.printStackTrace();
            }
        }
    }

    public void SonidoSol(View view) {
        MediaPlayer sonido = MediaPlayer.create(MainActivity.this, R.raw.sol);
        Toast toast= Toast.makeText(MainActivity.this, R.string.nota_musical_sol, Toast.LENGTH_SHORT);
        toast.show();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                toast.cancel();
            }
        }, 600);
        if (sonido.isPlaying()){
            sonido.stop();
        } else {
            try{
                sonido.start();
            } catch (IllegalStateException e){
                e.printStackTrace();
            }
        }
    }

    public void SonidoLa(View view) {
        MediaPlayer sonido = MediaPlayer.create(MainActivity.this, R.raw.la);
        Toast toast=Toast.makeText(MainActivity.this, R.string.nota_musical_la, Toast.LENGTH_SHORT);
        toast.show();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                toast.cancel();
            }
        }, 600);
        if (sonido.isPlaying()){
            sonido.stop();
        } else {
            try{
                sonido.start();
            } catch (IllegalStateException e){
                e.printStackTrace();
            }
        }
    }

    public void SonidoSi(View view) {

        MediaPlayer sonido = MediaPlayer.create(MainActivity.this, R.raw.si);
        Toast toast= Toast.makeText(MainActivity.this, R.string.nota_musical_si, Toast.LENGTH_SHORT);
        toast.show();
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                toast.cancel();
            }
        }, 600);
        if (sonido.isPlaying()){
            sonido.stop();
        } else {
            try{
                sonido.start();
            } catch (IllegalStateException e){
                e.printStackTrace();
            }
        }
    }

    public void cuadroDialogo(View view) {
        stopMediaPlayer();
        final String[] opciones = {"Piano Animales", "Piano instrumental"};

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Selecciona una opción")
                .setItems(opciones, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {

                        String opcionSeleccionada = opciones[which];

                        Intent intent;
                        switch (opcionSeleccionada) {
                            case "Piano Animales":
                                intent = new Intent(MainActivity.this, piano_animales.class);
                                startActivity(intent);
                                finish();
                                break;
                            case "Piano instrumental":
                                intent = new Intent(MainActivity.this, piano_instrumentos.class);
                                startActivity(intent);
                                finish();
                                break;

                        }
                    }
                });
        builder.show();
    }
    private void stopMediaPlayer() {

        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.stop();
            mediaPlayer.release();
            mediaPlayer = null;
        }
    }
    public void salir(View view){
        stopMediaPlayer();
        finishAffinity();
        System.exit(0);

    }


    public void Acercade(View view) {
        stopMediaPlayer();
        Intent intent;
        intent = new Intent(MainActivity.this, AcercaDe.class);
        startActivity(intent);
        finish();


    }



}
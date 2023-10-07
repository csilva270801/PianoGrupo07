package com.example.pianogrupo07;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SonidoDo(View view) {
        MediaPlayer sonido = MediaPlayer.create(MainActivity.this, R.raw.do1);
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

    public void Cerrar(View view) {
        //stopMediaPlayer(); // Detén la reproducción de sonidos
        finishAffinity(); // Cierra todas las actividades de la aplicación
        System.exit(0);

    }
}
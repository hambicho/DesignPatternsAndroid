package com.example.hambicho.di1_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import Classes.Barcelona;
import Classes.Jugador;
import Classes.Juventus;
import Interfaces.IEquipo;

public class MainActivity extends AppCompatActivity {

    Button btnBarcelona;
    Button btnJuventus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnBarcelona = (Button)findViewById(R.id.btnBarcelona); // Ahora no es necesario
        btnJuventus = (Button)findViewById(R.id.btnJuventus); // Ahora no es necesario
    }

    public void touchBarcelona(View v){
        IEquipo equipo = new Barcelona();
        Jugador messi = new Jugador(equipo);
        messi.mostrarEquipo();
    }

    public void touchJuventus(View v){
        IEquipo equipo = new Juventus();
        Jugador messi = new Jugador(equipo);
        messi.mostrarEquipo();
    }
}

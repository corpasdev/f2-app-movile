package com.example.formativa2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.formativa2.adaptador.ListaHeroesAdaptador;
import com.example.formativa2.clases.Heroes;
import com.example.formativa2.clases.HeroesData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvList;
    private ArrayList<Heroes> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvList = findViewById(R.id.rvList);
        rvList.setHasFixedSize(true);
        list = new ArrayList<>();
        list.addAll(HeroesData.obtenerListaDatos());

        showRecyclerList();
    }


    private void showRecyclerList() {
        rvList.setLayoutManager(new LinearLayoutManager(this));
        ListaHeroesAdaptador listaHeroesAdaptador = new ListaHeroesAdaptador(this);
        listaHeroesAdaptador.setListHeroes(list);
        rvList.setAdapter(listaHeroesAdaptador);
    }

}

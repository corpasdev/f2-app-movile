package com.example.formativa2.adaptador;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.formativa2.R;
import com.example.formativa2.clases.Heroes;


import java.util.ArrayList;

public class ListaHeroesAdaptador extends RecyclerView.Adapter<ListaHeroesAdaptador.CategoryViewHolder> {

    private Context contexto;



    private ArrayList<Heroes> obtenerListaHeroes() {
        return listaHeroes;
    }

    public void setListHeroes(ArrayList<Heroes> listaHeroes) {
        this.listaHeroes = listaHeroes;
    }

    private ArrayList<Heroes> listaHeroes;

    public ListaHeroesAdaptador(Context context) {
        this.contexto = contexto;
    }

    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemRow = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_heroes, parent, false);
        return new CategoryViewHolder(itemRow);
    }


    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        holder.tvNombre.setText(obtenerListaHeroes().get(position).getNombre());
        holder.tvComentarios.setText(obtenerListaHeroes().get(position).getComentarios());

        Glide.with(contexto)
                .load(obtenerListaHeroes().get(position).getFoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgFoto);
    }

    @Override
    public int getItemCount() {
        return obtenerListaHeroes().size();
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder {
        TextView tvNombre;
        TextView tvComentarios;
        ImageView imgFoto;

        CategoryViewHolder(View vistaItem) {
            super(vistaItem);
            tvNombre = vistaItem.findViewById(R.id.tv_nombre_item);
            tvComentarios = vistaItem.findViewById(R.id.tv_comentarios_item);
            imgFoto = vistaItem.findViewById(R.id.img_foto_item);
        }
    }
}

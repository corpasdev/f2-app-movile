package com.example.formativa2.clases;

import java.util.ArrayList;

public class HeroesData {
    public static String[][] datos = new String[][]{
            {"Simón Bolívar", "Simón Bolívar fue un militar y político venezolano, una de las figuras más destacadas de la emancipación americana del y uno de los más influyentes en la historia de América", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/Sim%C3%B3n_Bol%C3%ADvar._Toro_Moreno%2C_Jos%C3%A9._1922%2C_Legislative_Palace%2C_La_Paz.png/220px-Sim%C3%B3n_Bol%C3%ADvar._Toro_Moreno%2C_Jos%C3%A9._1922%2C_Legislative_Palace%2C_La_Paz.png"},
            {"José de San Martín", "José de San Martín fue un militar y político argentino, cuyas campañas fueron decisivas para las independencias de Argentina, Chile y Perú", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d1/Jos%C3%A9_de_San_Mart%C3%ADn_%28retrato%2C_c.1828%29.jpg/220px-Jos%C3%A9_de_San_Mart%C3%ADn_%28retrato%2C_c.1828%29.jpg"},
            {"Miguel Hidalgo", "Miguel Hidalgo fue un sacerdote y militar mexicano, iniciador de la Independencia de México con su llamado a la rebelión conocido como el Grito de Dolores", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ad/General%C3%ADsimo_Miguel_Hidalgo_y_Costilla.png/220px-General%C3%ADsimo_Miguel_Hidalgo_y_Costilla.png"},
            {"Bernardo O'Higgins", "Bernardo O'Higgins fue un político y militar chileno, conocido como el 'Libertador de Chile' por su papel en la independencia de ese país", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/Ohiggins.jpg/220px-Ohiggins.jpg"},
            {"Túpac Amaru II", "Túpac Amaru II fue un líder indígena peruano, quien lideró una rebelión contra el dominio español en el Virreinato del Perú", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/31/Acuarela_de_T%C3%BApac_Amaru_II_crop.jpg/220px-Acuarela_de_T%C3%BApac_Amaru_II_crop.jpg"},
            {"Benito Juárez", "Benito Juárez fue un abogado y político mexicano, presidente de México en varias ocasiones y uno de los líderes más importantes en la historia de México", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/ac/Retrato_de_Benito_Ju%C3%A1rez%2C_1861-1862.png/220px-Retrato_de_Benito_Ju%C3%A1rez%2C_1861-1862.png"}
    };

    public static ArrayList<Heroes> obtenerListaDatos(){
        Heroes heroe = null;
        ArrayList<Heroes> lista = new ArrayList<>();
        for (String[] dato : datos) {
            heroe = new Heroes();
            heroe.setNombre(dato[0]);
            heroe.setComentarios(dato[1]);
            heroe.setFoto(dato[2]);

            lista.add(heroe);
        }

        return lista;
    }
}

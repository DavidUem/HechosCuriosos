package com.example.david.hechoscuriosos;

import android.content.Context;
import android.content.res.Resources;

import java.util.Random;

/**
 * Created by David on 11/11/14.
 */
public class FactBook {

    private   Random rnd;


    FactBook(){
         rnd = new Random();
    }

    String [] a ;

            /*= { "Las hormigas se estiran cuando se despiertan por la mañana.",
            "Las avestruces pueden correr más rápido que los caballos.",
            "Las medallas de oro de los juegos olímpicos están hechas de plata.",
            "Naciste con 300 huesos, pero en la edad adulta tendrás solo 206.",
            "Toma unos 8 minutos en llegar la luz del sol a la tierra.",
            "Algunas plantas de bambu pueden crecer hasta un metro al día.",
            "El estado de Florida es más grande que Inglaterra.",
            "Algunos pingüinos pueden saltar de 2 a 3 metros por encima"};

*/

public String getRandomFact(Context context){

    Resources res = context.getResources();
    a = res.getStringArray(R.array.hechos_curiosos);
    return a[rnd.nextInt(a.length)];

}

}
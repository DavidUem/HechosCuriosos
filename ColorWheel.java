package com.example.david.hechoscuriosos;
import android.graphics.Color;
import android.widget.RelativeLayout;

import java.util.Random;
/**
 * Created by David on 11/11/14.
 */
public class ColorWheel {


    public static String [] colours= {
                "#39add1", // light blue
                "#3079ab", // dark blue
                "#c25975", // mauve
                "#e15258", // red
                "#f9845b", // orange
                "#838cc7", // lavender
                "#7d669e", // purple
                "#53bbb4", // aqua
                "#51b46d", // green
                "#e0ab18", // mustard
                "#637a91", // dark gray
                "#f092b0", // pink
                "#b7c0c7" // light gray
    };
    public static int getRandomColor( ) {
        Random randomGenerator = new Random(); //Construct new Random number Generator
        int randomNumber = randomGenerator.nextInt(colours.length); // limit to three
        return Color.parseColor(colours[randomNumber]);
    }

}

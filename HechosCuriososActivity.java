package com.example.david.hechoscuriosos;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;




public class HechosCuriososActivity extends Activity {


//Declare the new View Variables
    RelativeLayout fondo;
    int x;
    TextView factLabel;
    FactBook factbook;
    private TextView textView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hechos_curiosos);
        factLabel = (TextView) findViewById(R.id.HechoCuriosoTextView);
        fondo = (RelativeLayout) findViewById(R.id.fondo);
        factbook = new FactBook();

    }

    public void factButtonAction(View view) {

        TextView factLabel = (TextView) findViewById(R.id.HechoCuriosoTextView);
        factLabel.setText(factbook.getRandomFact());
        fondo.setBackgroundColor(ColorWheel.getRandomColor());


    }

    public void changeBackgroundColor(){

        int color = ColorWheel.getRandomColor();
        fondo.setBackgroundColor(color);





    }

}

package com.android.angel.climalistaintent;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;


public class NuevaVentana extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva_ventana);

        TextView texto=(TextView) findViewById(R.id.titulo);

        Bundle bd= getIntent().getExtras();
        String titulo = bd.getString("titulo");

        texto.setText(titulo);

    }

}

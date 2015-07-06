package com.android.angel.climalistaintent;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class NuevaVentana extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nueva_ventana);

        TextView a=(TextView) findViewById(R.id.titulo);
        TextView d=(TextView) findViewById(R.id.subtitulo);
        ImageView imageView=(ImageView) findViewById(R.id.imagen);
        Bundle b= getIntent().getExtras();
        String titulo = b.getString("titulo");
        String subtitulo = b.getString("subtitulo");
        int foto = b.getInt("imagen");

        a.setText(titulo);
        d.setText(subtitulo);
        imageView.setImageResource(foto);

        Button boton= (Button) findViewById(R.id.boton);
        boton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent i=new Intent(NuevaVentana.this, MainActivity.class);
                        startActivity(i);
                    }
                }
        );
        //String id=getIntent().getExtras().getString("id");
        //Bundle bd= getIntent().getExtras();
        //String titulo = bd.getString("titulo");

        //texto.setText(id);

    }

}

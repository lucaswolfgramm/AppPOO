package com.example.douglas.apppoo;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

/**
 * Created by Douglas on 31/08/2016.
 */
public class TelaEditar extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar);

        Button ok = (Button) findViewById(R.id.btSalvarAlteracao);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(TelaEditar.this);
                alerta.setTitle("Aviso");
                alerta
                        .setIcon(R.mipmap.alerta)
                        .setMessage("Confirma a alteraçao do contato?")
                        .setCancelable(false)
                        .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Cancelada a alteração do contato!", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                SystemClock.sleep(500);
                                Toast.makeText(getApplicationContext(), "Alteração realizada com sucesso!", Toast.LENGTH_SHORT).show();
                                finish();
                            }
                        });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();


            }
        });

    }
    public void cancelarEditar (View v){

        finish();
    }


}

package com.example.douglas.apppoo;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


/**
 * Created by Douglas on 31/08/2016.
 */
public class TelaMenu extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_menu);
    }
    public void chamarHome (View v){
        Intent home = new Intent(this, MainActivity.class);
        startActivity(home);
    }
    public void chamarAdicionar (View v){
        Intent adicionar = new Intent(this, TelaActivity.class);
        startActivity(adicionar);
    }
    public void chamarAlterar (View v){
        Intent alterar = new Intent(this, TelaEditar.class);
        startActivity(alterar);
    }
    public void cancelarMenu (View v){

        finish();
    }
}

package com.example.douglas.apppoo;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.preference.DialogPreference;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Created by Douglas on 31/08/2016.
 */
public class TelaActivity extends Activity {


    ArrayList<TelaActivity> lista = new ArrayList<>();

    private String nome;
    private String telefone;
    private String celular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar);

        /*final EditText nome, telefone, celular;*/



        /*Toast.makeText(getApplicationContext(), "Inclusão realizada com sucesso! " + "Nome:" + nome.getText().toString() + "Telefone: " + telefone.getText().toString() + "Celular: " + celular.getText().toString(), Toast.LENGTH_LONG).show();*/

        Button ok = (Button) findViewById(R.id.btSalvar);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alerta = new AlertDialog.Builder(TelaActivity.this);
                alerta.setTitle("Aviso");
                alerta
                        .setIcon(R.mipmap.alerta)
                        .setMessage("Confirma a inclusão do contato?")
                        .setCancelable(false)
                        .setNegativeButton("Cancelar", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "Cancelada a inclusão do contato!", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                SystemClock.sleep(500);

                                EditText nome = (EditText) findViewById(R.id.editTextNome);
                                EditText telefone = (EditText) findViewById(R.id.editTelefone);
                                EditText celular = (EditText) findViewById(R.id.editCelular);



                                MainActivity chamarMetodo = new MainActivity();  //instanciando
                                MainActivity chamarMetodo2 = new MainActivity();  //instanciando

                                String nomeVar;
                                String telefoneVar;
                                String celularVar;

                                nomeVar = nome.getText().toString();
                                telefoneVar = telefone.getText().toString();
                                celularVar = celular.getText().toString();



                                /*chamarMetodo.Inserir(nomeVar, telefoneVar, celularVar);

                                chamarMetodo2.listarContato();*/

                                /*incluirContato(nomeVar, telefoneVar, celularVar);

                                listarContato();*/

                                /*Toast.makeText(getApplicationContext(), "Dados:  " + nomeVar + telefoneVar + celularVar /*+ "Nome:" + nome.getText().toString() + "Telefone: " + telefone.getText().toString() + "Celular: " + celular.getText().toString(), Toast.LENGTH_LONG).show();*/

                                Toast.makeText(getApplicationContext(), "Inclusão realizada com sucesso! ", Toast.LENGTH_LONG).show();
                                finish();
                            }
                        });
                AlertDialog alertDialog = alerta.create();
                alertDialog.show();


            }
        });
    }
    public void cancelar (View v){

        finish();
    }
    public void chamarMenu (View v){
        Intent menu = new Intent(this, TelaMenu.class);
        startActivity(menu);
    }

    public void incluirContato(String nome, String telefone, String celular){

        TelaActivity dados = new TelaActivity();

        dados.setNome(nome);
        dados.setTelefone(telefone);
        dados.setCelular(celular);

        lista.add(dados);

        /*Toast.makeText(this, "Teste Entrou:  ", Toast.LENGTH_LONG).show();*/

    }

    public void listarContato(){

        for (TelaActivity dados : lista) {
           Toast.makeText(getApplicationContext(), "Nome:" + dados.getNome().toString() + "Telefone:" + dados.getTelefone().toString() + "Celular:" + dados.getCelular().toString(), Toast.LENGTH_SHORT).show();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

}

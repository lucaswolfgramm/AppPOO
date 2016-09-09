package com.example.douglas.apppoo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends Activity {

    ImageButton btAdicionarContato;
    ImageButton btMenu;
    ImageButton btEditar;
    ImageButton btExcluir;
    ImageButton btHome;

    private String nome;
    private String telefone;
    private String celular;

    ArrayList<MainActivity> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btAdicionarContato = (ImageButton) findViewById(R.id.btAdicionarContato);
        btAdicionarContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TelaActivity.class);
                startActivity(intent);

            }
        });

        btMenu = (ImageButton) findViewById(R.id.btMenu);
        btMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TelaMenu.class);
                startActivity(intent);

            }
        });

        btEditar = (ImageButton) findViewById(R.id.btEditar);
        btEditar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TelaEditar.class);
                startActivity(intent);

            }
        });

        btExcluir = (ImageButton) findViewById(R.id.btExcluir);
        btExcluir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TelaExcluir.class);
                startActivity(intent);

            }
        });



        ListView lista = (ListView) findViewById(R.id.lvNomes);;

        final ArrayList<String> nomes = preencherDados();

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_checked, nomes);

        lista.setAdapter(arrayAdapter);

        lista.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Nome:" + nomes.get(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
    public ArrayList<String> preencherDados(){
        ArrayList<String> dados = new ArrayList<String>();

        dados.add("Douglas Steuernagel");
        dados.add("Lucas Wolfgramm");
        dados.add("Gustavo Cesa Muchon");
        dados.add("Lupita");
        dados.add("Muxom");
        dados.add("Steuernagel");
        dados.add("Cesar");
        dados.add("Foda");
        dados.add("Douglas Steuernagel");
        dados.add("Lucas Wolfgramm");
        dados.add("Gustavo Cesa Muchon");
        dados.add("Lupita");
        dados.add("Muxom");
        dados.add("Steuernagel");
        dados.add("Cesar");
        dados.add("Foda");
        dados.add("Douglas Steuernagel");
        dados.add("Lucas Wolfgramm");
        dados.add("Gustavo Cesa Muchon");
        dados.add("Lupita");
        dados.add("Muxom");
        dados.add("Steuernagel");
        dados.add("Cesar");
        dados.add("Foda");
        dados.add("Douglas Steuernagel");
        dados.add("Lucas Wolfgramm");
        dados.add("Gustavo Cesa Muchon");
        dados.add("Lupita");
        dados.add("Muxom");
        dados.add("Steuernagel");
        dados.add("Cesar");
        dados.add("Foda");

        return dados;
    }

    public void incluirContato(String nome, String telefone, String celular){

        MainActivity dados = new MainActivity();

        dados.setNome(nome);
        dados.setTelefone(telefone);
        dados.setCelular(celular);

        lista.add(dados);

        /*Toast.makeText(this, "Teste Entrou:  ", Toast.LENGTH_LONG).show();*/

    }

    public ArrayList<MainActivity> Inserir(String nome, String telefone, String celular){


        MainActivity dados = new MainActivity();

        dados.setNome(nome);
        dados.setTelefone(telefone);
        dados.setCelular(celular);

        lista.add(dados);

        return lista;


    }

    public void listarContato(){

       for (MainActivity dados : lista) {
           /*Toast.makeText(getApplicationContext(), "Nome:" + dados.getNome().toString() + "Telefone:" + dados.getTelefone().toString() + "Celular:" + dados.getCelular().toString(), Toast.LENGTH_SHORT).show();*/
        }
    }

    public void onClickIncluir (View v){
        startActivityForResult(
                new Intent(this, TelaActivity.class), 1);
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

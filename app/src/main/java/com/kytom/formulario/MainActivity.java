package com.kytom.formulario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText nombre;
    private EditText email;
    private EditText telefono;
    private Button btn_enviar;
    private ListView listView;
    private List<String> Lista = new ArrayList<>();
    private ArrayAdapter<String> Adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = findViewById(R.id.nombre);
        email = findViewById(R.id.email);
        telefono = findViewById(R.id.telefono);
        btn_enviar = findViewById(R.id.btn_enviar);
        listView = findViewById(R.id.listview_datos);

        btn_enviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nombre_valor = nombre.getText().toString();
                String email_valor = email.getText().toString();
                String telefono_valor = telefono.getText().toString();
                Lista.add(nombre_valor + " " + email_valor + " "+ telefono_valor);
                Adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, Lista);
                listView.setAdapter(Adapter);
            }
        });

    }
}
package com.manoloscorp.dimdim;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.manoloscorp.dimdim.Fragments.BlankFragment;
import com.manoloscorp.dimdim.ViewModel.ClienteViewModel;

public class MainActivity extends AppCompatActivity {


    private LinearLayout container;
    private EditText inputCPF;
    private Button btnIniciar;


    private ClienteViewModel clienteViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = findViewById(R.id.container);
        inputCPF = findViewById(R.id.inputCPF);
        btnIniciar = findViewById(R.id.btnIniciar);


        clienteViewModel = ViewModelProviders.of(this).get(ClienteViewModel.class);

        btnIniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                container.setVisibility(View.VISIBLE);
                getSupportFragmentManager().beginTransaction()
                        .add(R.id.container, new BlankFragment())
                        .commit();
            }
        });
}
}

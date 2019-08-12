package com.example.aluno.otimizadordetempo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddActivity extends AppCompatActivity {


    private PreferenciaHorario horario;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();*/
                startActivity(new Intent(AddActivity.this, PreferenciaHorario.class));
            }
        });

    }




}

package com.example.aluno.otimizadordetempo;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        NotificationManager nm = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Toast.makeText(MainActivity.this, "", Toast.LENGTH_SHORT).show();*/
                startActivity(new Intent(MainActivity.this, AddActivity.class));
            }
        });

    }
}

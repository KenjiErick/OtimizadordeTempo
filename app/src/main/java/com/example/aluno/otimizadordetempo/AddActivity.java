package com.example.aluno.otimizadordetempo;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AddActivity extends AppCompatActivity {
    private Button button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);



        button2 = (Button) findViewById(R.id.button);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                public void gerarNotificacao(View view){

                    NotificationManager nm = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
                    PendingIntent p = PendingIntent.getActivity(AddActivity.this,0, new Intent(AddActivity.this, MainActivity.class), 0);

                    NotificationCompat.Builder builder = new NotificationCompat.Builder(AddActivity.this);
                    builder.setTicker("Ticker Texto");
                    builder.setContentTitle("Título");
                    builder.setContentText("Descrição");
                    builder.setContentIntent(p);

                    NotificationCompat.InboxStyle style = new NotificationCompat.InboxStyle();
                    String [] descs = new String[]{"Descrição 1", "Descrição 2", "Descrição 3", "Descrição 4"};

                    for(int i = 0; i < descs.length; i++){
                        style.addLine(descs[i]);
                    }
                    builder.setStyle(style);

                    Notification n = builder.build();
                    n.vibrate = new long[]{150, 300, 150, 600};
                    n.flags = Notification.FLAG_AUTO_CANCEL;

                    try{
                        Uri som = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
                        Ringtone toque = RingtoneManager.getRingtone(AddActivity.this, som);
                        toque.play();
                    }
                    catch(Exception e){
                        Toast.makeText(AddActivity.this, "Erro!", Toast.LENGTH_SHORT).show();
                    }
//                }
            }
        });

    }
}

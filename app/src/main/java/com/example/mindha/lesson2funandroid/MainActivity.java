package com.example.mindha.lesson2funandroid;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private ScrollView funbgcolor;
    private ImageView logo;
    private TextView text;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = (ImageView)findViewById(R.id.imageView);
        text = (TextView)findViewById(R.id.text);
        btn = (Button)findViewById(R.id.btn_login);

        funbgcolor = (ScrollView) findViewById(R.id.activity);

        final int[] droid = {
                R.drawable.psyduck, R.drawable.dratini, R.drawable.eevee, R.drawable.jigglypuff, R.drawable.meowth
        };

        final String[] chac ={
                "PSYDUCK","DRATINI","EEVEE", "JIGGLYPUFF", "MEOWTH"
        };

        final String[] color ={
                "#92CCD3","#F8AB39","#088E6B", "#D7DBDF", "#01A3BF"
        };


        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Random random = new Random();
                int number = random.nextInt(5);
                Toast.makeText(MainActivity.this,"Character "+chac[number], Toast.LENGTH_SHORT).show();
                funbgcolor.setBackgroundColor(Color.parseColor(color[number]));
                logo.setImageResource(droid[number]);
                text.setText(chac[number]);
            }
        });

    }
}

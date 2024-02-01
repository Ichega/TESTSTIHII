package ru.yatsevyuk.r.r.company.teststihii;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Again = findViewById(R.id.AgainButton);
        ImageView Image = findViewById(R.id.imageView);
        TextView Textmain = findViewById(R.id.stihiaInfoTextView);
        TextView Textname = findViewById(R.id.stihiaNameTextView);
        Button Info = findViewById(R.id.MainButton);
        TextView Textinfo = findViewById(R.id.textView);
        Again.setVisibility(Button.INVISIBLE);
        Again.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              recreate();
            }
        });
        Info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Textinfo.setVisibility(Button.INVISIBLE);
                Info.setVisibility(TextView.INVISIBLE);
                Again.setVisibility(Button.VISIBLE);
                String[] phrases = {"АНЕМО", "ГЕО", "КРИО", "ПИРО", "ЭЛЕКТРО", "ДЕНДРО", "ГИДРО"};
                Shuffle(phrases);
                Textname.setText(phrases[0]);

                if (Textname.getText().toString().equals("ПИРО")) {
                    Image.setImageResource(R.drawable.pyro);
                    Textmain.setText(R.string.pyro);
                } else if (Textname.getText().toString().equals("АНЕМО")) {
                    Image.setImageResource(R.drawable.anemo);
                    Textmain.setText(R.string.anemo);
                } else if (Textname.getText().toString().equals("ГЕО")) {
                    Image.setImageResource(R.drawable.geo);
                    Textmain.setText(R.string.geo);
                } else if (Textname.getText().toString().equals("КРИО")) {
                    Image.setImageResource(R.drawable.cryo);
                    Textmain.setText(R.string.cryo);;
                } else if (Textname.getText().toString().equals("ЭЛЕКТРО")) {
                    Image.setImageResource(R.drawable.electro);
                    Textmain.setText(R.string.electro);
                } else if (Textname.getText().toString().equals("ДЕНДРО")) {
                    Image.setImageResource(R.drawable.dendro);
                    Textmain.setText(R.string.dendro);
                } else if (Textname.getText().toString().equals("ГИДРО")) {
                    Image.setImageResource(R.drawable.hydro);
                    Textmain.setText(R.string.hydro);
                }

                }
        });
    }


    void Shuffle(String[] ar) {
        Random rnd = new Random();
        for (int i = ar.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            String a = ar[index];
            ar[index] = ar[i];
            ar[i] = a;
        }
    }
}

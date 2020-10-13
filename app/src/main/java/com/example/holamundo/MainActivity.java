package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    Button button1;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.button1);
        textView = findViewById(R.id.textView);

        //button1.setText("PATATA");
        //textView.setText("Tomatito");
        button1.setOnLongClickListener(new View.OnLongClickListener()
        {
            @Override
            public boolean onLongClick(View v)
            {
                 textView.setText("¡¡¡¡DEJAMEEEEEE!!!!");
                 return true;
            }
        });
    }


    public void button1_onClick(View v)
    {
        if(textView.getText().length() == 0)
        {
            textView.setText("Hola mundo");
        }
        else
        {
            textView.setText("");
        }

    }
}

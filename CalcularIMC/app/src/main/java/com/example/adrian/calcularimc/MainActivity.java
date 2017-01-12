package com.example.adrian.calcularimc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button botonCalcular = (Button)findViewById(R.id.calcular);
        final EditText edit_altura = (EditText)findViewById(R.id.edit_altura);
        final EditText edit_peso = (EditText) findViewById(R.id.edit_peso);
        final TextView text_resultado = (TextView) findViewById(R.id.textViewResultado);

        botonCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String peso = edit_peso.getText().toString();
                final int pesoInt = Integer.parseInt(peso);
                Log.d(peso,""+pesoInt);

                String altura = edit_altura.getText().toString();
                final int alturaInt = Integer.parseInt(altura);
                Log.d(altura,""+alturaInt);

                Datos reciboDatos = new Datos();
                String resultado = reciboDatos.calculaIndice(pesoInt,alturaInt);
                Log.d("Resultado: ",resultado);
                text_resultado.setText(resultado);
            }
        });

    }
}

package com.example.vi_ni.calculaidade;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText edtIdade;
    TextView txtCategoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtIdade = findViewById(R.id.edtIdade);
        txtCategoria = findViewById(R.id.txtCategoria);
    }

    public void calcula(View view){
        int idade = Integer.parseInt(edtIdade.getText().toString());

        if (idade < 8)
            txtCategoria.setText("Idade não se encaixa em nenhuma categoria!");
        else if (idade < 13)
            txtCategoria.setText("Idade para categoria Infantil");
        else if (idade < 18)
            txtCategoria.setText("Idade se encaixa na categoria Juvenil");
        else
            txtCategoria.setText("Idade se encaixa na categoria Adulto");
    }
}

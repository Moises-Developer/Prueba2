package com.example.app_practica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Crear componentes en el backend
    private EditText et1, et2;
    private TextView TV1;
    private RadioButton RB_Sumar, RB_Restar, RB_Multiplicar, RB_Dividir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Recuperar valores del fronted
        et1 = (EditText)findViewById(R.id.txt_Valor1);
        et2 = (EditText)findViewById(R.id.txt_Valor2);
        TV1 = (TextView)findViewById(R.id.TV1);
        RB_Sumar = (RadioButton)findViewById(R.id.RB_Sumar);
        RB_Restar = (RadioButton)findViewById(R.id.RB_Restar);
        RB_Multiplicar = (RadioButton)findViewById(R.id.RB_Multiplicar);
        RB_Dividir = (RadioButton)findViewById(R.id.RB_Dividir);

    }

    public void Calcular(View view){
        String Valor1_String = et1.getText().toString();
        String Valor2_String = et2.getText().toString();

        int Valor1_Int = Integer.parseInt(Valor1_String);
        int Valor2_Int = Integer.parseInt(Valor2_String);

        if(RB_Sumar.isChecked()){
            int sumar = Valor1_Int + Valor2_Int;

            String resultado = String.valueOf(sumar);
            TV1.setText(resultado);
        }else if(RB_Restar.isChecked()){
                int restar = Valor1_Int - Valor2_Int;

                String resultado = String.valueOf(restar);
                TV1.setText(resultado);
        }else if(RB_Multiplicar.isChecked()){
                int multiplicar = Valor1_Int * Valor2_Int;

                String resultado = String.valueOf(multiplicar);
                TV1.setText(resultado);
        }else if(RB_Dividir.isChecked()){
                if(Valor2_Int == 0){
                    Toast.makeText(this, "No se puede dividir entre 0", Toast.LENGTH_LONG).show();
                }else{
                    int dividir = Valor1_Int / Valor2_Int;

                    String resultado = String.valueOf(dividir);
                    TV1.setText(resultado);
            }
        }
    }
}

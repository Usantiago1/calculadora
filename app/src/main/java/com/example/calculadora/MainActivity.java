package com.example.calculadora;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public TextView txtresultado;
    int n1;
    int n2;
    double total;
    public Button btn1,btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9,btn0, btnSumar, btnrestar, btndividir, btnmultiplicar, btnresultado;

    char operador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtresultado = findViewById(R.id.txtresultado);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn0 = findViewById(R.id.btn0);


        btnSumar = findViewById(R.id.btnsumar);
        btnrestar = findViewById(R.id.btnrestar);
        btnmultiplicar = findViewById(R.id.btnmultiplicar);
        btndividir = findViewById(R.id.btndividir);
        btnresultado = findViewById(R.id.btnresultado);
    }

    public void escribirUno(View view){
        String cap = txtresultado.getText().toString();
        cap = cap+"1";
        txtresultado.setText(cap);
    }

    public void escribirDos(View view) {
        String cap = txtresultado.getText().toString();
        cap = cap+"2";
        txtresultado.setText(cap);
    }
    public void escribirTres(View view) {
        String cap = txtresultado.getText().toString();
        cap = cap+"3";
        txtresultado.setText(cap);
    }
    public void escribirCuatro(View view) {
        String cap = txtresultado.getText().toString();
        cap = cap+"4";
        txtresultado.setText(cap);
    }
    public void escribirCinco(View view) {
        String cap = txtresultado.getText().toString();
        cap = cap+"5";
        txtresultado.setText(cap);
    }
    public void escribirSeis(View view) {
        String cap = txtresultado.getText().toString();
        cap = cap+"6";
        txtresultado.setText(cap);
    }
    public void escribirSiete(View view) {
        String cap = txtresultado.getText().toString();
        cap = cap+"7";
        txtresultado.setText(cap);
    }
    public void escribirOcho(View view) {
        String cap = txtresultado.getText().toString();
        cap = cap+"8";
        txtresultado.setText(cap);
    }
    public void escribirNueve(View view) {
        String cap = txtresultado.getText().toString();
        cap = cap+"9";
        txtresultado.setText(cap);
    }

    public void escribirCero(View view) {
        String cap = txtresultado.getText().toString();
        cap = cap+"0";
        txtresultado.setText(cap);
    }

    public void limpiarDatos(View view) {
        txtresultado.setText("");
        Toast toast = Toast.makeText(this, "Code by Usantiago1", Toast.LENGTH_LONG);
        toast.show();
    }

    public void sumarDatos(View view) {
        n1 = (int) Double.parseDouble(txtresultado.getText().toString());
        operador = btnSumar.getText().charAt(0);
        txtresultado.setText("");
    }

    public void restarDatos(View view) {
        n1 = (int) Double.parseDouble(txtresultado.getText().toString());
        operador = btnrestar.getText().charAt(0);
        txtresultado.setText("");
    }

    public void operacionResultado(View view) {
        Toast toast = Toast.makeText(this, "Code by Usantiago1", Toast.LENGTH_LONG);
        toast.show();
        n2 = (int) Double.parseDouble(txtresultado.getText().toString());
        switch (operador){
            case '+':
                total = n1 + n2;
                break;

            case '-':
                total = n1 - n2;
                break;
            case '×':
                total = n1 * n2;
                break;
            case '÷':
                total = n1/n2;
                break;

        }
        txtresultado.setText(Double.toString(total));
        n1 = (int) 0.0;
        n2= (int) 0.0;
    }

    public void multiplicarDatos(View view) {
        n1 = (int) Double.parseDouble(txtresultado.getText().toString());
        operador = btnmultiplicar.getText().charAt(0);
        txtresultado.setText("");
    }
    public void dividirrDatos(View view) {
        n1 = (int) Double.parseDouble(txtresultado.getText().toString());
        operador = btndividir.getText().charAt(0);
        txtresultado.setText("");
    }
}
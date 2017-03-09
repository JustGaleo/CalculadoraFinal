package com.evolve.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_SHORT;

public class MainActivity extends AppCompatActivity {

    Double numero1,numero2,resultado;
    String operador;
    TextView Pantalla;
    Button Uno, Dos, Tres, Cuatro, Cinco, Seis, Siete, Ocho, Nueve, Cero, Igual, Borrar, Suma, Resta, Multipli, Divi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Pantalla = (TextView)findViewById(R.id.Pantalla);
        Uno = (Button) findViewById(R.id.button1);
        Dos = (Button) findViewById(R.id.button2);
        Tres = (Button) findViewById(R.id.button3);
        Cuatro = (Button) findViewById(R.id.button4);
        Cinco = (Button) findViewById(R.id.button5);
        Seis = (Button) findViewById(R.id.button6);
        Siete = (Button) findViewById(R.id.button7);
        Ocho = (Button) findViewById(R.id.button8);
        Nueve = (Button) findViewById(R.id.button9);
        Cero = (Button) findViewById(R.id.button0);
        Igual = (Button) findViewById(R.id.buttonIgual);
        Borrar = (Button) findViewById(R.id.buttonBorrar);
        Suma = (Button) findViewById(R.id.buttonSuma);
        Resta = (Button) findViewById(R.id.buttonResta);
        Multipli = (Button) findViewById(R.id.buttonMulti);
        Divi = (Button) findViewById(R.id.buttonDivi);

    }


    public void onClickButtonUno(View miView)
    {
        if(Pantalla.getText().equals("Inválido") || Pantalla.getText().equals("Infinito")){
            Pantalla.setText("");
        }
            Pantalla.setText(Pantalla.getText()+"1");



    }
    public void onClickButtonDos(View miView)
    {
        if(Pantalla.getText().equals("Inválido") || Pantalla.getText().equals("Infinito")){
            Pantalla.setText("");
        }
        Pantalla.setText(Pantalla.getText()+ "2");
    }
    public void onClickButtonTres(View miView)
    {
        if(Pantalla.getText().equals("Inválido") || Pantalla.getText().equals("Infinito")){
            Pantalla.setText("");
        }
        Pantalla.setText(Pantalla.getText()+ "3");
    }
    public void onClickButtonCuatro(View miView)
    {
        if(Pantalla.getText().equals("Inválido") || Pantalla.getText().equals("Infinito")){
            Pantalla.setText("");
        }
        Pantalla.setText(Pantalla.getText() +"4");
    }
    public void onClickButtonCinco(View miView)
    {
        if(Pantalla.getText().equals("Inválido") || Pantalla.getText().equals("Infinito")){
            Pantalla.setText("");
        }
        Pantalla.setText(Pantalla.getText() +"5");
    }
    public void onClickButtonSeis(View miView)
    {
        if(Pantalla.getText().equals("Inválido") || Pantalla.getText().equals("Infinito")){
            Pantalla.setText("");
        }
        Pantalla.setText(Pantalla.getText() +"6");
    }
    public void onClickButtonSiete(View miView)
    {
        if(Pantalla.getText().equals("Inválido") || Pantalla.getText().equals("Infinito")){
            Pantalla.setText("");
        }
        Pantalla.setText(Pantalla.getText() +"7");
    }
    public void onClickButtonOcho(View miView)
    {
        if(Pantalla.getText().equals("Inválido") || Pantalla.getText().equals("Infinito")){
            Pantalla.setText("");
        }
        Pantalla.setText(Pantalla.getText() +"8");
    }
    public void onClickButtonNueve(View miView)
    {
        if(Pantalla.getText().equals("Inválido") || Pantalla.getText().equals("Infinito")){
            Pantalla.setText("");
        }
        Pantalla.setText(Pantalla.getText() +"9");
    }
    public void onClickButtonCero(View miView)
    {
        if(Pantalla.getText().equals("Inválido") || Pantalla.getText().equals("Infinito")){
            Pantalla.setText("");
        }
        Pantalla.setText(Pantalla.getText() +"0");
    }
    public void onClickOperacionCapturaNumero1(View miView)
    {

        numero1 = Double.parseDouble(Pantalla.getText().toString());
        Pantalla.setText("");

    }

    public void onClickButtonSuma(View miView)
    {
        if(Pantalla.getText().equals("") || Pantalla.getText().equals("Inválido") || Pantalla.getText().equals("Infinito")){
            Pantalla.setText("Inválido");
        }else{
            operador="+";
            onClickOperacionCapturaNumero1(miView);

        }


    }
    public void onClickButtonResta(View miView)
    {
        if(Pantalla.getText().equals("") || Pantalla.getText().equals("Inválido") || Pantalla.getText().equals("Infinito")){
            Pantalla.setText("Inválido");
        }else{
            operador="-";
            onClickOperacionCapturaNumero1(miView);
        }


    }
    public void onClickButtonMulti(View miView)
    {
        if(Pantalla.getText().equals("") || Pantalla.getText().equals("Inválido") || Pantalla.getText().equals("Infinito")){
            Pantalla.setText("Inválido");
        }else{
            operador="*";
            onClickOperacionCapturaNumero1(miView);
        }


    }
    public void onClickButtonDivi(View miView)
    {
        if(Pantalla.getText().equals("") || Pantalla.getText().equals("Inválido") || Pantalla.getText().equals("Infinito")){
            Pantalla.setText("Inválido");
        }else{
            operador="/";
            onClickOperacionCapturaNumero1(miView);
        }


    }
    public void onClickButtonPotencia(View miView)
    {
        if(Pantalla.getText().equals("") || Pantalla.getText().equals("Inválido") || Pantalla.getText().equals("Infinito")){
            Pantalla.setText("Inválido");
        }else{
            operador="^";
            onClickOperacionCapturaNumero1(miView);
        }


    }
    public void onClickButtonModulo(View miView)
    {
        if(Pantalla.getText().equals("") || Pantalla.getText().equals("Inválido") || Pantalla.getText().equals("Infinito")){
            Pantalla.setText("Inválido");
        }else{
            operador="MOD";
            onClickOperacionCapturaNumero1(miView);
        }


    }
    public void onClickButtonRaiz(View miView)
    {
        if(Pantalla.getText().equals("") || Pantalla.getText().equals("Inválido") || Pantalla.getText().equals("Infinito")){
            Pantalla.setText("Inválido");
        }else{
            onClickOperacionCapturaNumero1(miView);
            resultado = Math.sqrt(numero1);
            Pantalla.setText(resultado.toString());

        }


    }
    public void onClickButtonSeno(View miView)
    {
        if(Pantalla.getText().equals("") || Pantalla.getText().equals("Inválido") || Pantalla.getText().equals("Infinito")){
            Pantalla.setText("Inválido");
        }else{
            onClickOperacionCapturaNumero1(miView);
            resultado = Math.sin(numero1);
            Pantalla.setText(resultado.toString());

        }


    }
    public void onClickButtonCos(View miView)
    {
        if(Pantalla.getText().equals("") || Pantalla.getText().equals("Inválido") || Pantalla.getText().equals("Infinito")){
            Pantalla.setText("Inválido");
        }else{
            onClickOperacionCapturaNumero1(miView);
            resultado = Math.cos(numero1);
            Pantalla.setText(resultado.toString());

        }


    }
    public void onClickButtonTan(View miView)
    {
        if(Pantalla.getText().equals("") || Pantalla.getText().equals("Inválido") || Pantalla.getText().equals("Infinito")){
            Pantalla.setText("Inválido");
        }else{
            onClickOperacionCapturaNumero1(miView);
            resultado = Math.tan(numero1);
            Pantalla.setText(resultado.toString());

        }


    }





    public void onClickButtonIgual(View miView){
        if(Pantalla.getText().equals("") || Pantalla.getText().equals("Inválido") || Pantalla.getText().equals("Infinito")){
            Pantalla.setText("Inválido");
        }else{

            numero2 = Double.parseDouble(Pantalla.getText().toString());

            try {


                if (operador.equals("+")) {
                    resultado = numero1 + numero2;
                    Pantalla.setText(resultado.toString());
                } else if (operador.equals("-")) {
                    resultado = numero1 - numero2;
                    Pantalla.setText(resultado.toString());
                } else if (operador.equals("*")) {
                    resultado = numero1 * numero2;
                    Pantalla.setText(resultado.toString());
                } else if (operador.equals("/")) {
                    resultado = numero1 / numero2;
                    Pantalla.setText(resultado.toString());
                    if(numero1 == 0){
                        Pantalla.setText("Inválido");
                    }else
                    if(numero2==0){
                        Pantalla.setText("Infinito");
                    }
                } else if (operador.equals("^")){
                    resultado = Math.pow(numero1,numero2);
                    Pantalla.setText(resultado.toString());
                } else if (operador.equals("MOD")){
                    resultado = numero1 % numero2;
                    Pantalla.setText(resultado.toString());
                }

            }catch(NumberFormatException nfe){

            }

        }

    }

    public void onClickButtonBorrar(View miView){
        {
            numero1=0.0;
            numero2=0.0;

            Pantalla.setText("");
        }


    }



}

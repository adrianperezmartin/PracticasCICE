package com.example.adrian.calcularimc;

/**
 * Created by Adrian on 26/12/2016.
 */

public class Datos {

    public String calculaIndice(float peso,float altura){
        //como pedimos la altura en cms y el calculo es en m2 lo convertimos para poder realizar las operaciones
        altura = (altura/100);
        //realizacomos el calculo y lo guardamos en una variable
        double porcentaje = peso / (altura*altura);
        //variable donde guardamos el resultado
        String resultado;

        if(porcentaje < 16){
            //desnutrido
            resultado = "El porcentaje de Indice de masa corporal es: "+porcentaje+" Resultado: Desnutrido";
        }else if(porcentaje>16 && porcentaje <=18){
            //bajo de
            resultado = "El porcentaje de Indice de masa corporal es: "+porcentaje+" Resultado: Bajo de peso";
        }else if(porcentaje>18 && porcentaje <=25){
            //normal
            resultado = "El porcentaje de Indice de masa corporal es: "+porcentaje+" Resultado: Normal";
        }else if(porcentaje>25 && porcentaje <31){
            //sobrepeso
            resultado = "El porcentaje de Indice de masa corporal es: "+porcentaje+" Resultado: Sobrepeso";
        }else if(porcentaje>=31){
            //obesidad
            resultado = "El porcentaje de Indice de masa corporal es: "+porcentaje+" Resultado: Obesidad";
        }else{
            //No se puede mostrar su estado por favor vuelva a intentarlo
            resultado = "No se ha podido calcular correctamente, por favor vuelva a intentarlo.";
        }
        return resultado;

    }


}

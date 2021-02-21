/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author elmer
 */
public class Pruebas {
   
    public static void main (String args[]){
        Calculadora miCalculadora= new Calculadora();
        String cadena="-(10*-5)-2";
        String operaciones;
        String resultado="";
        System.out.println("cadena: "+cadena);
        miCalculadora.setCadena(cadena);
        miCalculadora.convierteAOperaciones();
        operaciones = miCalculadora.getOperaciones();
        System.out.println("operaciones: "+operaciones);
        
        resultado=miCalculadora.evaluarOperaciones(cadena);
        System.out.println("resultado: "+resultado);
        
       
    }
}

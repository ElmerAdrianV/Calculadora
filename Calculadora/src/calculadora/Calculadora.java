/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import pila.PilaA;

/**
 *
 * @author ElmerAdrianV
 * @author bobadilla E
 */
public class Calculadora {


    private String operaciones;
    private String resultado;

    public Calculadora(){
    }    
    
    /**
     *@return <pre>regresa el resultado de las operaciones 
     * guardadas como atributo actualmente
     * </pre>
     */
    public String getResultado() {
        return resultado;
    }

    @Override
    public String toString() {
        return "Calculadora: \n" + "operaciones=" + operaciones + ", resultado=" + resultado + '\n';
    }
    
    public boolean isNumber(char a){
        boolean resp= true;
        switch(a){
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                break;
            default:
                resp= false;
                break;
        }
        return resp;
    }
    
    public boolean isOperator(char a){
        boolean resp= true;
        switch(a){
            case '+':
            case '-':
            case '/':
            case '*':
            case '^':
                break;
            default:
                resp= false;
                break;
        }
        return resp;
    }
    
    private boolean verificarOperaciones(String cadena){
        boolean resp=true;
        PilaA<Character> parentesis = new PilaA<>();
        int i=0, n=cadena.length();
        char a;
        
        while(i<n && resp){
            switch(cadena.charAt(i)){
                case '(':
                    if(i+1<n){
                        a=cadena.charAt(i+1);
                        
                        if( a==')' || a=='*' || a=='/' || a=='^')
                            resp=false;
                        
                        else
                            parentesis.push('(');
                    }
                    else
                        resp=false;
                    break;
                case ')':
                    if(!parentesis.isEmpty())
                        parentesis.pop();
                    else
                        resp=false;
                    break; 
                case'+':
                    if(i+1<n){
                        a=cadena.charAt(i+1);
                        if( a=='^' || a=='*' || a=='/' || a==')' ){
                            resp=false;
                        }
                    }
                    else
                        resp=false;

                    break;
                case'-':
                    if(i+1<n){
                        a=cadena.charAt(i+1);
                        if( a=='^' || a=='*' || a=='/' || a==')' ){
                            resp=false;
                        }
                    }
                    else
                        resp=false;
                    break;
                case'*':
                    if(i+1<n){
                        a=cadena.charAt(i+1);
                        if( a=='^' || a=='*' || a=='/' || a==')'){
                            resp=false;
                        }
                    }
                    else
                        resp=false;
                    break;
                case'/':
                    if(i+1<n){
                        a=cadena.charAt(i+1);
                        if( a=='^' || a=='*' || a=='/' || a==')'){
                            resp=false;
                        }
                    }
                    else
                        resp=false;
                    break;
                case'^':
                    if(i+1<n){
                        a=cadena.charAt(i+1);
                        if( a=='^' || a=='*' || a=='/' || a==')' ){
                            resp=false;
                        }
                    }
                    else
                        resp=false;
                    break;
            }
            i++;
        }
        return resp;
    }
    
    /*
    private boolean verificarOperaciones(String cadena){
        boolean resp=true;
        PilaA <String> aux= new PilaA<>();
        int i=0,j, n= cadena.length();
        StringBuilder sb= new StringBuilder();
        while(i<n && resp){
            j=i;
            cadena.charAt(i);
            while(j<n && resp){
                
            }
            
        }
        
        
        return resp;
    }
      */     
    public String algortimoPosfija(String cadena){

        return "Hola";
    }

}

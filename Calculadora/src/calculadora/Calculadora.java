/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import pila.PilaA; ;

/**
 *
 * @author ElmerAdrianV
 * @author bobadilla E
 */
public class Calculadora {

    private String cadena; //inFija
    private String operaciones; //postFija;
    private String resultado;

    public Calculadora(){
    }    
    

    
    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {    
        this.cadena = cadena;
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
        return "Calculadora: \n" +"cadena="+cadena+  "operaciones=" + operaciones + ", resultado=" + resultado + '\n';
    }
    
    private boolean isNumber(char a){
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
    
    private boolean isOperator(char a){
        boolean resp= true;
        switch(a){
            case '+':
            case '-':
            case '/':
            case '*':
            case '^':
            case '(':
            case ')':
                break;
            default:
                resp= false;
                break;
        }
        return resp;
    }
    
    private boolean verificarCadena(){
        boolean resp=true;
        PilaA<Character> parentesis = new PilaA<>();
        //PilaA<Character>
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
                    if(!parentesis.isEmpty()){
                        parentesis.pop();
                        if(i+1<n){
                            a=cadena.charAt(i+1);
                            if( isNumber(a) )
                                resp=false;
                        }
                    }
                    else
                        resp=false;
                    break; 
                case'+':
                    if(i+1<n){
                        a=cadena.charAt(i+1);
                        if( a=='+' || a=='^' || a=='*' || a=='/' || a==')' ){
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
    
    
    private boolean jerarquiaOperaciones(char operando, char tope){
        boolean resp=true;
        switch(operando){
            case '+':
                if(tope=='+')
                    resp=false;
                break;
            case '*':
                if(tope=='/'||tope=='*')
                    resp=false;
                break;
            case '/':
                if(tope=='/'||tope=='*')
                    resp=false;
                break;
            case '^':
                if(tope=='^')
                    resp=false;
                break;    
        }
           
        return resp;
    }
    
    
    private void algortimoPosfija(){
        PilaA<Character> aux= new PilaA();
        StringBuilder cadenaPostFija=new StringBuilder();
        char a;
        int n= cadena.length();
        
        if(verificarCadena()){
            for(int i=0;i<n;i++){
                a=cadena.charAt(i);
                if(!isOperator(a))
                    cadenaPostFija.append(a);
                else{
                    cadenaPostFija.append("|");

                    switch(a){
                        case '(':
                            aux.push(a);
                            break;
                        case ')':
                            while(!aux.isEmpty()&&!aux.peek().equals('(')){
                                cadenaPostFija.append(aux.pop());
                            }
                            aux.pop();
                            break;
                        default:
                            if(a=='-'){
                                cadenaPostFija.append(a);
                                a='+';   
                            } 
                            while(!aux.isEmpty()&& jerarquiaOperaciones(a,aux.peek())){
                                cadenaPostFija.append(aux.pop());
                            }
                            aux.push(a);
                            break;
                    }
                }
            }
            //Aqui guarda
            operaciones= cadenaPostFija.toString();
        }
        else
            resultado="¡Error!";
        
    }
    
    public String evaluarOperaciones(){
        return resultado;
    }
        
    

}

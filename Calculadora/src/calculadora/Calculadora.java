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
    
    public Calculadora(String cadena){
        this.cadena=cadena;
        verificarCadena();
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
    
    public boolean verificarCadena(){
        boolean resp=true;
        PilaA<Character> parentesis = new PilaA<>();
        boolean punto=false;
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
                    
                    punto=false;
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
                    
                    punto=false;
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
                    
                    punto=false;
                    break;
                case'-':
                    if(i+1<n){
                        a=cadena.charAt(i+1);
                        if( a=='+'|| a=='^' || a=='*' || a=='/' || a==')' ){
                            resp=false;
                        }
                    }
                    else
                        resp=false;
                    
                    punto=false;
                    break;
                case'*':
                    if(i+1<n){
                        a=cadena.charAt(i+1);
                        if( a=='+' || a=='^' || a=='*' || a=='/' || a==')'){
                            resp=false;
                        }
                    }
                    else
                        resp=false;
                    
                    punto=false;
                    break;
                case'/':
                    if(i+1<n){
                        a=cadena.charAt(i+1);
                        if( a=='+' || a=='^' || a=='*' || a=='/' || a==')'){
                            resp=false;
                        }
                    }
                    else
                        resp=false;
                    
                    punto=false;
                    break;
                case'^':
                    if(i+1<n){
                        a=cadena.charAt(i+1);
                        if( a=='+' || a=='-' || a=='^' || a=='*' || a=='/' || a==')' ){
                            resp=false;
                        }
                    }
                    else
                        resp=false;
                    punto=false;
                    break;
                case '.':
                    if(punto){
                        resp=false;
                    }
                    else{
                        punto=true;
                        if(i+1<n){
                            a=cadena.charAt(i+1);
                            if( !isNumber(a) ){
                                resp=false;
                            }
                        }
                        else
                            resp=false;
                    }
                    break;
            }
            i++;
        }
        return resp;
    }
    
    
    private boolean jerarquiaOperandos(char operando, char tope){
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
    
    
    private void convierteAOperaciones(){
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
                    if(cadenaPostFija.charAt(cadenaPostFija.length()-1)!='M')
                        cadenaPostFija.append("M");
                    switch(a){
                        case '(':
                            if(isNumber(cadena.charAt(i-1)))
                                aux.push('*');
                            aux.push(a);
                            break;
                        case ')':
                            while(!aux.isEmpty()&& !aux.peek().equals('('))
                                cadenaPostFija.append(aux.pop());
                            
                            aux.pop();
                            break;
                        default:
                            if(a=='-'){
                                cadenaPostFija.append(a);
                                a='+';   
                            } 
                            while(!aux.isEmpty() && aux.peek()!='(' && jerarquiaOperandos(a,aux.peek()))
                                cadenaPostFija.append(aux.pop());
                            
                            aux.push(a);
                            break;
                    }
                }
            }
            while(!aux.isEmpty())
                cadenaPostFija.append(aux.pop());
            
            operaciones= cadenaPostFija.toString();
        }
        else
            operaciones="¡Error!";
        
    }
    
    public String evaluarOperaciones(String cadena){
        this.cadena=cadena;
        convierteAOperaciones();
        
        int i=0, j , n=operaciones.length();
        double x, y;
        boolean error=false;
        
        if(!this.operaciones.equals("¡Error!")){
            while(i<n && operaciones.charAt(i)!='M')
                    i++;
            
            x= Double.parseDouble( operaciones.substring(0, i) );
            i++;//saltarnos la M;
            
            while(i<n && !error){
                j=i;
                while(j<n && operaciones.charAt(j)!='M')
                    j++;
                
                y= Double.parseDouble( operaciones.substring(i, j) );
                j++;//saltarse la M;
                
                while(j<n && isOperator(operaciones.charAt(j)) ){
                    switch(operaciones.charAt(j)){
                        case'+':
                            x=+y;
                            break;
                        case'*':
                            x*=y;
                            break;
                        case'/':
                            if(y==0)
                                error=true;
                            else
                                x/=y;
                            break;
                        case'^':
                            if(y==0 && x==0)
                                error=true;
                            else
                                x=Math.pow(x, y);    
                            break;
                    }
                    j++;
                }
                i=j;
            }
            if(!error)
                this.resultado=String.valueOf(x);
            else
                this.resultado="¡Error!";
        }
        else
          this.resultado="¡Error!";
      
        return resultado;
    }
        
    

}

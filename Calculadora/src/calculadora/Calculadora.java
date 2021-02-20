/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import pila.PilaA; ;

/**
 * <pre>
 * Clase Calculadora
 * 
 * Contiene los métodos de una calculadora que
 * puede realizar operaciones aritméticas sobre 
 * números reales, tanto negativos como positivos
 * empleando la estructura de pilas
 * </pre>
 * 
 * @author ElmerAdrianV
 * @author BobadillaE
 * @author PabloVitela
 * @author DiegoMason
 * @author Carolina
 */
    
public class Calculadora {

    private String cadena; //inFija
    private String operaciones; //postFija;
    private String resultado;
    
    /**
    *Constructor vacío de Calculadora
    */

    public Calculadora(){
    }    
    
    /**
     * Constructor de Calculadora 
     * @param cadena es una cadena de operaciones expresada en notación infija
     */

    public Calculadora(String cadena){
        this.cadena=cadena;
    }
    
    /**
    *Getter de cadena
    *@return <pre>regresa la cadena en notación infija
    * guardada como atributo
    * </pre>
    */

    public String getCadena() {
        return cadena;
    }
    /**
    * Setter que modifica la cadena
    * @param cadena la cadena que modifica al atributo
    */

    public void setCadena(String cadena) {    
        this.cadena = cadena;
    }
    
   /**
    *Getter del resultado
    *@return <pre>regresa el resultado de las operaciones 
    * guardadas como atributo actualmente
    * </pre>
    */
    public String getResultado() {
        return resultado;
    }
    
    
    /**
    *@return una cadena con la información de la clase Calculadora con todos sus atributos
    */
    @Override
    public String toString() {
        return "Calculadora: \n" +"cadena="+cadena+  "operaciones=" + operaciones + ", resultado=" + resultado + '\n';
    }
    
    /**
    * Identifica si un caracter ingresado es un número real
    * @param a es el elemento a verificar
    * @return <ul>
    * <li>true: el caracter es un número real</li>
    * <li>false: el caracter no es un número real</li>
    * </ul>
    */

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
    
    /**
    * Identifica si un caracter ingresado es un operador
    * @param a es el elemento a verificar
    * @return <ul>
    * <li>true: el caracter es un operador</li>
    * <li>false: el caracter no es operador</li>
    * </ul>
    */
    public boolean isOperator(char a){
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
    
    /**
    * <pre>Revisa una expresión en notación infija 
    * y se asegura de que no exista algún error sintáctico
    * Por ejemplo: la expresión "3-2(/4)" sería falso, 
    * pues es incorrecto tener dos operandos consecutivos
    * </pre>
    * @see isNumber
    * @return <ul>
    * <li>true: la cadena pasó la verificación </li>
    * <li>false: la cadena no pasó la verificación</li>
    * </ul>
    */
    public boolean verificarCadena(){
        boolean resp;
        PilaA<Character> parentesis = new PilaA<>();
        boolean punto=false;
        int i=0, n=0;
        char a;
        
        if(cadena==null || cadena.length()==0){
            resp=false;
        }
        else{
            resp=true;
            n=cadena.length();
        }
            

        while(i<n && resp){
            switch(cadena.charAt(i)){
                case '(':
                    if(i+1<n){
                        a=cadena.charAt(i+1);
                        
                        if( a==')'|| a=='+'|| a=='*' || a=='/' || a=='^')
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
                        if(a=='+'|| a=='^' || a=='*' || a=='/' || a==')' ){
                            resp=false;
                        }
                        else{
                            if(!isNumber(a)){
                                if(a=='-' && i+2<n){
                                    a=cadena.charAt(i+2);
                                    if(!isNumber(a) && a!='.')
                                        resp=false;
                                    i++;
                                }
                                else
                                    resp=false;
                                }
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
                        if( a=='+' || a=='^' || a=='*' || a=='/' || a==')' ){
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
    
   
    /**
    * Verifica la jerarquía de operaciones de dos operandos
    * @param operando solo admite los valores de char '+', '/','*', '^'
    * @param tope solo admite los valores de char '+', '/','*', '^'
    * @return <ul>
    * <li>true: si operando es mayor en jerarquía que tope;</li>
    * <li>false: si operando es menor o igualen jerarquía que tope;</li>
    * </ul>       
    */

    public boolean jerarquiaOperandos(char operando, char tope){
       boolean resp=true;
        switch(operando){
            case '+':
                if(tope=='+')
                    resp=false;
                break;
            case '*':
                if(tope!='^')
                    resp=false;
                break;
            case '/':
                if(tope!='^')
                    resp=false;
                break;
            case '^':
                    resp=false;
                break;    
        }
        
        return resp;
    }
    
    /**
    * <pre>Convierte una expresión válida de notación infija a su equivalente en notación postfija 
    * y la almacena en el atributo "operaciones" si es válida.
    * En caso contrario se almacena "¡Error!"
    *
    * Cada elemento númerico se separa con una 'M'
    * Por ejemplo: la expresión "(3+2)" se convierte a la expresión "3M2M+"
    * </pre>
    * @see isNumber
    * @see isOperator
    */

    public void convierteAOperaciones(){
        PilaA<Character> aux= new PilaA();
        StringBuilder cadenaPostFija=new StringBuilder();
        char a,last,next;
        int n= cadena.length();
        String operaciones;
        if(verificarCadena()){
            for(int i=0;i<n;i++){
                a=cadena.charAt(i);
                if(!isOperator(a))
                    cadenaPostFija.append(a);
                else{
                    if(a=='-'){
                        if(i>0){
                            last=cadenaPostFija.charAt(cadenaPostFija.length()-1);
                            if(!isOperator(last)&& last!='M')
                                cadenaPostFija.append("M");
                        }
                        if(cadena.charAt(i+1)=='-'){
                           i++;
                        }
                        else{
                            cadenaPostFija.append(a);
                        }
                        a='+'; 
                    } 
                    if(i>0){
                        last=cadenaPostFija.charAt(cadenaPostFija.length()-1);
                        if(!isOperator(last)&& last!='M')
                            cadenaPostFija.append("M");
                    }
                    switch(a){
                        case '(':
                            if(i>0 && isNumber(cadena.charAt(i-1)))
                                aux.push('*');
                            aux.push(a);
                            break;
                        case ')':
                            while(!aux.isEmpty() && !aux.peek().equals('('))
                                cadenaPostFija.append(aux.pop());
                            aux.pop();
                            break;
                        default:
                            while(!aux.isEmpty()&& aux.peek()!='('&& jerarquiaOperandos(a,aux.peek()))
                                cadenaPostFija.append(aux.pop());
                            
                            aux.push(a);
                            break;
                    }
                }
            }
            last=cadenaPostFija.charAt(cadenaPostFija.length()-1);
            if(!isOperator(last)&& last!='M')
                cadenaPostFija.append("M");

            while(!aux.isEmpty())
                cadenaPostFija.append(aux.pop());
         
            operaciones= cadenaPostFija.toString();
        }
        else
            operaciones="¡Error!";   
    }
    /**
    * <pre>Evalúa la expresión en notación postfija para conocer su resultado global
    * Por ejemplo: la expresión expresión "3M2M+" sería equivalente a "5"
    * </pre>
    * @param cadena es la cadena previamente verificada y transformada a notación postfija
    * @see isOperator
    * @return resultado con el nuevo valor obtenido
    */

    public String evaluarOperaciones(String cadena){
        this.cadena=cadena;
        convierteAOperaciones();
        
        int i=0, j , n=operaciones.length();
        PilaA<Double> numeros=new PilaA<>();
        double x,y;
        boolean error=false;
        
        if(!operaciones.equals("¡Error!")){
            while(i<n && !error){
                if( !isOperator(operaciones.charAt(i)) || operaciones.charAt(i)=='-' ){
                    j=i;
                    while(i<n && operaciones.charAt(i)!='M')
                        i++;
                    numeros.push( Double.parseDouble( operaciones.substring(j,i) ) );
                    i++;//saltarse la M;	 
                }
                else{
                    while(i<n && isOperator(operaciones.charAt(i)) ){
                        x=numeros.pop();
                        y=numeros.pop();
                        switch(operaciones.charAt(i)){
                            case'+':
                                x=x+y;
                                break;
                            case'*':
                                x=x*y;
                                break;
                            case'/':
                                if(y==0)
                                    error=true;
                                else
                                    x=y/x;
                                break;
                            case'^':
                                if(y==0 && x==0)
                                    error=true;
                                else
                                    x=Math.pow(y, x);
                                break;
                        }
                        numeros.push(x);
                        i++;
                    }
                }
            }
            if(!error){
                resultado=String.valueOf(numeros.pop());
            }
            else
                resultado="¡Error!";
        }
        else
          resultado="¡Error!";
      
        return resultado;
    }
        
    

}

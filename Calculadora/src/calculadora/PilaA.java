/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Elmer
 */
public class PilaA <T> implements PilaADT<T>{
        
    private T datos[];
    private int tope;
    private final int MAX=20;


    public PilaA() {
        datos =(T[]) new Object[MAX];
        tope=-1;
    }
    
    public PilaA(int max) {
        datos =(T[]) new Object[max];
        tope=-1;
    }
    @Override
    public boolean equals(Object obj){
        boolean resp=true;
        PilaADT<T> otra, aux1= new PilaA<>(),aux2= new PilaA<>();
        if(obj!=null && obj instanceof PilaA){
            otra= (PilaADT) obj;
            while(resp && !this.isEmpty() && !otra.isEmpty()){
                aux1.push( this.peek());
                aux2.push( otra.peek());
                resp=otra.pop().equals(this.pop());
            }
            while(!aux1.isEmpty()){//aux1 y aux2 tienen el mismo # de elementos
                this.push(aux1.pop());
                otra.push(aux2.pop());
            }
                
        }
        else
            resp=false;
        return resp;
    }
    
    
    @Override
    public boolean isEmpty() {
        return tope==-1;
    }

    @Override
    public T peek() {
//       T dato=null;
//       if(isEmpty())
//           dato=datos[tope];
//       return dato;
        if(isEmpty())
            throw new ExcepcionColeccionVacia("Pila vacia. No se puede consultar");
        //else es inncesario, porque el throw INTERRUMPE el programa
        
        return datos[tope]; 
    }
    
    
    @Override
    public T pop() {
        if(isEmpty())
            throw new ExcepcionColeccionVacia("Pila vacia. No se puede consultar");
        //else es inncesario, porque el throw INTERRUMPE el programa
        
        T dato= datos[tope];
        datos[tope]=null;
        tope--;
                
        return dato; 
    }

    @Override
    public void push(T nuevo) {
        if(tope+1==datos.length)
            aumentaCapacidad();
        tope++;
        datos[tope]=nuevo;
    }
    
    private void aumentaCapacidad(){
        T [] masGrande= (T[]) new Object[datos.length*2];
        for(int i=0; i<=tope;i++)
            masGrande[i]=datos[i];
        
        datos=masGrande;
    }
    
    /*public int size(){
        return tope;
    }*/
    
    public boolean multiPop(int n ){
        boolean resp=true;
        
        if(tope+1 >= n)
            for(int i=0; i<n; i++)
                this.pop();
            //Opcion b: sacar el    
        else
            resp=false;
        
        return resp;
    }
    
}

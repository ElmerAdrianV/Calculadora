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
public interface PilaADT <T>{
    public void push(T dato);//agrega
    
    public T pop();
    public boolean equals(Object obj);
    public boolean isEmpty();//¿esta vacia?
    public T peek();//regresa el ultimo;
  
}

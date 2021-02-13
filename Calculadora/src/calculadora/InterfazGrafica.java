/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
    import java.awt.GridLayout;
    import javax.swing.*;
    import javax.swing.border.Border;

/**
 *
 * @author carov
 */
public class InterfazGrafica extends JFrame{
    //atributos
    protected JLabel etCalculadora, etVacia;
    protected JTextArea info;
    protected JButton btUno, btDos, btTres, btCuatro, btCinco, btSeis, btSiete, btOcho, btNueve, btCero;
    protected JButton btSuma, btResta, btMenos, btParenIzq, btParenDer;
    protected JButton btPor, btEntre, btIgual, btBorrar, btPotencia, btPunto;
    protected JPanel miPanel;
    protected Border miBorde;
    
    public InterfazGrafica(){
        super ("Calculadora");
        miPanel= new JPanel (new GridLayout(7,5));
        miBorde = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        miPanel.setBorder(miBorde);
        
        //1erRenglon
        etVacia=new JLabel(" ");
        miPanel.add(etVacia);
        etVacia=new JLabel(" ");
        miPanel.add(etVacia);
        etCalculadora= new JLabel("Calculadora");
        etVacia=new JLabel(" ");
        miPanel.add(etVacia);
        etVacia=new JLabel(" ");
        miPanel.add(etVacia);
        
        //2ndo renglon
        etVacia=new JLabel(" ");
        miPanel.add(etVacia);
        etVacia=new JLabel(" ");
        miPanel.add(etVacia);
        info= new JTextArea();
        miPanel.add(info);
        etVacia=new JLabel(" ");
        miPanel.add(etVacia);
        btBorrar= new JButton("BORRAR");
        miPanel.add(btBorrar);
        
        //3er Reglon
        btUno= new JButton("1");
        miPanel.add(btUno);
        btDos= new JButton("2");
        miPanel.add(btDos);
        btTres= new JButton("3");
        miPanel.add(btTres);
        btSuma= new JButton("+");
        miPanel.add(btSuma);
        btResta= new JButton("-");
        miPanel.add(btResta);
        
        //4toRenglon
        btCuatro= new JButton("4");
        miPanel.add(btCuatro);
        btCinco= new JButton("5");
        miPanel.add(btCinco);
        btSeis= new JButton ("6");
        miPanel.add(btSeis);
        btPor= new JButton ("*");
        miPanel.add(btPor);
        btEntre= new JButton("/");
        miPanel.add(btEntre);
        
        //5to Renglon
        btSiete= new JButton("7");
        miPanel.add(btSiete);
        btOcho= new JButton("8");
        miPanel.add(btOcho);
        btNueve= new JButton("9");
        miPanel.add(btNueve);
        btPotencia= new JButton("^");
        miPanel.add (btPotencia);
        btMenos = new JButton("(-)");
        miPanel.add (btMenos);
        
        //6to Renglon
        btCero= new JButton("0");
        miPanel.add(btCero);
	btParenIzq = new JButton ("(");
        miPanel.add (btParenIzq);
        btParenDer = new JButton (")");
        miPanel.add (btParenDer);
        btPunto= new JButton (".");
        miPanel.add (btPunto);
        btIgual= new JButton ("=");
        miPanel.add(btIgual);
        
        super.setContentPane(miPanel);
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
   
}


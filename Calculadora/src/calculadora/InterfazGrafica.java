/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JFrame;
import java.awt.GridLayout;
import javafx.scene.layout.Border;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author carov
 */
public class InterfazGrafica extends JFrame{
    //atributos
    protected JLabel etCalculadora,etVacia;
		protected JTextArea info;
		protected JButton btUno, btDos, btTres, btCuatro, btCinco, btSeis;
		protected JButton btSiete, btOcho,btNueve,btCero,btMas,btMenos;
		protected JButton btEntre,btPor, btIgual,btBorrar;
		protected JPanel miPanel;
		protected Border miBorde;
                
   public InterfazGrafica (){
       super ("Calculadora");
			miPanel= new JPanel(new GridLayout(7,3));
			miBorde= BorderFactory.createEmptyBorder(10, 10, 10, 10);
			miPanel.setBorder(miBorde);
			
			//1er renglon
			etVacia=new JLabel(" ");
			miPanel.add(etVacia);
			etCalculadora= new JLabel("Calculadora");
			etVacia=new JLabel(" ");
			miPanel.add(etVacia);
			
			//segundo renglon
			etVacia=new JLabel(" ");
			miPanel.add(etVacia);
			etVacia=new JLabel(" ");
			miPanel.add(etVacia);
			info= new JTextArea();
			miPanel.add(info);
			btBorrar= new JButton("BORRAR");
			miPanel.add(btBorrar);
			
			//tercer renglon
			btUno= new JButton("1");
			miPanel.add(btUno);
			btDos= new JButton("2");
			miPanel.add(btDos);
			btTres= new JButton("3");
			miPanel.add(btTres);
			
			//cuarto renglon
			btCuatro= new JButton("4");
			miPanel.add(btCuatro);
			btCinco= new JButton("5");
			miPanel.add(btCinco);
			btSeis= new JButton ("6");
			miPanel.add(btSeis);
			
			//quintorenglon
			btSiete= new JButton("7");
			miPanel.add(btSiete);
			btOcho= new JButton("8");
			miPanel.add(btOcho);
			btNueve= new JButton("9");
			miPanel.add(btNueve);
			
			//sexto renglon
			btCero= new JButton("0");
			miPanel.add(btCero);
			btMas= new JButton("+");
			miPanel.add(btMas);
			btMenos= new JButton("-");
			miPanel.add(btMenos);
			
			//septimo renglon
			btEntre= new JButton("/");
			miPanel.add(btEntre);
			btPor= new JButton("*");
			miPanel.add(btPor);
			btIgual= new JButton("=");
			miPanel.add(btIgual);
			
			super.setContentPane(miPanel);
			super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
   }
                
}

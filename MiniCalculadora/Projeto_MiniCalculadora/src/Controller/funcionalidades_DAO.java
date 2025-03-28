/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static View.painel_GUI.resultado_txt;
import static View.painel_GUI.valor1_txt;
import static View.painel_GUI.valor2_txt;
import java.awt.Color;
import javax.swing.JOptionPane;


public class funcionalidades_DAO {
     
    public static void func_somar_btn(){
        Double valor1 = Double.parseDouble(View.painel_GUI.valor1_txt.getText());
        Double valor2 = Double.parseDouble(View.painel_GUI.valor2_txt.getText());
        Double x = 0.0;
        
        x= valor1 + valor2;
        
          resultado_txt.setVisible(true);
        resultado_txt.setText(String.valueOf(x));
        resultado_txt.setBackground(Color.yellow);
    }
    
    public static void func_subtrair_btn(){
        Double valor1 = Double.parseDouble(View.painel_GUI.valor1_txt.getText());
        Double valor2 = Double.parseDouble(View.painel_GUI.valor2_txt.getText());
        Double x = 0.0;
        
         x = valor1 - valor2;
           resultado_txt.setVisible(true);
        resultado_txt.setText(String.valueOf(x));
        resultado_txt.setBackground(Color.yellow);
    }
    
    public static void func_multiplicar_btn(){
        Double valor1 = Double.parseDouble(View.painel_GUI.valor1_txt.getText());
        Double valor2 = Double.parseDouble(View.painel_GUI.valor2_txt.getText());
        Double x = 0.0;
        
         x = valor1 * valor2;
           resultado_txt.setVisible(true);
        resultado_txt.setText(String.valueOf(x));
        resultado_txt.setBackground(Color.yellow);
    }
    
    public static void func_dividir_btn(){
        Double valor1 = Double.parseDouble(View.painel_GUI.valor1_txt.getText());
        Double valor2 = Double.parseDouble(View.painel_GUI.valor2_txt.getText());
        Double x = 0.0;
        
         x = valor1 / valor2;
          resultado_txt.setVisible(true);
        resultado_txt.setText(String.valueOf(x));
        resultado_txt.setBackground(Color.yellow);
    }
    
    public static void func_limpar_btn(){
       valor1_txt.setText("");
        valor2_txt.setText("");
        resultado_txt.setText("");
        resultado_txt.setBackground(Color.white);
    }
    
    public static void func_sair_btn(){
       System.exit(0);
          
    }
    
    
}

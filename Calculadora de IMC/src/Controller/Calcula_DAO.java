/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.Color;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;


/**
 *
 * @author Laboratorio-Info
 */
public class Calcula_DAO {
    
    public static void func_calcular_imc_btn(){
        Double altura = Double.parseDouble(View.inicial_GUI.altura_txt.getText());
        Double idade = Double.parseDouble(View.inicial_GUI.idade_txt.getText());
        Double peso = Double.parseDouble(View.inicial_GUI.peso_txt.getText());
        Double IMC = 0.0;
         
        
        IMC= peso / (altura *altura);
       BigDecimal bd = new BigDecimal(IMC).setScale(2, RoundingMode.HALF_EVEN);
System.out.println(bd.doubleValue());
        
          (View.inicial_GUI.resultado_txt).setVisible(true);
        (View.inicial_GUI.resultado_txt).setText(String.valueOf(bd));
        (View.inicial_GUI.resultado_txt).setBackground(Color.yellow);
        
        if(IMC < 18.5 ){
            (View.inicial_GUI.abaixo_img).setVisible(true);
        }
        if(IMC < 24.9 && IMC > 18.6){
            (View.inicial_GUI.normal_img).setVisible(true);
        }if(IMC < 29.9 && IMC > 25 ){
            (View.inicial_GUI.acima_img).setVisible(true);
        }
        if(IMC < 39.9 && IMC > 30){
            (View.inicial_GUI.obesidade1_img).setVisible(true);
        }if(IMC > 40 ){
            (View.inicial_GUI.obesidade2_img).setVisible(true);
        }
    }
    
    
}

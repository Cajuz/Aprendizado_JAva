
package main;

import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String resp;
        int pont = 10;
        
        System.out.println("    *****Quiz do NEYMAR*****");
        System.out.println("*****Você conhece o Neymar?*****");
        System.out.println("OBS: CADA QUESTÃO VALE UM PONTO \n");
        
        System.out.println("**********1ºPergunta**********");
        System.out.println("Neymar já ganhou quantas Champions?");
        System.out.println("A- 1 Champions       B- 2 CHampions \n"
                         + "C- 3 Champions       D- 4 Champions");
        System.out.println("Digite a letra da alternativa:");
          resp = input.nextLine();
          
          if(resp.equalsIgnoreCase("a")){
              System.out.println("  Alternativa correta");
          }else {
              System.out.println("  Alternativa errada");
              pont= pont - 1;
          }
          
          System.out.println("**********2ºPergunta**********");
        System.out.println("Neymar tem Libertadores?");
        System.out.println("A- Sim       B- Não \n");
        System.out.println("Digite a letra da alternativa:");
          resp = input.nextLine();
          
          if(resp.equalsIgnoreCase("a")){
              System.out.println("  Alternativa correta");
          }else {
              System.out.println("  Alternativa errada");
              pont= pont - 1;
          }
          
          System.out.println("**********3ºPergunta**********");
        System.out.println("Neymar tem quantos títulos pela seleção brasileira jogando?");
        System.out.println("A- 1 título       B- 4 títulos \n"
                         + "C- 3 títulos      D- 2 títulos");
        System.out.println("Digite a letra da alternativa:");
          resp = input.nextLine();
          
          if(resp.equalsIgnoreCase("a")){
              System.out.println("  Alternativa correta");
          }else {
              System.out.println("  Alternativa errada");
              pont= pont - 1;
          }
          
          System.out.println("**********4ºPergunta**********");
        System.out.println("Neymar tem quantos gols na carreira?");
        System.out.println("A- 200 gols       B- 397 gols \n"
                         + "C- 150 gols       D- 440 gols");
        System.out.println("Digite a letra da alternativa:");
          resp = input.nextLine();
          
          if(resp.equalsIgnoreCase("d")){
              System.out.println("  Alternativa correta");
          }else {
              System.out.println("  Alternativa errada");
              pont= pont - 1;
          }
          
          System.out.println("**********5ºPergunta**********");
        System.out.println("Neymar já foi indicado quantas vezes ao BALLON D'OR?");
        System.out.println("A- 2 vezes       B- 7 vezes \n"
                         + "C- 10 vezes      D- 4 vezes");
        System.out.println("Digite a letra da alternativa:");
          resp = input.nextLine();
          
          if(resp.equalsIgnoreCase("c")){
              System.out.println("  Alternativa correta");
          }else {
              System.out.println("  Alternativa errada");
              pont= pont - 1;
          }
          
          System.out.println("**********6ºPergunta**********");
        System.out.println("Neymar já foi indicado ao TOP 3 BALLON D'OR quantas vezes?");
        System.out.println("A- 4 vezes       B- 2 vezes \n"
                         + "C- 3 vezes       D- 1 vez");
        System.out.println("Digite a letra da alternativa:");
          resp = input.nextLine();
          
          if(resp.equalsIgnoreCase("b")){
              System.out.println("  Alternativa correta");
          }else {
              System.out.println("  Alternativa errada");
              pont= pont - 1;
          }
          
          System.out.println("**********7ºPergunta**********");
        System.out.println("Neymar já ganhou Puskás?");
        System.out.println("A- Sim       B- Não \n");
        System.out.println("Digite a letra da alternativa:");
          resp = input.nextLine();
          
          if(resp.equalsIgnoreCase("a")){
              System.out.println("  Alternativa correta");
          }else {
              System.out.println("  Alternativa errada");
              pont= pont - 1;
          }
          
          System.out.println("**********8ºPergunta**********");
        System.out.println("Neymar tem quantos gols pelo Santos??");
        System.out.println("A- 100 gols       B- 203 gols \n"
                         + "C- 136 gols       D- 148 gols");
        System.out.println("Digite a letra da alternativa:");
          resp = input.nextLine();
          
          if(resp.equalsIgnoreCase("c")){
              System.out.println("  Alternativa correta");
          }else {
              System.out.println("  Alternativa errada");
              pont= pont - 1;
          }
          
           System.out.println("**********9ºPergunta**********");
        System.out.println("Neymar tem quantos gols pelo Barcelona?");
        System.out.println("A- 145 gols       B- 105 gols \n"
                         + "C- 107 gols       D- 200 gols");
        System.out.println("Digite a letra da alternativa:");
          resp = input.nextLine();
          
          if(resp.equalsIgnoreCase("b")){
              System.out.println("  Alternativa correta");
          }else {
              System.out.println("  Alternativa errada");
              pont= pont - 1;
          }
          
           System.out.println("**********10ºPergunta**********");
        System.out.println("Qual foi o ano do Neymar Jr que ele teve mais gols?");
        System.out.println("A- 2017       B- 2014 \n"
                         + "C- 2011       D- 2012");
        System.out.println("Digite a letra da alternativa:");
          resp = input.nextLine();
          
          if(resp.equalsIgnoreCase("d")){
              System.out.println("  Alternativa correta");
          }else {
              System.out.println("  Alternativa errada");
              pont= pont - 1;
          }
          
       
       
       
        System.out.println("Sua pontuação final é: "+pont);
        
        if (pont <=3){
            System.out.println("Precisa estudar mais, não sabe sobre o assunto");
        }
        else if (pont >= 4 && pont <= 6) {
            System.out.println("Pontuação boa mas precisa melhorar");
        }
        else if (pont >= 7 && pont <= 9) {
            System.out.println("Quase gabaritou , parabéns");
        }
        else if (pont == 10 ) {
            System.out.println("Você tem dominio sobre o assunto");
        }
    };
    
}

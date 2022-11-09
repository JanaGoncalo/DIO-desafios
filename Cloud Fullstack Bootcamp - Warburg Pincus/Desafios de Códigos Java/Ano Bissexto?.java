/*Desafio
Faça um Programa que peça um número correspondente a um determinado ano e em seguida informe se este ano é ou não bissexto

Entrada
A entrada consiste em um valor inteiro referente ao ano solicitado.

Saída
A saída deverá retornar se o ano será bissexto ou não, conforme exemplo abaixo:

Exemplo 1
Entrada	Saída
1992	  Bissexto

Exemplo 2
Entrada	Saída
2021	  Nao Bissexto
*/

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.  

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner ent = new Scanner(System.in);
        int ano;
    
        ano = ent.nextInt();
        
       if(ano % 4 != 0 ){
         System.out.println("Nao Bissexto");
       } else if (ano % 100 != 0){
            System.out.println("Bissexto");
         } else if (ano % 400 == 0){
           System.out.println("Bissexto");
         }else {
           System.out.println("Nao Bissexto");
         }
    }
}

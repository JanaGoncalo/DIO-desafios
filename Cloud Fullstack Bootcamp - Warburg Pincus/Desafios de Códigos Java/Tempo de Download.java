/*Desafio
Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de Internet (em Mbps). Calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos). 

Entrada  
Você receberá duas entradas que representam o tamanho do arquivo para download em MB e a velocidade de um link para Internet em Mbps. 

Saída
A saída será o tempo aproximado de download do arquivo em minutos. 

Entrada	Saída
159     0.01

200

 
80      0.02

60

 
30      0.01

60
*/

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner, 
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);". 
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println. 

import java.util.Scanner;

public class Main {

  public static void main(String[] Args) {

   Scanner sc = new Scanner(System.in);
   double tmhMB = sc.nextFloat();
   double tmhMbps = sc.nextFloat();
   double tempoSegundos = tmhMB / tmhMbps;
   double tempoMinutos = tempoSegundos / 60;

    System.out.printf("%.2f", tempoMinutos);
    
    }
}

/*Desafio
Supondo que a população de um país A tenha N habitantes com uma taxa anual de crescimento de 3% e que a população de B M habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento.

Obs: O valor inicial da população A deverá ser sempre menor que do país B

Entrada
A entrada consiste em dois valores inteiros, sendo N a população do país A e M a população do país B.

Saída
A saída consiste em retornar o número de anos necessários para que a população do país A ultrapasse ou iguale a população B, mantidas as taxas de crescimento. Confira exemplo abaixo:

Exemplo 1
Entrada	 Saída
80000    16 anos

100000

Exemplo 2
Entrada	 Saída
100000   48 anos

200000
*/
// Para ler e escrever dados em Java, na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double A, B;

        Scanner input = new Scanner(System.in);
        A = input.nextInt();
        B = input.nextInt();
               

        int anos = 0;

        //TODO: retornar o número de anos necessários para que a população do país A ultrapasse ou iguale a população B
        
        System.out.println(anos + " anos");
    }
}

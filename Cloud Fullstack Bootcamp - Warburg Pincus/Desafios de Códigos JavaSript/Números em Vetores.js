/*Desafio
Faça um Programa que leia cinco números inteiros e armazene-os em um vetor chamado VETOR. Armazene os números pares no vetor PAR e os números ímpares no vetor IMPAR. 

Entrada 
Peça ao usuário que insira o valor de cinco números inteiros. 

Saída
Imprima os valores dos três vetores um em cada linha mostrando na primeira linha, os valores no Vetor, na segunda linha os valores Par(es) e na terceira linha os valores ímpares Impar(es). Conforme o exemplo a baixo.  

 ENTRADA      SAÍDA 

3             Vetor: 3,4,6,9,10

4             Par(es): 4,6,10

6             Impar(es): 3,9

9

10



4             Vetor: 4,6,10,20,18

6             Par(es): 4,6,10,20,18

10            Impar(es):

20

18



3             Vetor: 3,9,7,11,21

9             Par(es):

7             Impar(es): 3,9,7,11,21

11

21 
*/


let vetor = [];
let pares = [];
let impares = [];

for(let i = 0; i < 5; i++){
  vetor[i] = gets();
  if(vetor[i] % 2 === 0){
    pares.push(vetor[i]);
  } else {
    impares.push(vetor[i]);
  }
}

  print("Vetor: " + vetor)

  print("Par(es): " + pares)

  print("Impar(es): " + impares)




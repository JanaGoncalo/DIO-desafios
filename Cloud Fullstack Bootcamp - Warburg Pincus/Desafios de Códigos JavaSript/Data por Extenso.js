/*Desafio
Geronimo acredita que perde muito tempo lembrando qual número do mês representa cada um deles. Ele precisa de um programa que mude os meses do ano do calendário do celular dele para facilitar e agilizar a leitura. Ajude-o e faça um programa que, com uma determinada entrada de uma data, retorne essa data com o mês escrito por extenso.

Entrada
As entradas serão datas em formato numeral. O dia ou mês que possuirem somente um digito, terão um 0 (zero) na frente.

Saida
As saídas serão as mesmas datas da entrada porém, com o mês escrito por extenso. O mês deve ter a primeira letra em maiúsculo.

 

  EXEMPLO DE ENTRADA   EXEMPLO DE SAÍDA 

  19/10/1997           19 de Outubro de 1997 

  25/12/2019           25 de Dezembro de 2019 

  02/02/2020           02 de Fevereiro de 2020 
  */

// IMPORTANTE: As funções "gets" e "print" são acessíveis globalmente, onde:
// - "gets" : lê UMA linha com dado(s) de entrada (inputs) do usuário;
// - ".split()": esse método transforma uma string em um array de substrings;
// - "print": imprime um texto de saída (output) e pula uma linha ("\n") automaticamente.

// TODO: faça um programa que retorne a data da entrada com o mês por extenso;

let data = gets();
let dataSplit = data.split('/');

const mes = mesExtenso(dataSplit[1]);

print(dataSplit[0] + " de " + mes + " de " + dataSplit[2])

function mesExtenso(mes){
  switch (mes) {
    
    case "01": return "Janeiro";
    case "02": return "Fevereiro";
    case "03": return "Março";
    case "04": return "Abril";
    case "05": return "Maio";
    case "06": return "Junho";
    case "07": return "Julho";
    case "08": return "Agosto";
    case "09": return "Setembro";
    case "10": return "Outubro";
    case "11": return "Novembro";
    case "12": return "Dezembro";
  }
}

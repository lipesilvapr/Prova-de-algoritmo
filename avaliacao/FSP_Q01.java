package avaliacao;
    /*Avaliação de Felipe Silva Pires*/

/*1 – Fazer um programa em Java que mostre o menu abaixo e ao ser escolhida a opção o programa deve realizar as
operações necessárias sempre utilizando estruturas de repetição e não as funções pré-definidas do Java.
Devem ser feitas todas as validações dos números digitados para que as operações apenas aceitem números válidos para
as opções do menu.
O menu deve aparecer sempre ao final de cada operação e o programa só deve ser finalizado quando o usuário escolher a
opção “6 – Sair”.
Menu
1 – Fatorial de um número
2 – Somatório de um número
3 – Potência de um número
4 – Divisão de um número por outro
5 – Multiplicação de um número por outro
6 – Sair
Observações:
Opção 1: aceitar apenas valores >= 0
Opção 2: aceitar apenas valores > 0
Opção 3: Opção 1: aceitar apenas valores >= 0 tanto para a base quanto para o expoente; deve ser feita através de um laço
e não utilizando o comando Math.pow;
Opção 4: deve ser feita através de um laço com subtrações sucessivas e não através do operador / e na resposta deve
conter o quociente e o resto da divisão;
Opção 5: deve ser feita através de um laço com somas sucessivas e não através do operador *.*/
import java.util.Scanner;

public class FSP_Q01 {
  public static void main(String args[]) {
    Scanner scan = new Scanner(System.in);
    int menu, cont, num, soma, expo, pot, divi, quo, resto, aux, multi;
    Double fat=1.0;
    
    System.out.println("Menu \n 1 - Fatorial de um número \n 2 - Somatório de um número \n 3 - Potência de um número \n 4 - Divisão de um número por outro \n 5 - Multiplicação de um número por outro \n 6 - Sair ");
    System.out.print("Escolha uma das opções acima: ");
    menu = scan.nextInt();

    while(menu != 6) {
      if(menu == 1) {
        /*Aqui será realizado o calculo do fatorial de um número qualquer maior ou igual a 0 fornecido pelo usuário, utilizei a variável fat como double pois quando o número escolhido é maior ou igual a 10 o tipo int não suporta e o resultado sai errado.*/
        System.out.print("Deseja calcular o fatorial de qual número? ");
        num = scan.nextInt();
        if(num >=0) {
          for(cont=1;cont<=num;cont++) {
          fat = fat * cont;
        } 
        } 
        else {
          System.out.println("Por favor digite um número válido da próxima vez");
        }
        System.out.println("O fatorial de " + num + " é: " + fat + " "); 
      }

      if(menu==2) {
        /*Aqui será realizado o somatório de um número qualquer maior que 0.*/
        System.out.println("Deseja o somatório de qual número?");
        num = scan.nextInt();
        soma=0;
        if(num>0) {
          for(cont=1;cont<=num;cont++) {
            soma = soma + cont;
          }
          System.out.println("O somatório de " + num + " é: " + soma + " ");
        } else {
          System.out.println("Por favor digite um número válido da próxima vez");
        }
      }

      if(menu==3) {
        /*Aqui será realizado o cálculo da potência de uma base qualquer e um expoente qualquer onde ambos devem ser maiores ou iguais a 0 e sem a utilização do comando Math.pow, apenas estrutura de repetição.*/
        System.out.print("Deseja calcular a potência de qual base? ");
        num = scan.nextInt();
        System.out.print("E qual expoente? ");
        expo = scan.nextInt();
        pot=1;
        if(num>=0 && expo>=0) {
          for(cont=1;cont<=expo;cont++) {
            pot = pot * num;
          }
           System.out.println("A potenciação de " + num + " com expoente " + expo + " é: " + pot + " ");
        } else{
          System.out.println("Por favor digite um número válido da próxima vez");
        }
      }
      
      if(menu==4) {
        /*Aqui será realizada a divisão de um número por outro utilizando somente de subtrações sucessivas e também é apresentado o resto e o quociente da operação*/
        System.out.print("Qual o dividendo desejado para a operação? ");
        num = scan.nextInt();
        System.out.print("E o divisor? ");
        divi = scan.nextInt();
        aux=num;
        resto=0;
        quo=0;
        if(num>divi){
          while(num>=divi) {
            num = num - divi; 
            resto = num;
            quo++;
        }  
        }  else {
          System.out.println("Por favor digite um número válido da próxima vez");
        }
        System.out.println("A divisão de " + aux + " por " + divi + " tem resto " + resto + " e quociente " + quo);
      }

      if(menu==5) {
        /*Aqui será realizada a multiplicação de um número por outro utilizando somente de somas sucessivas.*/
        System.out.print("Qual o número que será multiplicado? ");
        num = scan.nextInt();
        System.out.print("E o multiplicador? ");
        multi = scan.nextInt();
        aux=num;
        for(cont=1;cont<multi;cont++) {
          num = num + aux;
        }
        System.out.println("A multiplicação de " + aux + " por " + multi + " é: " + num + " ");
      }    
      
      if(menu<=0 || menu > 6) {
        System.out.println("Por favor digite um número válido da próxima vez");
      }
      System.out.println();
      System.out.println("--------------------------------");
      System.out.println("Menu \n 1 - Fatorial de um número \n 2 - Somatório de um número \n 3 - Potência de um número \n 4 - Divisão de um número por outro \n 5 - Multiplicação de um número por outro \n 6 - Sair ");
    System.out.print("Escolha uma das opções acima: ");
    menu = scan.nextInt();
    }
    
    System.out.print("Obrigado!");
    
  }
}


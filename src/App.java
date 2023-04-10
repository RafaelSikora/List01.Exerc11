import java.util.Scanner;
//Exercicio 11: Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
//(1) O produto do dobro do primeiro com metade do segundo .
//(2) A soma do triplo do primeiro com o terceiro.
//(3) Terceiro elevado ao cubo.
class Main {
public static void main(String[] args){
//Declaração de variáveis
int numero1;
int numero2;
double numero3;
double resultado1;
double resultado2;
double resultado3;
//Fazer a entrada dos dados
Scanner teclado = new Scanner(System.in);
System.out.println("Digite o primeiro numero: ");
numero1 = teclado.nextInt();
System.out.println("Digite o segundo numero: ");
numero2 = teclado.nextInt();
System.out.println("Digite o terceiro numero: ");
numero3 = teclado.nextDouble();
//Fazer os calculos
resultado1 = (numero1 * 2) * (numero2 / 2);
resultado2 = (numero1 * 3) + numero3;
resultado3 = numero3 * numero3 * numero3;
//Mostrar o resultado pro usuario
System.out.println("O primeiro resultado é: " + resultado1);
System.out.println("O segundo resultado é: " + resultado2);
System.out.println("O terceiro resultado é: " + resultado3);  
  }
}
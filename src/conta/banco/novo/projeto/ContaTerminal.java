package conta.banco.novo.projeto;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
		// TODO: Conhecer e importar a classe Scanner
		
		// Exibir as mensagens para o nosso usuário
		
		// Obter pela scanner os valores digitados no terminal
		
		// Exibir a mensagem conta criada
		
		int numeroConta;
		String agencia = "";
		String nomeCliente = "";
		double saldo;
		String sobrenome = "";
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Qual o seu nome e sobrenome?");
		nomeCliente = scanner.next();
		sobrenome = scanner.next();
		
		System.out.println("Por favor, digite o número da Agência!");
		agencia = scanner.next();
		
		System.out.println("Por favor, qual é o número da sua conta corrente?");
		numeroConta = scanner.nextInt();
		
		System.out.println("Informe o saldo?");
		saldo = scanner.nextDouble();
		
		
		System.out.println("Olá " + nomeCliente + " " + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + "já está disponível para saque.");

	}

}

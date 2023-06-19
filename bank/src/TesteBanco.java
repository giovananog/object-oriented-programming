import java.util.Scanner;

public class TesteBanco {
    public static void main(String[] args) {
    	System.out.println("Criando uma conta com saldo de R$1.000,00");
		Conta conta1 = new Conta(1000);
		System.out.println("Sacando 250.0");
		conta1.sacar(250);
		System.out.println("Sacando 320.50");
		conta1.depositar(320.50);
		System.out.println("Sacando 120.0");
		conta1.sacar(120);
		System.out.println("o saldo da conta eh R$ "+conta1.getSaldo());
		
		System.out.println("\n\nCriando o cliente Bruno Henrique (50,000 saldo inicial)");
		Cliente bn = new Cliente("Bruno","Henrique");
		bn.conta = new Conta(50000.0);
		System.out.println("sacando 1200  "+bn.conta.sacar(1200));
		System.out.println("depositando 8525  "+bn.conta.depositar(8525));
		System.out.println("sacando 12800  "+bn.conta.sacar(12800));
		System.out.println("sacando 50000  "+bn.conta.sacar(50000));
		System.out.print("\nO saldo da conta eh: R$ "+bn.conta.getSaldo());
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("\n\n\n------------leitura via teclado---------------");
		System.out.print("Digite uma quantia para sacar: ");
		bn.conta.sacar(scanner.nextDouble());
		System.out.print("\nDigite uma quantia para depositar: ");
		bn.conta.depositar(scanner.nextDouble());
		System.out.print("\nO saldo da conta eh: R$ "+bn.conta.getSaldo());
	}
}

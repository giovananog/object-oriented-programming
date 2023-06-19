package pack4;
import java.util.Scanner;

public class TesteVeiculo4 {
	public static void main(String[] args) {
		double num;
		Scanner scanner = new Scanner(System.in);
		
		Veiculo4 carro1 = new Veiculo4(10000);
		System.out.println("Adicionando Caixa número : ");
		num = scanner.nextDouble();
		System.out.println(num+" "+carro1.adicionaCaixa(num));
		System.out.println("Adicionando Caixa número : ");
		num = scanner.nextDouble();
		System.out.println(num+" "+carro1.adicionaCaixa(num));
		System.out.println("Adicionando Caixa número : ");
		num = scanner.nextDouble();
		System.out.println(num+" "+carro1.adicionaCaixa(num));
		System.out.println("Adicionando Caixa número : ");
		num = scanner.nextDouble();
		System.out.println(num+" "+carro1.adicionaCaixa(num));
		System.out.println("Adicionando Caixa número : ");
		num = scanner.nextDouble();
		System.out.println(num+" "+carro1.adicionaCaixa(num));
		System.out.println("A carga do veiculo eh: "+carro1.getCarga()+"kg");
		
	}
}

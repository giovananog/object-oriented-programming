


public class TesteVeiculo1 {
   public static void main(String[] args) {
	Veiculo carro1 = new Veiculo(10000);
	System.out.println("Adicionando Caixa número 1 (500kg) ");
	carro1.carga += 500;
	System.out.println("Adicionando Caixa número 2 (250kg) ");
	carro1.carga += 250;
	System.out.println("Adicionando Caixa número 3 (5000kg) ");
	carro1.carga += 5000;
	System.out.println("Adicionando Caixa número 4 (4000kg) ");
	carro1.carga += 4000;
	System.out.println("Adicionando Caixa número 5 (300kg) ");
	carro1.carga += 300;
	System.out.println("A carga do veiculo eh: "+carro1.getCarga()+"kg");
	
}
}

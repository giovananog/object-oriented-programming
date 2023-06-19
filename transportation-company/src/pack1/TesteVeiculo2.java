package pack1;

public class TesteVeiculo2 {
   public static void main(String[] args) {
	Veiculo2 carro1 = new Veiculo2(10000);
	System.out.println("Adicionando Caixa número 1 (500kg) "+ carro1.adicionaCaixa(500.0));
	System.out.println("Adicionando Caixa número 2 (250kg) "+ carro1.adicionaCaixa(250.0));
	System.out.println("Adicionando Caixa número 3 (5000kg) "+carro1.adicionaCaixa(5000.0));
	System.out.println("Adicionando Caixa número 4 (4000kg) "+carro1.adicionaCaixa(4000.0));
	System.out.println("Adicionando Caixa número 5 (300kg) "+carro1.adicionaCaixa(300.0));
	System.out.println("A carga do veiculo eh: "+carro1.getCarga()+"kg");
	
}
}


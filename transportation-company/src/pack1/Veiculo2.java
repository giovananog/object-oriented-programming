package pack1;

public class Veiculo2 {
   public double carga;
   public double cargaMaxima;
   
   Veiculo2 (double cargaMax) {
	   System.out.println("Criando um veiculo com carga máxima de "+cargaMax+"kg.");
	   this.cargaMaxima = cargaMax;
   }
   
   public double getCarga() {
	return carga;
   }
   public double getCargaMaxima() {
	return cargaMaxima;
   }
   
   public boolean adicionaCaixa(double peso) {
	   if (carga + peso < cargaMaxima) {
		   carga += peso;
		   return true;
	   }
	   return false;
   }
}



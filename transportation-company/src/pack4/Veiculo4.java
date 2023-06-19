package pack4;

public class Veiculo4 {
	public double carga;
	   public double cargaMaxima;
	   
	   Veiculo4 (double cargaMax) {
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
	   
	   public double newtonsParaQuilos(double peso) {
		   return peso*9.8;
	   }
	   
	   public double QuilosparaNewtons(double peso) {
		   return peso/9.8;
	   }
}

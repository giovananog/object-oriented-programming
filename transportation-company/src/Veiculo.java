
public class Veiculo {
   public double carga;
   public double cargaMaxima;
   
   Veiculo (double cargaMax) {
	   System.out.println("Criando um veiculo com carga máxima de "+cargaMax+"kg.");
	   this.cargaMaxima = cargaMax;
   }
   
   public double getCarga() {
	return carga;
   }
   public double getCargaMaxima() {
	return cargaMaxima;
   }
}

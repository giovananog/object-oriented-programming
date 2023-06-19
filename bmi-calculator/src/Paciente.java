
public class Paciente {
  public  double altura;
  public double peso;
  
  
  public Paciente (double peso, double altura){	  
	  this.altura = altura;
	  this.peso = peso;
  }
  
  public double calcularIMC () {
	  return peso / (altura * altura);
  }
  
  public void diagnostico() {
	  double r = calcularIMC();
	  System.out.println("Diagnostico: ");
	  if(r < 16) {
		  System.out.println("baixo peso muito grave");
	  }else if(r < 16.99) {
		  System.out.println("baixo peso grave");
	  }else if(r < 18.49) {
		  System.out.println("baixo peso");
	  }else if(r < 24.99) {
		  System.out.println("peso normal");
	  }else if(r < 29.99) {
		  System.out.println("sobrepeso");
	  }else if(r < 34.99) {
		  System.out.println("obesidade grau 1");
	  }else if(r < 39.99) {
		  System.out.println("obesidade grau 2");
	  }else {
		  System.out.println("obesidade morbida");
	  }
  }
}


public class TestePonto {
  public static void main(String[] args) {
	Ponto primeiroPonto = new Ponto();
	Ponto segundoPonto = new Ponto(400,230);
	
	primeiroPonto.setX(200);
	primeiroPonto.setY(200);
	
	System.out.println("coordenadas do primeiro ponto (x,y): ("+primeiroPonto.getX()+","+primeiroPonto.getY()+")");
	System.out.println("coordenadas do primeiro ponto (x,y): ("+segundoPonto.getX()+","+segundoPonto.getY()+")");
	
	Ponto outraRefSegundoPonto = segundoPonto;
	
	System.out.println("\n\nExibindo o conteudo de todas referencias\n");
	System.out.println("coordenadas do primeiro ponto (x,y): ("+primeiroPonto.getX()+","+primeiroPonto.getY()+")");
	System.out.println("coordenadas do segundo ponto (x,y): ("+segundoPonto.getX()+","+segundoPonto.getY()+")");
    System.out.println("coordenadas do terceiro ponto (x,y): ("+outraRefSegundoPonto.getX()+","+outraRefSegundoPonto.getY()+")");
    
    outraRefSegundoPonto.setX(840);
    outraRefSegundoPonto.setY(350);
    
    System.out.println("\n\nExibindo o conteudo de todas referencias com o terceiro alterado (por referencia)\n");
	System.out.println("coordenadas do primeiro ponto (x,y): ("+primeiroPonto.getX()+","+primeiroPonto.getY()+")");
	System.out.println("coordenadas do segundo ponto (x,y): ("+segundoPonto.getX()+","+segundoPonto.getY()+")");
    System.out.println("coordenadas do terceiro ponto (x,y): ("+outraRefSegundoPonto.getX()+","+outraRefSegundoPonto.getY()+")");
  }
}

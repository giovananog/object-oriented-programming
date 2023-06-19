
public class Principal {
	public static void main(String[] args) {
		System.out.println("\nPaciente 1: ");
		Paciente novo = new Paciente(400, 1.70);	
		novo.diagnostico();
		
		System.out.println("\nPaciente 2: ");
		Paciente novo1 = new Paciente(44, 1.70);	
		novo1.diagnostico();
		
		System.out.println("\nPaciente 3: ");
		Paciente novo2 = new Paciente(80, 1.70);	
		novo2.diagnostico();
	}
}

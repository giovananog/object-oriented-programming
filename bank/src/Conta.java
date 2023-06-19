
public class Conta {
  double saldo;
  
  public Conta(double saldoInicial) {
	  this.saldo = saldoInicial;
  }
  
  public double getSaldo() {
	return saldo;
}
  
  public boolean depositar(double valor) {
	  saldo += valor;
	  return true;
  }
  
  public boolean sacar(double valor) {
	  if (saldo - valor > 0) {
		  saldo -= valor;
		  return true;
	  }
	  return false;
  }
}

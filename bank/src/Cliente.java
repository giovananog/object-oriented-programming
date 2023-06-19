
public class Cliente {
   String nome;
   String sobrenome;
   Conta conta;
   
   public Cliente(String nome, String sobrenome) {
	   this.nome = nome;
	   this.sobrenome = sobrenome;
   }
   
   public Conta getConta() {
	return conta;
}
   public String getNome() {
	return nome;
}
   public String getSobrenome() {
	return sobrenome;
}
   public void setConta(Conta conta) {
	this.conta = conta;
}
   public void setNome(String nome) {
	this.nome = nome;
}
   public void setSobrenome(String sobrenome) {
	this.sobrenome = sobrenome;
}
   
}

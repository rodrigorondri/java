class Conta {
	int numero;
	String dono;
	double saldo;
	double limite;
	//Saca algum valor da conta
	boolean saca(double valor){
	
		if(this.saldo < valor){
			return false;
		}
		else{
			this.saldo = this.saldo - valor;
			return true;
		}
	}
	// deposita valor
	void deposita(double quantidade){
		this.saldo += quantidade;
	}
	
	/* transfereicia, saca da conta informada e deposita em outra, 
	restornando se deu ou nao certo */
	boolean transferePara(Conta destino, double valor){
		if(this.saca(valor)== false){
			// nao deu para sacar
			return false;
		} 
		else {
			destino.deposita(valor);
			return true;
		}
	}
	
}

class Programa {
	public static void main(String[] args){
		Conta minhaConta;
		minhaConta = new Conta();
		minhaConta.dono = "Rodrigo";
		minhaConta.saldo = 1000.0;
		
		Conta meuSonho;
		meuSonho = new Conta();
		meuSonho.saldo = 150000.0;
		meuSonho.dono = "Bill";
		
		System.out.println("Saldo atual minha conta: " + minhaConta.saldo);
		System.out.println("Saldo atual Meu sonho: " + meuSonho.saldo);
		
		//depositar
		minhaConta.deposita(300.0);
		// sacar
		if(minhaConta.saca(1500.0)){ // exibe mensagem se foi efetuado ou não o saque
			System.out.println("Saque confirmado");
		} else {
			System.out.println("Saldo insuficiente");
		}
		System.out.println("\nSaldo atual depois de movimentar minha conta: " + minhaConta.saldo);
		
		if(meuSonho.transferePara(minhaConta,2000.0)== true){
			System.out.println("Transferencia confirmada");
		}
		else {
			System.out.println("Transferencia falhou");
		}
		System.out.println("Saldo atual minha conta: " + minhaConta.saldo);
		System.out.println("Saldo atual Meu sonho: " + meuSonho.saldo);
	}
}
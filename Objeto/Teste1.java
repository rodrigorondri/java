class Cliente{
	String nome;
	String sobrenome;
	String cpf;
}

class Conta{
	int numero;
	double saldo;
	double limite;
	Cliente titular;	/*se nao usar new Cliente() aqui titular e seus atributos serao NULL
						pois o new do Conta não vai por valores default em titular */
}

class Teste1{
	public static void main(String[] args){
		Conta minhaconta = new Conta();
		Cliente c = new Cliente();
		minhaconta.titular = c;
		c.nome = "Andre";
		minhaconta.titular.nome = "Rodrigo";
		System.out.println(c.nome);
		System.out.println(minhaconta.titular.nome);
		/* Os dois prints sao iguais pois minhaconta.titular.nome aponta
		para o mesmo endereco que c.nome, o Rodrigo sobreescreveu o Andre
		*/
	}
}

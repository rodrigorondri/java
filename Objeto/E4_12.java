/* este exercicio esta na pagina 57 do pdf do caelum */
class Data {
	int dia;
	int mes;
	int ano;
}

class Funcionario {
	String nome;
	String departamento;
	double salario;
	Data dataEntrada = new Data();
	String rg = "0000000-0";
	boolean naEmpresa;
	
	void bonifica(double aumento){
		this.salario = this.salario + aumento;
	}
	
	void demite(){
		this.naEmpresa = false;
	}
	
	void mostra(){
		System.out.println("\nNome: " + this.nome);
		System.out.println("Departamento: " + this.departamento);
		System.out.println("Salario: " + this.salario);
		System.out.println("Data de Entrada: " + this.dataEntrada.dia + "/"
							+ this.dataEntrada.mes + "/"
							+ this.dataEntrada.ano);
		System.out.println("RG: " + this.rg);
		System.out.println("Esta na Empresa: " + this.naEmpresa);
	}
}

class E4_12{
	public static void main(String[] args){
		
			Funcionario f1 = new Funcionario();
			
			f1.nome = "Rodrigo";
			f1.departamento = "CPD";
			f1.salario = 2500.0;
			f1.bonifica(500);
			f1.dataEntrada.dia = 10;
			f1.dataEntrada.mes = 2;
			f1.dataEntrada.ano = 2010;
			f1.mostra();
			
			Funcionario f2 = new Funcionario();
			f2.nome = "Andre";
			f2.departamento = "Exp";
			f2.salario = 2000.0;
			f2.dataEntrada.dia = 20;
			f2.dataEntrada.mes = 4;
			f2.dataEntrada.ano = 2012;
			f2.mostra();
			//vai ser igual
			Funcionario f3 = f1;
			// sera igual se forem a mesma referncia
			if(f1 == f2){
				System.out.println("Sao iguais");
			}
			else{
				System.out.println("Diferentes");
			}
	}
}
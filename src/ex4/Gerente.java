package ex4;

public class Gerente extends Funcionario {
	
	
	
	
	public Gerente() {
		super();
		
	}

	public Gerente(String nome, int idade, double salario) {
		super(nome, idade, salario);
		
	}

	public void bonifica��o(double sal) {
		super.bonifica��o(sal);
		this.salario += 10000.0 ; 
		
	}

	@Override
	public void status() {
		super.status();
		System.out.println("Gerente");
	}
	
}

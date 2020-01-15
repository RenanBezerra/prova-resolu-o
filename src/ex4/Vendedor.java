package ex4;

public class Vendedor extends Funcionario {
	
	
	public Vendedor() {
		super();
		
	}

	public Vendedor(String nome, int idade, double salario) {
		super(nome, idade, salario);
		
	}

	public void bonificação(double sal) {
		super.bonificação(sal);
		this.salario += 3000.0; 
	}

	@Override
	public void status() {
		super.status();
		System.out.println("Vendedor");
	}
	
	
}

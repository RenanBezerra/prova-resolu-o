package ex4;

public class Supervisor extends Funcionario {
	
	
	
	
	public Supervisor() {
		super();
		
	}

	public Supervisor(String nome, int idade, double salario) {
		super(nome, idade, salario);
		
	}

	public void bonificação(double sal) {
		super.bonificação(sal);
		this.salario += 5000.0; 
	}

	@Override
	public void status() {
		super.status();
		System.out.println("Supervisor");
	}
	
	

}

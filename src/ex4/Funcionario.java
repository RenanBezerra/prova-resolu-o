package ex4;

public abstract class Funcionario {
	
//atributos	
	protected String nome;
	protected int idade;
	protected double salario;
	
	
public Funcionario(String nome, int idade, double salario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}

public Funcionario() {
	
}
//getters setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
//metodos	
	public void bonifica��o(double sal) {
		salario += sal;
		 System.out.println(" o salario � de "+ salario);
	}
	
	public void status () {
		 System.out.println(" Nome: "+this.nome
				 +" Idade: "+ this.idade+
				 " Salario: "+ this.salario);
		
		
	}
	
}

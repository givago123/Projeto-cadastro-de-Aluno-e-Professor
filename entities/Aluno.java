package entities;

public class Aluno extends Pessoa{
	
	private Integer matricula;

	public Aluno(String nome, String sobrenome, Integer matricula) {
		super(nome, sobrenome);
		this.matricula = matricula;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + "\nSobrenome: " + getSobrenome() + "\nMatricula: " + matricula;
	}
	
	

}

package exercicio17._4;

public class Funcionario {

	private String nome;
	private String sobrenome;
	private String empresa;
	private String departamento;
	private int id;
	private float salario;
	private int anosDeCasa;
	private boolean trabalhando;
	private boolean ferias;
	
	public void status() {
		System.out.println("\nNOME: " + this.nome + " " + this.sobrenome);
		System.out.println("ID: " + this.id);
		System.out.println("SALÁRIO: R$ " + this.salario);
		System.out.println("EMPRESA: " + this.empresa);
		System.out.println("DEPARTAMENTO: " + this.departamento);
		System.out.println("ANOS DE CASA: " + this.anosDeCasa);
		System.out.println("TRABALHANDO ATUALMENTE? " + this.trabalhando);
		System.out.println();
	}
	
	public void receberAumento(float aumento) {
		this.setSalario(this.getSalario() + aumento);
	}
	
	public void tirarFerias() {
		if(this.ferias) {
			System.out.println("Já está de férias");
		} else {
			System.out.println("Férias!!!");
			this.setFerias(true);
			this.setTrabalhando(false);
		}
	}
	
	public void demitir() {
		if(this.ferias) {
			System.out.println("Funcionário está de férias. Não é possível demitir.");
		} else {
			this.setTrabalhando(false);
			System.out.println("Que pena! Foi demitido!");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int getAnosDeCasa() {
		return anosDeCasa;
	}

	public void setAnosDeCasa(int anosDeCasa) {
		this.anosDeCasa = anosDeCasa;
	}

	public boolean isTrabalhando() {
		return trabalhando;
	}

	public void setTrabalhando(boolean trabalhando) {
		this.trabalhando = trabalhando;
	}

	public boolean isFerias() {
		return ferias;
	}

	public void setFerias(boolean ferias) {
		this.ferias = ferias;
	}

}

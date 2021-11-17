package exercicio17._4;

public class Main {

	public static void main(String[] args) {
		
		Funcionario f1 = new Funcionario();
		
		f1.setNome("Mário");
		f1.setSobrenome("Junior");
		f1.setId(4389);
		f1.setSalario(4500f);
		f1.setEmpresa("VARIG");
		f1.setDepartamento("Financeiro");
		f1.setAnosDeCasa(3);
		
		f1.receberAumento(570);
		f1.tirarFerias();
		
		f1.status();
		
		System.out.println("----------------------------------");
		
		Funcionario f2 = new Funcionario();
		
		f2.setNome("Juvenal");
		f2.setSobrenome("Cardoso");
		f2.setId(4255);
		f2.setSalario(3200f);
		f2.setEmpresa("VARIG");
		f2.setDepartamento("Transportes");
		f2.setAnosDeCasa(5);
		
		f2.demitir();
		
		f2.status();
		
	}
}
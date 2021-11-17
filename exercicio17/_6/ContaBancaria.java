package exercicio17._6;

public class ContaBancaria {

	private String proprietario;
	private String banco;
	private int agencia;
	private int conta;
	private float saldo;
	private boolean poupanca;
	private boolean aberta;

	public void status() {
		System.out.println("\nPROPRIETÁRIO: " + this.proprietario);
		System.out.println("BANCO: " + this.banco);
		if (this.poupanca) {
			System.out.println("AG: " + this.agencia + " | CP: " + this.conta);
		} else {
			System.out.println("AG: " + this.agencia + " | CC: " + this.conta);
		}
		System.out.println("SALDO: R$ " + this.saldo);
		System.out.println("ABERTA? " + this.aberta);
		System.out.println("POUPANÇA? " + this.poupanca);
	}

	public void abrirConta() {
		if (this.aberta) {
			System.out.println("Erro! Conta já aberta!");
		} else {
			this.aberta = true;
		}
	}

	public void mudarParaPoupanca() {
		if (this.aberta == false) {
			System.out.println("Erro! A conta ainda não foi aberta!");
		} else {
			if (this.poupanca) {
				System.out.println("Erro! Já é Conta Poupança!");
			} else {
				System.out.println("A conta agora é uma Poupança!");
				this.poupanca = true;
			}
		}
	}

	public void mudarParaCorrente() {
		if (this.aberta == false) {
			System.out.println("Erro! A conta ainda não foi aberta!");
		} else {
			if (this.poupanca == false) {
				System.out.println("Erro! Já é Conta Corrente!");
			} else {
				System.out.println("A conta agora é uma Corrente!");
				this.poupanca = false;
			}
		}
	}

	public void depositar(float valor) {
		if (this.aberta) {
			this.saldo += valor;
			System.out.println("Depositando R$ " + valor);
		} else {
			System.out.println("Erro! Não é possível depositar em uma conta fechada.");
		}
	}

	public void sacar(float valor) {
		if (this.aberta && this.saldo >= valor) {
			System.out.println("Sacando R$ " + valor);
			this.saldo -= valor;
		} else {
			System.out.println("Erro! Conta fechada ou com saldo insuficiente!");
		}
	}

	public void fecharConta() {
		if (this.aberta && this.saldo == 0) {
			System.out.println("Conta encerrada com sucesso.");
			this.aberta = false;
		} else if (this.saldo > 0) {
			System.out.println(
					"Não é possível encerrar a conta. Você deve sacar os R$ " + this.saldo + " antes de encerrá-la.");
		} else {
			System.out.println("Não é possível encerrar a conta, já que ela tem um valor NEGATIVO de R$ " + this.saldo);
		}
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public boolean isPoupanca() {
		return poupanca;
	}

	public void setPoupanca(boolean poupanca) {
		this.poupanca = poupanca;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

}

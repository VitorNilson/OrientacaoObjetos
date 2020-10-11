public class Conta {

	private double saldo;
	private int agencia;
	private int conta;
	private CriaTitular titular;

	// m�todo para depositar determinado valor em determinada conta.
	public void deposita(double valor) {

		this.saldo += valor;
	}

	// m�todo para sacar valor de determinada conta
	public void saca(double valor) {

		if (this.saldo >= valor) {

			this.saldo -= valor;
		}
	}

	// m�todo para transferir valores entre contas.
	public boolean transfere(double valor, Conta destino) {

		if (this.saldo >= valor) {

			this.saldo -= valor;
			destino.saldo += valor;
			return true;
		}
		return false;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	// m�todo para exibir agencia.
	public int agencia() {
		return this.agencia;
	}

	// m�todo para setar agencia.
	public void agencia(int agencia) {
		this.agencia = agencia;
	}

	// m�todo para exibir conta.
	public int getConta() {
		return this.conta;
	}

	// m�todo para setar conta.
	public void setConta(int conta) {
		this.conta = conta;
	}
	
	public CriaTitular getTitular() {
		return this.titular;
	}
	
	public void setTitular(CriaTitular titular) {
		this.titular = titular;
	}

}
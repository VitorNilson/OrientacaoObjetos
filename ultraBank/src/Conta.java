public class Conta {

	private double saldo;
	private int agencia;
	private int conta;
	private CriaTitular titular;

	// método para depositar determinado valor em determinada conta.
	public void deposita(double valor) {

		this.saldo += valor;
	}

	// método para sacar valor de determinada conta
	public void saca(double valor) {

		if (this.saldo >= valor) {

			this.saldo -= valor;
		}
	}

	// método para transferir valores entre contas.
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
	
	// método para exibir agencia.
	public int agencia() {
		return this.agencia;
	}

	// método para setar agencia.
	public void agencia(int agencia) {
		this.agencia = agencia;
	}

	// método para exibir conta.
	public int getConta() {
		return this.conta;
	}

	// método para setar conta.
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
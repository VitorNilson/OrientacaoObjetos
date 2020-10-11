
public class CriaTitular {
	
	private String nome;
	private String cpf;
	private String profissao;
	
	//método para exibir nome do titular;
	public String getNome() {
		
		return this.nome;
	}
	
	//método para setar nome.
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//método para exibir CPF.
	public String getCpf() {
		return cpf;
	}
	
	//Método para setar CPF.
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	//Método para exibir profssão.
	public String getProfissao() {
		return profissao;
	}
	
	//Método para setar profissão.
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}

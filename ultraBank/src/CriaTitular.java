
public class CriaTitular {
	
	private String nome;
	private String cpf;
	private String profissao;
	
	//m�todo para exibir nome do titular;
	public String getNome() {
		
		return this.nome;
	}
	
	//m�todo para setar nome.
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	//m�todo para exibir CPF.
	public String getCpf() {
		return cpf;
	}
	
	//M�todo para setar CPF.
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	//M�todo para exibir profss�o.
	public String getProfissao() {
		return profissao;
	}
	
	//M�todo para setar profiss�o.
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
}

package tipos;

public class Cliente {
	
	private String email, nome, nomeCao, porteCao, raca, data, servico;
	
	public Cliente(){};

	public Cliente(String email, String nome, String nomeCao, String porteCao,
			String raca, String data, String servico) {
		super();
		this.email = email;
		this.nome = nome;
		this.nomeCao = nomeCao;
		this.porteCao = porteCao;
		this.raca = raca;
		this.data = data;
		this.servico = servico;
	}

	

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeCao() {
		return nomeCao;
	}

	public void setNomeCao(String nomeCao) {
		this.nomeCao = nomeCao;
	}

	public String getPorteCao() {
		return porteCao;
	}

	public void setPorteCao(String porteCao) {
		this.porteCao = porteCao;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Email: " + email + "\nNome=" + nome + "\nNomeCao=" + nomeCao + "\nPorteCao=" + porteCao
				+ "\nRaca=" + raca + "\nData=" + data + "\nServico=" + servico;
	}
	
	

}

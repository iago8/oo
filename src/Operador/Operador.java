package Operador;

public class Operador {
	private String login;
	private String nome;
	private String senha;

	public Operador() {
		this.login "sem nome";
		this.nome "sem nome";
		this.senha "sem senha";	
	}
	
	public Operador(String nomenovo,String login_novo,String senhanovo) {
		this.login = login_novo;
		this.nome = nomenovo;
		this.senha = senhanovo;	
	}
	
	public void cadastraroperador(){

}
	public void realizareserva(){
		
	}
	
	public void cadastrarvoo(){
		
	}
	

	private String getLogin() {
		return login;
	}

	private void setLogin(String login) {
		this.login = login;
	}

	private String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private String getSenha() {
		return senha;
	}

	private void setSenha(String senha) {
		this.senha = senha;
	}
	
}
package Administrador;

public class Administrador {
	private String login;
	private String nome;
	private String senha;

	public Administrador() {
		this.login "sem nome";
		this.nome "sem nome";
		this.senha "sem senha";
	}
	
	public Administrador(String nomenovo,String login_novo,String senhanovo) {
		this.login = login_novo;
		this.nome = nomenovo;
		this.senha = senhanovo;	
	}
	
	public void cadastroadministardor(){

	}
	
	public void cancelareserva(){
		
	}
	
	public void cancelarvoo(){
		
	}
	

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
}

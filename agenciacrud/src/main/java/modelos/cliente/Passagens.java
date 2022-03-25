package modelos.cliente;

public class Passagens extends Cliente {

	public Passagens () {
		
	}
	private int idCliente;
	private int idPassagens;
	private String nome;
	private String dataNascimento;
	private String cpf;
	
	
	public int getIdcliente() {
		return idCliente;
	}
	public void setIdcliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getIdpassagens() {
		return idPassagens;
	}
	public void setIdpassagens(int idPassagens) {
		this.idPassagens = idPassagens;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
}

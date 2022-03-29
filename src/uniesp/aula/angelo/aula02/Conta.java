package uniesp.aula.angelo.aula02;

public class Conta {
	private int numero;
	private String nome;
	double saldo;
	double limite;
	
	public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome=nome;
    }
	
    public int getNumero(){
        return numero;
    }
    
    public void setNumero(int numero){
        this.numero=numero;
    }

	public Conta(int numero, String nome, double saldo, double limite) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.limite = limite;
	}
	
	public Conta(int numero, String nome, double saldo) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.limite = 2000;
	}
	
	public Conta() {
		
	}

	void saca (double quantidade) {
		double novoSaldo = this.saldo - quantidade;
		this.saldo = novoSaldo;  
	}
	
	double saca (double saldotemp, double quantidade) {
		double novoSaldo = saldotemp - quantidade;
		saldotemp = novoSaldo;
		return saldotemp;
	}
}
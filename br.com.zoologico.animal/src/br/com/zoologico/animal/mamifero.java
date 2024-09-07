package br.com.zoologico.animal;

public class mamifero extends animal {

	private String pelo;
	
	public mamifero(String nome, int idade, String pelo) {
		super(nome, idade);
		this.pelo = pelo;
	}
	
	public void amamentar() {
		System.out.println("Amamentando. .");
	}
	
	@Override
	public void exibirInfo() {
		// TODO Auto-generated method stub
		super.exibirInfo();
		System.out.println ("Pelo: "+pelo);
	}

	
}

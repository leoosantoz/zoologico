package br.com.zoologico.animal;

public class ave extends animal {

private String tipoBico;
	
	public ave(String nome, int idade, String tipoBico) {
		super(nome, idade);
		this.tipoBico = tipoBico;
	}
	
	public void voar() {
		System.out.println("Ave voando");
	}
	
	@Override
	public void exibirInfo() {
		// TODO Auto-generated method stub
		super.exibirInfo();
		System.out.println("Tipo Bico: "+tipoBico);
	}


}

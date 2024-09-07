package br.com.zoologico.animal;

public class main {
	
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		ave objAve = new ave("Papagaio",6,"longo");
		objAve.comer();
		objAve.exibirInfo();
		
		System.out.println("=============");
		
		mamifero objMamifero = new mamifero("Papagaio",8,"Curto");
		objMamifero.amamentar();
		objMamifero.comer();
		objMamifero.exibirInfo();
		
		System.out.println("=============");
		
		animal objAnimal = new animal("Gato",6);
		objAnimal.setIdade(500);
		System.out.println(objAnimal.getIdade());
	}

}

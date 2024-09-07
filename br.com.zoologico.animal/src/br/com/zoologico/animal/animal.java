package br.com.zoologico.animal;

public class animal {

    //Caracteristicas (Atributos/Propriedades)
    private String nome;
    private int idade;

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 300) {
            this.idade = idade;
        } else {
            System.out.println("Não existe animal com essa idade");
        }
    }

    //Inicializar as propriedades da classe
    public animal(String nome, int idade) {
        super();
        this.nome = nome;
        this.idade = idade;
    }

    public void comer() {
        System.out.println("Animal comendo");
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

    }
}


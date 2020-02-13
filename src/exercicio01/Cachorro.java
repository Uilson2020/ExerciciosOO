package exercicio01;

import com.sun.tools.javac.Main;

public class Cachorro extends Main {
    private String nome ;
    private String cor;
    private String raca;


    public void latir(){
        System.out.println("O cachorro late!");
    }

    public void enterrarOsso(){
        System.out.println("O cachorro está enterrando o osso!");
    }

    public Cachorro(String nome, String cor, String raca) {
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}

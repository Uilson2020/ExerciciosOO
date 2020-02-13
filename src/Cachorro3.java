import exercicio01.Exercicio01;

public class Cachorro3 extends Exercicio01 {
    private String nome ;
    private String cor;
    private String raca;

    public Cachorro3(String nome, String cor, String raca) {
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

    public void andar(){
        System.out.println("o cachorro esta andando");

    }
}

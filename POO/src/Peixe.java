public class Peixe extends Animal {
    private String caracteristica;

    public Peixe(String nome, float comprimento, int numeroPatas, String cor, String ambiente, float velocidadeMedia, String caracteristica) {
        super(nome, comprimento, numeroPatas, cor, ambiente, velocidadeMedia);
        this.caracteristica = caracteristica;
    }


    public void dadosPeixe() {
        super.dados();
        System.out.println("Caracteristica: " + caracteristica);
    }
}
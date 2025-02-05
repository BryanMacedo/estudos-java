package javaProgramacaoOrientadaObjetos.ZPraticas.Dconstante.dominio;

public class Gato extends Animal {
    private String corPelo;

    public Gato(String nome, int idade, String corPelo) {
        super(nome, idade);
        this.corPelo = corPelo;
    }

    public final void escalar() {
        System.out.println("O gato " + this.getNome() + " está escalando.");
    }

    @Override
    public final void emitirSom() {
        System.out.println("O gato " + this.getNome() + " está miando.");
    }

    @Override
    public void informacoes() {
        super.informacoes();
        System.out.println("Cor do pelo: " + this.corPelo);
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }
}

package javaProgramacaoOrientadaObjetos.ZPraticas.DConstante.dominio;

public class Passaro extends Animal {
    private String corPena;

    public Passaro(String nome, int idade, String corPena) {
        super(nome, idade);
        this.corPena = corPena;
    }

    public final void voar() {
        System.out.println("O pássaro " + this.getNome() + " está voando.");
    }

    @Override
    public final void emitirSom() {
        System.out.println("O pássaro " + this.getNome() + " está cantando.");
    }

    @Override
    public void informacoes() {
        super.informacoes();
        System.out.println("Cor das penas: " + this.corPena);
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }
}









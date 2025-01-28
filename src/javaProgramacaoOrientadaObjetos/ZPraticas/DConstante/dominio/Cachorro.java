package javaProgramacaoOrientadaObjetos.ZPraticas.DConstante.dominio;

public class Cachorro extends Animal{
    private String corPelo;
    public Cachorro(String nome, int idade, String corPelo) {
        super(nome, idade);
        this.corPelo = corPelo;
    }

    public final void correr(){
        System.out.println("O cachorro " + this.getNome() + " esta correndo.");
    }

    @Override
    public final void emitirSom() {
        System.out.println("O cachorro " + this.getNome() + " está latindo.");
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

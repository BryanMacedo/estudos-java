package Praticas.Dconstante.dominio;

public class Persa extends Gato{
    private String LocalNascenca;

    public Persa(String nome, int idade, String corPelo, String localNascenca) {
        super(nome, idade, corPelo);
        this.LocalNascenca = localNascenca;
    }

    @Override
    public void informacoes() {
        super.informacoes();
        System.out.println("Local de nascença: " + this.LocalNascenca);
    }
}

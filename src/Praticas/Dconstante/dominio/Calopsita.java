package Praticas.Dconstante.dominio;

public class Calopsita extends Passaro{
    private String LocalNascenca;

    public Calopsita(String nome, int idade, String corPena, String localNascenca) {
        super(nome, idade, corPena);
        this.LocalNascenca = localNascenca;
    }

    @Override
    public void informacoes() {
        super.informacoes();
        System.out.println("Local de nascença: " + this.LocalNascenca);
    }
}

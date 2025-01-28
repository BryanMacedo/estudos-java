package javaProgramacaoOrientadaObjetos.ZPraticas.DConstante.dominio;

public class Pastor_alemao extends Cachorro{
    private String LocalNascenca;

    public Pastor_alemao(String nome, int idade, String corPelo, String localNascenca) {
        super(nome, idade, corPelo);
        this.LocalNascenca = localNascenca;
    }

    @Override
    public void informacoes() {
        super.informacoes();
        System.out.println("Local de nascença: " + this.LocalNascenca);
    }
}

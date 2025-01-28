package javaProgramacaoOrientadaObjetos.ZPraticas.Hpolimorfismo.dominio;

public class Carro extends Veiculo{
    public Carro() {
        super("Carro");
    }

    @Override
    public int getVelocidadeMaxima() {
        return 180;
    }
}

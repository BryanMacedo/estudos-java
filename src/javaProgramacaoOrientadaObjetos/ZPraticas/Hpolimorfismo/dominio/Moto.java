package javaProgramacaoOrientadaObjetos.ZPraticas.Hpolimorfismo.dominio;

public class Moto extends Veiculo{
    public Moto() {
        super("Moto");
    }

    @Override
    public int getVelocidadeMaxima() {
        return 220;
    }
}

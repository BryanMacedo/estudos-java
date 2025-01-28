package javaProgramacaoOrientadaObjetos.ZPraticas.Hpolimorfismo.dominio;

public class Caminhao extends Veiculo{
    public Caminhao() {
        super("Caminhão");
    }

    @Override
    public int getVelocidadeMaxima() {
        return 100;
    }
}

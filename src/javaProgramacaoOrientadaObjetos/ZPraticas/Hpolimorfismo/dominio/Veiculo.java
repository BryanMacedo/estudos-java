package javaProgramacaoOrientadaObjetos.ZPraticas.Hpolimorfismo.dominio;

public abstract class Veiculo {
    protected String tipo;

    public Veiculo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }

    public abstract int getVelocidadeMaxima();
}

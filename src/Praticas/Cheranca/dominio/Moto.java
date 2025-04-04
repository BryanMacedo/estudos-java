package Praticas.Cheranca.dominio;

public class Moto extends Veiculo{
    private int cilindrada;

    public Moto(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("--Cilindrada: " + this.cilindrada);
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}

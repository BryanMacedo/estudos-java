package javaProgramacaoOrientadaObjetos.ZPraticas.Cheranca.dominio;

public class Veiculo {
    private String marca;
    private String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        if (ano < 1900) {
            throw new IllegalArgumentException("Proibido o cadastro de carros lançados antes de 1900");
            // refazer quando aprender a tratar exceções
        }
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;


    }

    public void exibirInformacoes() {
        System.out.println("----------------------------");
        System.out.println("--- Exibindo informações ---");
        System.out.println("--Marca: " + this.marca);
        System.out.println("--Modelo: " + this.modelo);
        System.out.println("--Ano: " + this.ano);

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}

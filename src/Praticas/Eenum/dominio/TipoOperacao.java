package Praticas.Eenum.dominio;

public enum TipoOperacao {
    ADICAO("+"),
    SUBTRACAO("-"),
    MULTIPLICACAO("x"),
    DIVISAO("%");

    private String simbolo;

    TipoOperacao(String simbolo) {
        this.simbolo = simbolo;
    }

    public String getSimbolo() {
        return simbolo;
    }
}

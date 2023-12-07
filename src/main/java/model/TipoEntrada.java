package model;

public enum TipoEntrada {
    VIP("Vip"),
    ESTANDAR("Estandar"),
    GENERAL("General");

    private String tipoEntrada;

    private TipoEntrada(String tipoEntrada){
        this.tipoEntrada = tipoEntrada;
    }

public String getTipoEntrada() {
    return tipoEntrada;
}
}

public enum Categoria {
    ACAO(0.2),
    ESPORTE(0.3),
    ESTRATEGIA(0.4),
    SIMULACAO(0.5),
    RPG(0.7);

    private Categoria(Double perc) {
        percentual = perc;
    }

    private final Double percentual;

    public Double getPercentual() {
        return percentual;
    }
}

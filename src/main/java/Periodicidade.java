public enum Periodicidade {

    SEMANAL(7),
    QUINZENAL(15),
    MENSAL(30);

    private final int qtdDias;

    Periodicidade(int qtdDias) {
        this.qtdDias = qtdDias;
    }

    public int getQtdDias() {
        return this.qtdDias;
    }
}

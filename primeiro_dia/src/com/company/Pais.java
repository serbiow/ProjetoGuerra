package com.company;

public class Pais {
    private String nome;
    private int qtdSoldados;
    private boolean armaNuclear;
    private double territorio;
    private double economia;
    private double credibilidade;
    private EstrategiaBelliStrategieStrategy estrategia;

    //Construtor


    public Pais(String nome, int qtdSoldados, boolean armaNuclear, double territorio, double economia, double credibilidade) {
        this.nome = nome;
        this.qtdSoldados = qtdSoldados;
        this.armaNuclear = armaNuclear;
        this.territorio = territorio;
        this.economia = economia;
        this.credibilidade = credibilidade;
    }

    //Gets
    public String getNome() {
        return nome;
    }

    public int getQtdSoldados() {
        return qtdSoldados;
    }

    public boolean getArmaNuclear() {
        return armaNuclear;
    }

    public double getTerritorio() {
        return territorio;
    }

    public double getEconomia() {
        return economia;
    }

    public double getCredibilidade() {
        return credibilidade;
    }

    public EstrategiaBelliStrategieStrategy getEstrategia() {
        return estrategia;
    }

    //Sets
    public void setEstrategia(EstrategiaBelliStrategieStrategy estrategia) {
        this.estrategia = estrategia;
    }

    //Metodos
    public void declararGuerra(Pais inimigo){
        this.estrategia.atacar(inimigo);
        this.estrategia.concluir(inimigo);
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nome='" + nome + '\'' +
                ", qtdSoldados=" + qtdSoldados +
                ", armaNuclear=" + armaNuclear +
                ", territorio=" + territorio +
                ", economia=" + economia +
                ", credibilidade=" + credibilidade +
                '}';
    }
}

package com.company;

public class AliancaVizinho implements EstrategiaBelliStrategieStrategy{
    @Override
    public void atacar(Pais inimigo) {
        System.out.println("\nVizinho ataca pelo Norte e nós atacamos pelo Sul");
    }

    @Override
    public void concluir(Pais inimigo) {
        System.out.println("\nDividir os espólios");
    }
}

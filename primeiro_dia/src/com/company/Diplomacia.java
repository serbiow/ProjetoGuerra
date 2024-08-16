package com.company;

public class Diplomacia implements EstrategiaBelliStrategieStrategy{
    @Override
    public void atacar(Pais inimigo) {
        System.out.println("\nRecuar tropas \nPropor cooperação econômica");
    }

    @Override
    public void concluir(Pais inimigo) {
        System.out.println("\nPropor desarmamento");
    }
}

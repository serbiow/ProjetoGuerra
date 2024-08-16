package com.company;

public class AtacarSozinho implements EstrategiaBelliStrategieStrategy{
    @Override
    public void atacar(Pais inimigo) {
        System.out.println("\nPlantar evidências falsas \nSoltar bombas \nDerrubar governo");
    }

    @Override
    public void concluir(Pais inimigo) {
        System.out.println("\nEstabelecer governo amigo");
    }
}

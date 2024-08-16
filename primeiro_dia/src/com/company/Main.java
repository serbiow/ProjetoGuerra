package com.company;

public class Main {

    public static void main(String[] args) {
        /*if(pais1.getArmaNuclear() == true && pais2.getArmaNuclear() == true) {
            pais1.setEstrategia(new Diplomacia());
            pais1.declararGuerra(pais2);
        }
        else if (pais1.getQtdSoldados() > pais2.getQtdSoldados()){
            //setar estratégia
            pais1.setEstrategia(new AtacarSozinho());
            pais1.declararGuerra(pais2);
        }
        else{
            pais1.setEstrategia(new Diplomacia());
            pais1.declararGuerra(pais2);
        }*/

        DefinirPaises definirPaises = new DefinirPaises();

        definirPaises.setarPaisesGuerra();

    }
}

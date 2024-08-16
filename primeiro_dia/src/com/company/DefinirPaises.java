package com.company;

import java.util.ArrayList;
import java.util.Random;

public class DefinirPaises {

    public DefinirPaises() {
    }

    public void setarPaisesGuerra(){
        ArrayList<Pais> paises = new ArrayList<Pais>();

        paises.add(new Pais("Russia", 200000, true, 17098242, 1685000, 85));
        paises.add(new Pais("Estados Unidos", 150000, true, 9372610, 22675000, 90));
        paises.add(new Pais("China", 120000, true, 9596961, 17400000, 80));
        paises.add(new Pais("India", 120000, false, 3287263, 3050000, 75));
        paises.add(new Pais("Brasil", 30000, false, 8515767, 1880000, 70));
        paises.add(new Pais("Alemanha", 25000, false, 357022, 4200000, 85));
        paises.add(new Pais("Franca", 35000, true, 551695, 3100000, 80));
        paises.add(new Pais("Reino Unido", 20000, true, 243610, 3200000, 78));
        paises.add(new Pais("Japao", 10000, false, 377975, 5500000, 82));
        paises.add(new Pais("Coreia do Sul", 6000, false, 100032, 1800000, 76));

        randomPaises(paises);
    }



    public ArrayList<Pais> randomPaises(ArrayList<Pais> paises){

        Random random = new Random();

        int index1 = random.nextInt(paises.size());
        int index2;

        // Assegura que o segundo índice é diferente do primeiro
        do {
            index2 = random.nextInt(paises.size());
        } while (index1 == index2);

        Pais pais1 = paises.get(index1);
        Pais pais2 = paises.get(index2);

        ArrayList<Pais> paisesGuerra = new ArrayList<Pais>();

        paisesGuerra.add(pais1);
        paisesGuerra.add(pais2);
        System.out.println(paisesGuerra);
        return paisesGuerra;
    }
}

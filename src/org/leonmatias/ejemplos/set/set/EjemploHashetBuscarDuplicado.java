package org.leonmatias.ejemplos.set.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashetBuscarDuplicado {
    public static void main(String[] args) {

        String[] peces = {"corvina","Lenguado","Pejerrey","Robalo","Atun","Lenguado"};

        Set<String> unicos = new HashSet<>();
        for(String pez:peces){
            if (!unicos.add(pez)){
                System.out.println("Elemento Duplicado:" + pez);
            }
        }

        System.out.println(unicos.size() + "elementos no duplicados:" + unicos);

    }
}

package com.company;

import com.company.domain.BekaHouseBuilder;
import com.company.domain.House;
import com.company.interfaces.HouseBuilder;

public class Main {

    public static void main(String[] args) {
        HouseBuilder bekaHouseBuilder=new BekaHouseBuilder();
        Engineer engineer=new Engineer(bekaHouseBuilder);

        engineer.constructHouse();

        House house=engineer.getHouse();
        System.out.println("Builder constructed "+ house);
    }
}

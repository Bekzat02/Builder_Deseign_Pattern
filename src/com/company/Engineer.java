package com.company;

import com.company.domain.House;
import com.company.interfaces.HouseBuilder;

public class Engineer {

    private HouseBuilder houseBuilder;

    public Engineer(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House getHouse() {
        return this.houseBuilder.getHouse();
    }

    public void constructHouse(){
        this.houseBuilder.buildBasement();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        this.houseBuilder.buildInterior();
    }
}

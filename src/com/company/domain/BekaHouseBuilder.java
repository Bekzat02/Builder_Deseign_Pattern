package com.company.domain;

import com.company.interfaces.HouseBuilder;

public class BekaHouseBuilder implements HouseBuilder {
    private House house;

    public BekaHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement("Ice bars");
    }

    @Override
    public void buildStructure() {
        house.setStructure("Ice blocks");
    }

    @Override
    public void buildRoof() {
        house.setRoof("Ice Dome");
    }

    @Override
    public void buildInterior() {
        house.setInterior("Ice Carvings");
    }

    public House getHouse(){
        return this.house;
    }
}

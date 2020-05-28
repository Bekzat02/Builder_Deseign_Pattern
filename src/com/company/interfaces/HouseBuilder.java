package com.company.interfaces;

import com.company.domain.House;

public interface HouseBuilder {
    public void buildBasement();

    public void buildStructure();

    public void buildRoof();

    public void buildInterior();

    public House getHouse();
}

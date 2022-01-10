package com.busrayalcin.pearlsofistanbul;

import java.io.Serializable;

public class Landmark implements Serializable {

    String name ;
    int image ;

    // Constructor

    public Landmark(String name, int image) {
        this.name = name;
        this.image = image;
    }
}

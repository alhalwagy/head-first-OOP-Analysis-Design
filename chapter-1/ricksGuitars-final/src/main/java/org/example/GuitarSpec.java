package org.example;

public class GuitarSpec {

    private Builder builder;
    private String model;
    private Type type;
    private Wood backWood;
    private Wood topWood;
    private int numStrings;

    public GuitarSpec(Builder builder, String model, Type type, int numStrings,Wood backWood, Wood topWood) {
        this.builder = builder;
        this.model = model;
        this.type = type;
        this.backWood = backWood;
        this.topWood = topWood;
        this.numStrings=numStrings;
    }

    public Builder getBuilder() {
        return builder;
    }

    public String getModel() {
        return model;
    }

    public Type getType() {
        return type;
    }

    public Wood getBackWood() {
        return backWood;
    }

    public Wood getTopWood() {
        return topWood;
    }

    public int getNumStrings() {
        return numStrings;
    }

    public boolean matches(GuitarSpec searchGuitar) {

        if (builder != searchGuitar.builder)
            return false;
        if ((model != null) && (!model.equals("")) &&
                (!model.toLowerCase().equals(searchGuitar.model.toLowerCase())))
            return false;
        if (type != searchGuitar.type)
            return false;
        if (numStrings != searchGuitar.numStrings)
            return false;
        if (backWood != searchGuitar.backWood)
            return false;
        if (topWood != searchGuitar.topWood)
            return false;
        return true;
    }
}

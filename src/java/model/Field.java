package model;

public class Field {
    private GameObject terrain;
    private Object occupant;

    public Field(){}

    public GameObject getTerrain() {
        return terrain;
    }

    public void setTerrain(GameObject terrain) {
        this.terrain = terrain;
    }

    public Object getOccupant() {
        return occupant;
    }

    public void setOccupant(Object occupant) {
        this.occupant = occupant;
    }
}

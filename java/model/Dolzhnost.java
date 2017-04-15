
package model;


public class Dolzhnost {

    Integer id;
    String name;
    Float oklad;
    String obyazannost;
    String obrazovanie;
    String trebovaniya;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getOklad() {
        return oklad;
    }

    public void setOklad(Float oklad) {
        this.oklad = oklad;
    }

    public String getObyazannost() {
        return obyazannost;
    }

    public void setObyazannost(String obyazannost) {
        this.obyazannost = obyazannost;
    }
    
     public String getObrazovanie() {
        return obrazovanie;
    }

    public void setObrazovanie(String obyazannost) {
        this.obrazovanie = obrazovanie;
    }

    public String getTrebovaniya() {
        return trebovaniya;
    }

    public void setTrebovaniya(String trebovaniya) {
        this.trebovaniya = trebovaniya;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
    
}

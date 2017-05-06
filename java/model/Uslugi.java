
package model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;


public class Uslugi {

    Integer id;
    String name;
    String opisanie;
    Float stoimost;
    
    private PropertyChangeSupport support;
    public Uslugi() {
        support = new PropertyChangeSupport(this);
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer old = this.id;
        this.id = id;
        support.firePropertyChange("id", old, id);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        String old = this.name;
        support.firePropertyChange("name", old, name);
        this.name = name;
    }

    public String getOpisanie() {
        return opisanie;
    }

    public void setOpisanie(String opisanie) {
        String old = this.opisanie;
        support.firePropertyChange("opisanie", old, opisanie);
        this.opisanie = opisanie;
    }

    public Float getStoimost() {
        return stoimost;
    }

    public void setStoimost(Float stoimost) {
        Float old = this.stoimost;
        support.firePropertyChange("stoimost", old, stoimost);
        this.stoimost = stoimost;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
    
    public void addPropertyChangeListener (PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }
    public void removePropertyChangeListener (PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }
    
}

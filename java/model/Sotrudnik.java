
package model;

import java.util.Date;

public class Sotrudnik {

    Integer id;
    String fio;
    Date rozdenie;
    Integer pol;
    String addres;
    String telephone;
    Pasport pasport;
    Dolzhnost dolznost;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Date getRozdenie() {
        return rozdenie;
    }

    public void setRozdenie(Date rozdenie) {
        this.rozdenie = rozdenie;
    }

    public Integer getPol() {
        return pol;
    }

    public void setPol(Integer pol) {
        this.pol = pol;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Pasport getPasport() {
        return pasport;
    }

    public void setPasport(Pasport pasport) {
        this.pasport = pasport;
    }

    public Dolzhnost getDolznost() {
        return dolznost;
    }

    public void setDolznost(Dolzhnost dolznost) {
        this.dolznost = dolznost;
    }
    @Override
    public String toString() {
        return id + " " + fio;
    }
}

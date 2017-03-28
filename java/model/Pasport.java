
package model;

import java.util.Date;


public class Pasport {

    private Integer seria;
    private Integer nomber;
    private Date vadacha;
    private String podrazdelenie;
    
    public Integer getSeria() {
        return seria;
    }

    public void setSeria(Integer seria) {
        this.seria = seria;
    }

    public Integer getNamber() {
        return nomber;
    }

    public void setNamber(Integer namber) {
        this.nomber = namber;
    }

    public Date getVadacha() {
        return vadacha;
    }

    public void setVadacha(Date vadacha) {
        this.vadacha = vadacha;
    }

    public String getPodrazdelenie() {
        return podrazdelenie;
    }

    public void setPodrazdelenie(String podrazdelenie) {
        this.podrazdelenie = podrazdelenie;
    }
     @Override
    public String toString() {
        return  seria + " " + nomber;
    }
}

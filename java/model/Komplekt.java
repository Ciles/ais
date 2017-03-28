
package model;

import java.util.Date;


public class Komplekt {

  
    Integer id;
    Integer id_vid;
    String marka;
    String firma_proiz;
    String strana_proiz;
    Date vipusk;
    String harki;
    String srok;
    String opisanie;
    Float cena;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId_vid() {
        return id_vid;
    }

    public void setId_vid(Integer id_vid) {
        this.id_vid = id_vid;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getFirma_proiz() {
        return firma_proiz;
    }

    public void setFirma_proiz(String firma_proiz) {
        this.firma_proiz = firma_proiz;
    }

    public String getStrana_proiz() {
        return strana_proiz;
    }

    public void setStrana_proiz(String strana_proiz) {
        this.strana_proiz = strana_proiz;
    }

    public Date getVipusk() {
        return vipusk;
    }

    public void setVipusk(Date vipusk) {
        this.vipusk = vipusk;
    }

    public String getHarki() {
        return harki;
    }

    public void setHarki(String harki) {
        this.harki = harki;
    }

    public String getSrok() {
        return srok;
    }

    public void setSrok(String srok) {
        this.srok = srok;
    }

    public String getOpisanie() {
        return opisanie;
    }

    public void setOpisanie(String opisanie) {
        this.opisanie = opisanie;
    }

    public Float getCena() {
        return cena;
    }

    public void setCena(Float cena) {
        this.cena = cena;
    }
      @Override
    public String toString() {
        return id + " " + id_vid;
    }
  
}

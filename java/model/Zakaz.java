
package model;

import java.util.Date;


public class Zakaz {

    Date data;
    Date data_isp;
    Zakazchik zakazchik;
    Komplekt komp1;
    Komplekt komp2;
    Komplekt komp3;
    Float predoplata;
    String opmetka_oplata;
    String otmetka_ispoln;
    Float ob_stoim;
    String srok_ob_garan;
    Uslugi usl1;
    Uslugi usl2;
    Uslugi usl3;
    Sotrudnik sotrudnik;
    
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getData_isp() {
        return data_isp;
    }

    public void setData_isp(Date data_isp) {
        this.data_isp = data_isp;
    }

    public Zakazchik getZakazchik() {
        return zakazchik;
    }

    public void setZakazchik(Zakazchik zakazchik) {
        this.zakazchik = zakazchik;
    }

    public Komplekt getKomp1() {
        return komp1;
    }

    public void setKomp1(Komplekt komp1) {
        this.komp1 = komp1;
    }

    public Komplekt getKomp2() {
        return komp2;
    }

    public void setKomp2(Komplekt komp2) {
        this.komp2 = komp2;
    }

    public Komplekt getKomp3() {
        return komp3;
    }

    public void setKomp3(Komplekt komp3) {
        this.komp3 = komp3;
    }

    public Float getPredoplata() {
        return predoplata;
    }

    public void setPredoplata(Float predoplata) {
        this.predoplata = predoplata;
    }

    public String getOpmetka_oplata() {
        return opmetka_oplata;
    }

    public void setOpmetka_oplata(String opmetka_oplata) {
        this.opmetka_oplata = opmetka_oplata;
    }

    public String getOtmetka_ispoln() {
        return otmetka_ispoln;
    }

    public void setOtmetka_ispoln(String otmetka_ispoln) {
        this.otmetka_ispoln = otmetka_ispoln;
    }

    public Float getOb_stoim() {
        return ob_stoim;
    }

    public void setOb_stoim(Float ob_stoim) {
        this.ob_stoim = ob_stoim;
    }

    public String getSrok_ob_garan() {
        return srok_ob_garan;
    }

    public void setSrok_ob_garan(String srok_ob_garan) {
        this.srok_ob_garan = srok_ob_garan;
    }

    public Uslugi getUsl1() {
        return usl1;
    }

    public void setUsl1(Uslugi usl1) {
        this.usl1 = usl1;
    }

    public Uslugi getUsl2() {
        return usl2;
    }

    public void setUsl2(Uslugi usl2) {
        this.usl2 = usl2;
    }

    public Uslugi getUsl3() {
        return usl3;
    }

    public void setUsl3(Uslugi usl3) {
        this.usl3 = usl3;
    }

    public Sotrudnik getSotrudnik() {
        return sotrudnik;
    }

    public void setSotrudnik(Sotrudnik sotrudnik) {
        this.sotrudnik = sotrudnik;
    }

    @Override
    public String toString() {
        return  data + " " + zakazchik + " " + ob_stoim;
    }
    
}

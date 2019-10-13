package Negyedik;

import java.util.Date;
import java.util.Objects;

/**
 *
 * @author Anastasia
 */
public class Auto {
    private String rendszam;
    private int motorTeljesitmeny;
    private Date gyartasDatuma;

    public Auto(String rendszam, int motorTeljesitmeny) {
        this.rendszam = rendszam;
        this.motorTeljesitmeny = motorTeljesitmeny;
        this.gyartasDatuma = new Date();
    }

    public String getRendszam() {
        return rendszam;
    }

    public int getMotorTeljesitmeny() {
        return motorTeljesitmeny;
    }

    public Date getGyartasDatuma() {
        return gyartasDatuma;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    @Override
    public String toString() {
        return "Auto: " + "rendszam = " + rendszam + ", motorTeljesitmeny = " + motorTeljesitmeny;
    }

    @Override
    public boolean equals(Object o) {
       
        if(o == null || !(o instanceof Auto))
            return false;
        Auto a = (Auto)o;
        return ((a.getRendszam().equals(this.rendszam)) && (a.motorTeljesitmeny == this.motorTeljesitmeny));
    }

    
    
}

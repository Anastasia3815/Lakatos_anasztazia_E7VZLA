package Negyedik;

import java.util.Date;

/**
 *
 * @author Anastasia
 */
public class Teherauto extends Auto{
     private int maxSzallithatoTeher;

    public Teherauto(String rendszam, int motorTeljesitmeny, int maxSzallithatoTeher) {
        super(rendszam, motorTeljesitmeny);
        this.maxSzallithatoTeher = maxSzallithatoTeher;
    }

     public int getMaxSzallithatoTeher() {
        return maxSzallithatoTeher;
    }

    @Override
    public String toString() {
        return super.toString() + ", Teherauto " + "max szallithato teher: " + maxSzallithatoTeher;
    }

    @Override
    public boolean equals(Object o) {
        if(o == null || !(o instanceof Teherauto))
            return false;    
        Teherauto t = (Teherauto)o;        
        return (t.maxSzallithatoTeher == this.maxSzallithatoTeher);
    }
}

package Elso;

/**
 *
 * @author Anastasia
 */

public class Nyilas extends Katona{
      private int shootingDistance;

    public Nyilas(int shootingDistance) {
        this.shootingDistance = shootingDistance;
    }
    
    public Nyilas(int shootingDistance, int attackPower, int defensePower) {
        super(attackPower, defensePower);
        this.shootingDistance = shootingDistance;
    }
    
    public int getShootingDistance() {
        return shootingDistance;
    }

    public void setShootingDistance(int shootingDistance) {
        this.shootingDistance = shootingDistance;
    }

    @Override
    public int getAttackPower() {
        return super.getAttackPower() + this.shootingDistance;
    }
    
    @Override
    public String toString() {
        return "Nyilas: TE: " + Nyilas.this.getAttackPower() + ", VE: " + Nyilas.this.getDefensePower();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Nyilas))
            return false;
        
        Nyilas ny = (Nyilas) obj;
        
        return ((ny.getAttackPower() == this.getAttackPower()) && (ny.getDefensePower() == this.getDefensePower()) && (ny.getShootingDistance() == this.shootingDistance));
    }       
}

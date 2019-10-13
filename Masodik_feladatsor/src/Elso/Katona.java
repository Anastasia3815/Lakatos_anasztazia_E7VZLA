package Elso;

/**
 *
 * @author Anastasia
 */
public class Katona {
    private int attackPower;
    private int defensePower;

    public Katona() {
        this.attackPower = 5;
        this.defensePower = 5;
    }

    public Katona(int attackPower, int defensePower) {
        this.attackPower = attackPower;
        this.defensePower = defensePower;
    }
    
    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public int getDefensePower() {
        return defensePower;
    }

    public void setDefensePower(int defensePower) {
        this.defensePower = defensePower;
    }

    @Override
    public String toString() {
        return "TE: " + attackPower + ", VE: " + defensePower;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Katona))
            return false;
        
        Katona k = (Katona) obj;
        
        return (k.getAttackPower() == attackPower) && (k.getDefensePower() == defensePower);
    }
}

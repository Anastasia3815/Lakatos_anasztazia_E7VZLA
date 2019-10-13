package Elso;

/**
 *
 * @author Anastasia
 */
public class Landzsas extends Katona{
     public Landzsas() {
    }

    public Landzsas(int attackPower, int defensePower) {
        super(attackPower, defensePower);
    }

    @Override
    public String toString() {
        return "Lándzsás: TE: " + Landzsas.this.getAttackPower() + ", VE: " + Landzsas.this.getDefensePower();
    }
}

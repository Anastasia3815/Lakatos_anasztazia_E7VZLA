package Negyedik;

/**
 *
 * @author Anastasia
 */
public class Test {
    public static void rendezMaxSzallithatoTeherCsokkenoleg(Teherauto[] teher) {
        for (int i = 0; i < teher.length-1; i++) {
            for (int j = i+1; j < teher.length; j++) {
                if(teher[i].getMaxSzallithatoTeher() < teher[j].getMaxSzallithatoTeher()) {
                    Teherauto tmp = teher[i];
                    teher[i] = teher[j];
                    teher[j] = tmp;
                }
            }
        }
    }
    
    public static Auto keresMaxMotorTeljesitmeny(Auto[] auto) {      
        int max = auto[0].getMotorTeljesitmeny();
        int seged = 0;
        for (int i = 0; i < auto.length; i++) {
            if(!(auto[i] instanceof Teherauto)) {
                if(auto[i].getMotorTeljesitmeny() >= max) {
                    max = auto[i].getMotorTeljesitmeny();
                    seged = i;
                }
            }
        }
        return auto[seged];
    }
    
    public static void main(String[] args) {
        Teherauto[] teherautok = new Teherauto[10];
        teherautok[0] = new Teherauto("FGR456", 23, 3000);
        teherautok[1] = new Teherauto("IER698", 45, 2000);
        teherautok[2] = new Teherauto("QWE123", 67, 1500);
        teherautok[3] = new Teherauto("ABC589", 89, 2500);
        teherautok[4] = new Teherauto("LKJ852", 543, 4300);
        teherautok[5] = new Teherauto("RFV412", 120, 6450);
        teherautok[6] = new Teherauto("IUZ325", 132, 1000);
        teherautok[7] = new Teherauto("DFG951", 67, 1300);
        teherautok[8] = new Teherauto("MJU159", 47, 5000);
        teherautok[9] = new Teherauto("CDE654", 200, 3450);

        Auto[] autok = new Auto[10];
        autok[0] = new Auto("JHG874", 43);
        autok[1] = new Auto("ASD698", 23);
        autok[2] = new Auto("QWE963", 65);
        autok[3] = new Auto("VDE568", 12);
        autok[4] = new Auto("LAO127", 98);
        autok[5] = new Teherauto("FGR456", 23, 3000);
        autok[6] = new Teherauto("IER698", 45, 2000);
        autok[7] = new Teherauto("QWE123", 67, 1500);
        autok[8] = new Teherauto("ABC589", 89, 2500);
        autok[9] = new Teherauto("LKJ852", 543, 4300);

        rendezMaxSzallithatoTeherCsokkenoleg(teherautok);

        for (int i = 0; i < teherautok.length; i++)
            System.out.println(teherautok[i].toString());

        System.out.println(keresMaxMotorTeljesitmeny(autok));
    }
}

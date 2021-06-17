
package poop5;

/**
 *
 * @author nikte
 */
public class Coche {
    private String [] lugares = {"NULL", "Chofer", "Copiloto", "Pasajero 1", "Pasajero 2"};
    private int lugp;
    public Coche() {
    }
    public Coche(int lugp) {
        this.lugp = lugp;
    }
    public int getLugp() {
        return lugp;
    }
    public void setLugp(int lugp) {
        this.lugp = lugp;
    }
   
    public String miLugp(){
        return lugares[this.lugp];
    }
    @Override
    public String toString() {
        return "Coche{" + "lugares=" + lugares + ", lugar=" + lugp + '}';
    }   
}

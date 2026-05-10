/*
 * Sara Sunny - Lab8 - Problem 2 (Main)
 */
package sunny_lab8_prob2;

/**
 *
 * @author slbru
 */
public class Sunny_Lab8_Prob2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        RegularPay reg = new RegularPay (12.50);
        HazardPay haz = new HazardPay (12.50);
        
        System.out.println("Regular Pay " + reg.computePay(45));
        System.out.println("Hazard Pay " + haz.computePay(45));
    }
    
}

/*
 * Sara Sunny
 */
package sunny_lab8_prob2;

/**
 *
 * @author slbru
 */
public class HazardPay extends PayCalculator{
    
    public HazardPay(double payRate){
        this.payRate = payRate;
    }
    
    @Override
    public double computePay(int hours){
        
        return (super.computePay(hours))*1.5;
    }
}

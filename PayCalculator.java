/*
 * Sara Sunny
 */
package sunny_lab8_prob2;

/**
 *
 * @author slbru
 */
public abstract class PayCalculator {
    double payRate;
    
    
    public void setPayRate (double payRate){
        this.payRate = payRate;
    }
    public double getPayRate (){
        return payRate;
    }
    
    public double computePay (int hours){
        
        return (hours*payRate);
    }
}

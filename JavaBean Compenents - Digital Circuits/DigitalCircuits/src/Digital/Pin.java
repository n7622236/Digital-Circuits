/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Digital;

/**
 *
 * @author Chou,Shu-Hung n7622236
 */
public class Pin extends UnaryGate{
    public Pin(){
        super("images/PIN.gif");
    }
   
    @Override
    protected boolean Compute(boolean PinInput){
        boolean PinCompute=PinInput;
        return PinCompute;
    }
}

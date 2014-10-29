/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Digital;

/**
 *
 * @author Chou,Shu-Hung n7622236
 */
public class NOTGate extends UnaryGate{
    public NOTGate(){
        super("images/NOT.gif");
    }
    
    @Override
    protected boolean Compute(boolean NOTInput){
        boolean NOTCompute=!NOTInput;
        return NOTCompute;
    }
}

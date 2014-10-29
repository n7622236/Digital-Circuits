/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Digital;

/**
 *
 * @author Chou,Shu-Hung n7622236
 */
public class ORGate extends BinaryGate{
    public ORGate(){
        super("images/OR.gif");
    }
    @Override
    public boolean Compute(boolean input0,boolean input1){
        return input0 || input1;
    }
}


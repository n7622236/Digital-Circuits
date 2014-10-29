/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Digital;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
/**
 *
 * @author Chou,Shu-Hung n7622236
 */
public class OutputTerminal implements Terminal{
    private boolean value=false;
    private PropertyChangeSupport mPcs= new PropertyChangeSupport(this);
    
    @Override
    public boolean getValue(){
        return this.value;
    }
    
    public void setValue(boolean newValue){
        boolean oldvalue=this.value;
        this.value=newValue;
        mPcs.firePropertyChange("Value", oldvalue, newValue);
    }

    @Override
    public void addPropertyChangeListener(PropertyChangeListener pl){
        mPcs.addPropertyChangeListener(pl);
    }
    
    @Override
    public void removePropertyChangeListener(PropertyChangeListener pl){
        mPcs.removePropertyChangeListener(pl);
    }
}

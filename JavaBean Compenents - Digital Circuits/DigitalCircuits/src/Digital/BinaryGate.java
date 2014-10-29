/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Digital;

import java.awt.Image;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.JPanel;
/**
 *
 * @author Chou,Shu-Hung n7622236
 */
public abstract class BinaryGate extends JPanel implements PropertyChangeListener {

    private Image image;
    protected Terminal Input0=new OutputTerminal();
    protected Terminal Input1=new OutputTerminal();
    private OutputTerminal output= new OutputTerminal();

    public BinaryGate(String imageURL){                       
        java.net.URL url = getClass().getResource(imageURL);
        this.image =  new javax.swing.ImageIcon(url).getImage();;
        this.setSize(image.getWidth(null), image.getHeight(null));
    }
    
    @Override
     protected void paintComponent(java.awt.Graphics graph){       
          graph.drawImage(image,0,0,null);
    }

    abstract boolean Compute(boolean input0,boolean input1);
    
    public Terminal getInput0() {
            return Input0;
    }

    public Terminal getInput1() {
            return Input1;
    }

    public OutputTerminal getOutput() {
            return output;
    }
    
    public void setInput0(Terminal Input0) {
        this.Input0 = Input0;
        if (Input0 != null) {   
            Input0.addPropertyChangeListener(this);
        }
        recompute();
    }

    public void setInput1(Terminal Input1) {
        this.Input1 = Input1;
        if (Input1 != null) {
            Input1.addPropertyChangeListener(this); 
        }
        recompute();
    }
    
    public void recompute(){
        boolean input0;
        boolean input1;
        boolean result;
        
        if(this.Input0 == null){
            input0=false;
            input1=this.Input1.getValue();
        }else if(this.Input1==null){
            input0=this.Input0.getValue();
            input1=false;
        }else{
            input0=this.Input0.getValue();
            input1=this.Input1.getValue();
        }
        result=this.Compute(input0,input1);
        this.output.setValue(result);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("Value".equals(evt.getPropertyName())) {
             recompute();
        }
    }    
}

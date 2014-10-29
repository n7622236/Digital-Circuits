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
public abstract class UnaryGate extends JPanel implements PropertyChangeListener {
    private Image image;
    protected Terminal Input=new OutputTerminal();
    private OutputTerminal output= new OutputTerminal();
    
    public UnaryGate(String imageURL){
        java.net.URL url = getClass().getResource(imageURL);
        this.image =  new javax.swing.ImageIcon(url).getImage();;
        this.setSize(image.getWidth(null), image.getHeight(null));
    }
    
    @Override
     protected void paintComponent(java.awt.Graphics graph){       
          graph.drawImage(image,0,0,null);
    }


    abstract boolean Compute(boolean input);
    
    public Terminal getInput0() {
        return Input;
    }

    public OutputTerminal getOutput() {
            return output;
    }
    
    public void setInput0(Terminal Input) {
        this.Input = Input;
        if (Input != null) {   
            Input.addPropertyChangeListener(this);
        }
        recompute();
    }
    
    public void recompute(){
        boolean input;
        boolean result;
        
        if(this.Input == null){
            input=false;
        }else{
            input=this.Input.getValue();
        }
        result=this.Compute(input);
        this.output.setValue(result);
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        if ("Value".equals(evt.getPropertyName())) {
             recompute();
        }
    }    
}

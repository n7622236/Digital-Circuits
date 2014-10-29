/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Digital;

import java.awt.Image;
import javax.swing.JPanel;

/**
 *
 * @author Chou,Shu-Hung n7622236
 */
public class BitAdderComponent extends JPanel{
    private BitAdderCircuit adder =new BitAdderCircuit();
    private final Image image;
    
    public BitAdderComponent(){
        java.net.URL url = getClass().getResource("images/Adder.gif");
        this.image =  new javax.swing.ImageIcon(url).getImage();;
        this.setSize(image.getWidth(null), image.getHeight(null));
    }
    
    @Override
     protected void paintComponent(java.awt.Graphics graph){       
          graph.drawImage(image,0,0,null);
    }
    
    public void setInput0(Terminal input){
        adder.getPin1().setInput0(input);
    }
    public void setInput1(Terminal input){
        adder.getPin2().setInput0(input);
    }
    public void setInput2(Terminal input){
        adder.getPin3().setInput0(input);
    }
    public Terminal getInput0(){
        return adder.getPin1().getInput0();
    }
    public Terminal getInput1(){
        return adder.getPin2().getInput0();
    }
    public Terminal getInput2(){
        return adder.getPin3().getInput0();
    }
    public Terminal getOutput0(){
        return adder.getPin4().getInput0();
    }
    public Terminal getOutput1(){
        return adder.getPin5().getInput0();
    }   
}

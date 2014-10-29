/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Digital;

import java.awt.Image;
/**
 *
 * @author Chou,Shu-Hung n7622236
 */
public class LED  extends javax.swing.JPanel{
    private Image ImageDisplay,ImageOn,ImageOff;
    private OutputTerminal input=new OutputTerminal();
    
    public LED(){
          this.ImageOff=this.imageLoador("images/LED_off.gif");
          this.ImageOn=this.imageLoador("images/LED_on.gif");
          this.ImageDisplay=ImageOff;
    }
    public Image imageLoador(String imageURL){
          java.net.URL url= getClass().getResource(imageURL);
          Image image= new javax.swing.ImageIcon(url).getImage();
          this.setSize(image.getWidth(null), image.getHeight(null));
          return image;
    }
    @Override
     public void paintComponent(java.awt.Graphics graph){
        this.repaint();
        super.paintComponent(graph);
        if(this.input.getValue()){
                ImageDisplay = ImageOn;
        }else {
                ImageDisplay = ImageOff;
            }
        graph.drawImage(this.ImageDisplay,0,0,null);
    }
    public Terminal getInput() {
        return input;
    }
    public void setInput(Terminal input) {
         this.input = (OutputTerminal)input;
         this.repaint();
    }
}

package view;



import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class ViewPanel extends JPanel{

	
	
	private static final long	serialVersionUID	= -998294702363713521L;
	
	
	
	
	 public void paintComponent(final Graphics graphics){
		    //Vous verrez cette phrase chaque fois que la méthode sera invoquée
		 graphics.setColor(Color.BLACK);
		 graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
		 try {
			afficherSprite(graphics);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  }

	 public void afficherSprite(final Graphics graphics) throws IOException  {
		 
		 Image tileimg = ImageIO.read(new File("C:/Users/Windows/git/Boulder_Dash/sprite/Rockford.png"));
			graphics.drawImage(tileimg, 0, 0, this);
	 }
	          
}

package view;

/**
 * <h1>The Classe ViewPanel.</h1>
 * 
 * @author Florian PFEIFER florian.pfeifer@viacesi.fr
 * @version 1.0
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import model.IModel;

public class ViewPanel extends JPanel{

	
	
	private static final long	serialVersionUID	= -998294702363713521L;
	
	BufferedImage imgHero;
    Timer timer;
    int i;
    Image subSpriteHero;

	
    
    int[][] spriteSheetCoords = { { 0, 0, 16, 16 }, { 16, 0, 16, 16 }, { 0, 0, 16, 16 }, {  16, 0, 16, 16 }};

    public ViewPanel() {
		
		/*this.spriteSheetCoords = */
		
       setBackground(Color.black);
        try
        {
            imgHero = ImageIO.read(new File("C://Users/victo/git/Boulder_Dash/sprite/Rockford.png"));
            timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    subSpriteHero = imgHero.getSubimage(spriteSheetCoords[i][0], spriteSheetCoords[i][1], spriteSheetCoords[i][2],
                    		spriteSheetCoords[i][3]);
                    i++;
                    if (i == spriteSheetCoords.length) {
                        i = 0;
                    }
                    
                   
                    repaint();
                    revalidate();
                }
            }, 350, 350);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(subSpriteHero, 0, 0, 32, 32, null);
      
    }
	          
}

package view;



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

public class ViewPanel extends JPanel{

	
	
	private static final long	serialVersionUID	= -998294702363713521L;
	
	BufferedImage imgHero;
    Timer timer;
    int i;
    Image subSpriteHero;
    
    int[][] spriteSheetCoordsWalkLeft = { { 16, 16, 16, 16 }, { 0, 16, 16, 16 }, { 16, 16, 16, 16 }, { 0, 16, 16, 16 }};

    public ViewPanel() {
        setBackground(Color.black);
        try
        {
            imgHero = ImageIO.read(new File("C:/Users/victo/OneDrive/Exia.Cesi/Projet JAVA/Sprites/Rockford.png"));
            timer = new Timer();
            timer.scheduleAtFixedRate(new TimerTask() {
                @Override
                public void run() {
                    subSpriteHero = imgHero.getSubimage(spriteSheetCoordsWalkLeft[i][0], spriteSheetCoordsWalkLeft[i][1], spriteSheetCoordsWalkLeft[i][2],
                    		spriteSheetCoordsWalkLeft[i][3]);
                    i++;
                    if (i == spriteSheetCoordsWalkLeft.length) {
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

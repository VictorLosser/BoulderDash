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
import java.util.Observable;
import java.util.Observer;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import model.IModel;

public class ViewPanel extends JPanel implements Observer{

	private ViewFrame					viewFrame;
	
	private static final long	serialVersionUID	= -998294702363713521L;
	char[][] tabmap ;
	BufferedImage imgHero;
    Timer timer;
    int i;
    Image subSpriteHero;

	
    
    //int[][] spriteSheetCoords = { { 0, 0, 16, 16 }, { 16, 0, 16, 16 }, { 0, 0, 16, 16 }, {  16, 0, 16, 16 }};

    public ViewPanel(final ViewFrame viewFrame) {
		this.setViewFrame(viewFrame);
		viewFrame.getModel().getObservable().addObserver(this);
	
		/*this.spriteSheetCoords = */
		
       //setBackground(Color.black);
        /*try
        {
            imgHero = ImageIO.read(new File("C:/Users/Windows/git/BoulderDash/sprite/Rockford.png"));
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
        }*/
        
    }

    
    private ViewFrame getViewFrame() {
		return this.viewFrame;
	}
    
    private void setViewFrame(final ViewFrame viewFrame) {
		this.viewFrame = viewFrame;
	}
    
    
    @Override
    public void paintComponent(Graphics graphics) {
    	graphics.clearRect(0, 0, this.getWidth(), this.getHeight());
		graphics.setColor(Color.BLACK);
		graphics.fillRect(0, 0, this.getWidth(), this.getHeight());
        //super.paintComponent(graphics);
        //graphics.drawImage(subSpriteHero, 0, 0, 32, 32, null);
        
        afficherMap(graphics);
      
    }

	@Override
	public void update(Observable o, Object arg) {
		this.viewFrame.getModel().doTheThing();
		this.repaint();
		
		
	}
	
public void afficherMap(final Graphics graphics) {
		
		this.tabmap = this.viewFrame.getModel().getTabmap2d();

		for(int i =0; i<this.tabmap.length; i++)
		{
			for (int j =0; j<this.tabmap[i].length;j++)
			{
				switch (this.tabmap[i][j]) {
					case '0':try {
						System.out.print(tabmap[i][j]);
						BufferedImage img = ImageIO.read(new File("/textures/Enemies.png"));
						Image subimg = img.getSubimage(16, 16, 16, 16);
						graphics.drawImage(subimg, 32*j, 32*i, this);
					} catch(IOException e) {
						e.printStackTrace();
					}
						break;
					case '*':try {
						System.out.print(tabmap[i][j]);
						BufferedImage img = ImageIO.read(new File("/textures/Enemies.png"));
						Image subimg = img.getSubimage(16, 16, 16, 16);
						graphics.drawImage(subimg, 32*j, 32*i, this);
					} catch(IOException e) {
						e.printStackTrace();
					}
						break;

					case '-':try {
						System.out.print(tabmap[i][j]);
						BufferedImage img = ImageIO.read(new File("/textures/Enemies.png"));
						Image subimg = img.getSubimage(16, 16, 16, 16);
						graphics.drawImage(subimg, 32*j, 32*i, this);
					} catch(IOException e) {
						e.printStackTrace();
					}
						break;

					case 'B':try {
						System.out.print(tabmap[i][j]);
						BufferedImage img = ImageIO.read(new File("/textures/Enemies.png"));
						Image subimg = img.getSubimage(16, 16, 16, 16);
						graphics.drawImage(subimg, 32*j, 32*i, this);
					} catch(IOException e) {
						e.printStackTrace();
					}
						break;

					case 'i':try {
						System.out.print(tabmap[i][j]);
						BufferedImage img = ImageIO.read(new File("/textures/Enemies.png"));
						Image subimg = img.getSubimage(16, 16, 16, 16);
						graphics.drawImage(subimg, 32*j, 32*i, this);
					} catch(IOException e) {
						e.printStackTrace();
					}
						break;


					case ' ':try {
						System.out.print(tabmap[i][j]);
						BufferedImage img = ImageIO.read(new File("/textures/Enemies.png"));
						Image subimg = img.getSubimage(16, 16, 16, 16);
						graphics.drawImage(subimg, 32*j, 32*i, this);
					} catch(IOException e) {
						e.printStackTrace();
					}
						break;

					case 'F':try {
						System.out.print(tabmap[i][j]);
						BufferedImage img = ImageIO.read(new File("/textures/Enemies.png"));
						Image subimg = img.getSubimage(16, 16, 16, 16);
						graphics.drawImage(subimg, 32*j, 32*i, this);
					} catch(IOException e) {
						e.printStackTrace();
					}
						break;

					case 'S':try {
						System.out.print(tabmap[i][j]);
						BufferedImage img = ImageIO.read(new File("/textures/Enemies.png"));
						Image subimg = img.getSubimage(16, 16, 16, 16);
						graphics.drawImage(subimg, 32*j, 32*i, this);
					} catch(IOException e) {
						e.printStackTrace();
					}
						break;

					case 'E':try {
						System.out.print(tabmap[i][j]);
						BufferedImage img = ImageIO.read(new File("/textures/Enemies.png"));
						Image subimg = img.getSubimage(16, 16, 16, 16);
						graphics.drawImage(subimg, 32*j, 32*i, this);
					} catch(IOException e) {
						e.printStackTrace();
					}
						break;


					case 'H':try {
						System.out.print(tabmap[i][j]);
						BufferedImage img = ImageIO.read(new File("/textures/Rockford.png"));
						Image subimg = img.getSubimage(16, 16, 16, 16);
						graphics.drawImage(subimg, 32*j, 32*i, this);
					} catch(IOException e) {
						e.printStackTrace();
					}
						break;
						
						
				}
				
			}
			System.out.println();
		}
	}        
}

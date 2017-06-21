package view;


import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;

import view.Assets;



public class ArrayToGraf {
	 
   Image image;
   //ignore this part
  // Sprite sprite = new Sprite("terrainSheet.png", 1, 15, false);
   int x,y,temp=0;
   //nothing here yet
  /* public ArrayToGraf(){
   }*/
   //This function will return an BufferedImage with all the tiles drawn on it
   public BufferedImage getMap(int[][] map){
      BufferedImage bufferedImage = new BufferedImage(map.length*4, (map[0].length)*15, BufferedImage.TYPE_INT_BGR);
      Graphics2D g2d = bufferedImage.createGraphics();
      g2d.setColor(Color.green);
      g2d.fillRect(0, 0, map.length*4, (map[0].length)*15);
      
      for(int heigth = 0; heigth<map[0].length; heigth++){
    	  for(int length = 0; length<map.length; length++)
              switch(map[length][heigth]){
              	case 0:
              			g2d.drawImage(Assets.none, length*16, heigth*16, null);
                                break;
              	case 1:
              			g2d.drawImage(Assets.wall, length*16, heigth*16, null);
              					break;
              	case 2:
              			g2d.drawImage(Assets.ground, length*16, heigth*16, null);
              					break;
}
      }
      g2d.finalize();
      g2d.dispose();
      return bufferedImage;
   }
}
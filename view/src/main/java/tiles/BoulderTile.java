package tiles;

import graphics.Assets;

public class BoulderTile extends Tile{
	
	//Constructor of the class 
	public BoulderTile(int id) {
		super(Assets.boulder, id);
	}

	@Override
	public boolean isSolid(){
		return true;
	}
}

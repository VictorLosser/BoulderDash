package tiles;

import graphics.Assets;

public class WallTile extends Tile{
	//Constructor of the class
	public WallTile(int id) {
		super(Assets.wall, id);
	}

	@Override
	public boolean isSolid(){
		return true;
	}
	
}

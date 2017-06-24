package entities;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Comparator;

import view.Handler;

public class EntityManager {
	
	private Handler handler;
	private Player player;
	private ArrayList<Entity> creature;
	private ArrayList<Entity> entities;
	private ArrayList<Entity> rocks;
	
	private Comparator<Entity> sorter = new Comparator<Entity>(){
		@Override
		public int compare(Entity a, Entity b){
			if(a.getY() < b.getY())
				return -1;
			return 1;
		}
	};

	public EntityManager(Handler handler, Player player){
		this.handler = handler;
		this.player = player;
		creature = new ArrayList<Entity>();
		entities = new ArrayList<Entity>();
		rocks = new ArrayList<Entity>();
		addEntity(player);
		addCreature(player);
		addRock(player);
	}
	



	public void tick(){
		for(int i = 0; i < entities.size(); i++){
			Entity e = entities.get(i);
			e.tick();
			if(!e.isActive())
				entities.remove(e);
		}
		entities.sort(sorter);
		for(int i = 0; i < rocks.size(); i++){
			Entity b = rocks.get(i);
			b.tick();
		}rocks.sort(sorter);
		for(int i = 0; i < creature.size(); i++){
			Entity c = creature.get(i);
			c.tick();
			if(!c.isActive())
				creature.remove(c);
		}
		entities.sort(sorter);
		
	}
		
	
	public void render(Graphics g){
		for(Entity e : entities){
		e.render(g);
		}
		for(Entity b : rocks){
			b.render(g);
			}
		for(Entity c : creature){
		c.render(g);
		}
		
	}
	
	public void addEntity(Entity e){
		entities.add(e);
	}
	public void addRock(Entity b){
		rocks.add(b);
	}
	public void addCreature(Entity c){
		creature.add(c);
	}
	
	
	
	
    /*/GETTERS AND SETTERS/*/
	
	
	
	public ArrayList<Entity> getRocks() {
		return rocks;
	}




	public void setRocks(ArrayList<Entity> rocks) {
		this.rocks = rocks;
	}




	public ArrayList<Entity> getCreature() {
		return creature;
	}




	public void setCreature(ArrayList<Entity> creature) {
		this.creature = creature;
	}




	public Handler getHandler() {
		return handler;
	}

	public void setHandler(Handler handler) {
		this.handler = handler;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public ArrayList<Entity> getEntities() {
		return entities;
	}

	public void setEntities(ArrayList<Entity> entities) {
		this.entities = entities;
	}
}

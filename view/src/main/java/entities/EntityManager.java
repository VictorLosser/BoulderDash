package entities;

import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

import javax.swing.JOptionPane;

import game_ui.Score;
import view.Handler;

public class EntityManager {
	
	private Score score;
	private Font font;
	
	private Handler handler;
	private Player player;
	private ArrayList<Entity> creature;
	private ArrayList<Entity> entities;
	private ArrayList<Entity> rocks;
	private ArrayList<Entity> item;
	
	private Comparator<Entity> sorter = new Comparator<Entity>(){
		
		//Compares the position of the entities on the map and puts it in front of it
		@Override
		public int compare(Entity a, Entity b){
			if(a.getY() < b.getY())
				return -1;
			return 1;
		}
	};
	//Compares the position of the entities on the map and puts it in front of it
	private Comparator<Entity> sorter2 = new Comparator<Entity>(){
		@Override
		public int compare(Entity a, Entity b){
			if(a.getY() > b.getY())
				return -1;
			return 1;
		}
	};
	//Constructor method of this class
	public EntityManager(Handler handler, Player player){
		this.handler = handler;
		this.player = player;
		
		score = new Score();
		font = new Font("Arial", Font.BOLD, 40);
		
		
		creature = new ArrayList<Entity>();
		entities = new ArrayList<Entity>();
		rocks = new ArrayList<Entity>();
		item = (new ArrayList<Entity>());
		addItem(player);
		addEntity(player);
		addCreature(player);
		addRock(player);
	}
	


	//tick the methods of this class
	public void tick(){
		Iterator<Entity> it = entities.iterator();
		//for(int i = 0; i < entities.size(); i++)
		while(it.hasNext()){
			Entity e = it.next();
			e.tick();
			if(!e.isActive())
				it.remove();
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
		for(int j = 0; j < item.size(); j++){
			Entity i = item.get(j);
			i.tick();
			if(!i.isActive()){
				item.remove(i);
				this.score.setNumber_diamond(this.score.getNumber_diamond() + 1);
				if(this.score.getNumber_diamond() >= 10){
					System.out.println("You Won");
			    	JOptionPane.showMessageDialog(null, "You Won");
					System.exit(0);
				}
			}
		}item.sort(sorter2);
	}
		
	//Renders the entities
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
		for(Entity i : item){
			i.render(g);
		}
		g.setFont(font);
		g.drawString("Diamonds "+this.score.getNumber_diamond()+ "/" + this.score.getTotal_number_diamond(), 35, 35);
		
	}
	//Add the different types of entities 
	public void addEntity(Entity e){
		entities.add(e);
	}
	public void addRock(Entity b){
		rocks.add(b);
	}
	public void addCreature(Entity c){
		creature.add(c);
	}
	public void addItem(Entity i){
		item.add(i);
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




	public ArrayList<Entity> getItem() {
		return item;
	}




	public void setItem(ArrayList<Entity> item) {
		this.item = item;
	}
}

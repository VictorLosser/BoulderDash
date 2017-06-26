package view;

import graphics.GameCamera;
import input.KeyManager;
import worlds.World;

public class Handler {

    private View game;
    private World world;
   //Constructor of the class
    public Handler(View game){
        this.game = game;
    }

    
    /*/GETTERS AND SETTERS/*/
    
    public GameCamera getGameCamera(){
        return game.getGameCamera();
    }

    public KeyManager getKeyManager(){
        return game.getKeyManager();
    }

    public int getWidth(){
        return game.getWidth();
    }

    public int getHeight(){
        return game.getHeight();
    }


    public View getGame() {
        return game;
    }

    public void setGame(View game) {
        this.game = game;
    }

    public World getWorld() {
        return world;
    }

    public void setWorld(World world) {
        this.world = world;
    }



}
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.LinkedList;

/**
 * Write a description of class Level here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level extends World
{

    int life = 5 ;
    LinkedList<life> lifes = new LinkedList<>();
    
    /**
     * Constructor for objects of class Level.
     * 
     */
    public Level(int x, int y, int z)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(x, y, z); 
        removeLife();
    }
    
     public void removeLife()
    {
        try{
            life life_ = lifes.getLast();
            removeObject(life_);
           
            lifes.removeLast();
            life--;
            if(life == 0){
                Greenfoot.setWorld(new scoreb());
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}

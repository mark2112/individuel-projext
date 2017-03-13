import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class beam here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class beam extends Actor
{
    /**
     * Act - do whatever the beam wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()+5,getY());
        remove();
       
    }
    public void remove(){
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}

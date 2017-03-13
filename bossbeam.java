import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bossbeam here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bossbeam extends Actor
{
    /**
     * Act - do whatever the bossbeam wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-3,getY());
        if(isAtEdge()){
            getWorld().removeObject(this);
     try{
        if(isAtEdge()){
            getWorld().removeObject(this);
           
        }
    }catch(IllegalStateException e){
            
        }
        }
        Life();
        
    }
     public void Life(){
        if(isTouching(Hero.class)){
         Greenfoot.setWorld(new scoreb());
        
            
        
      }
    }

}

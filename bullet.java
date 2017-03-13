import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bullet extends Actor
{
    /**
     * Act - do whatever the bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int count = 0;
    public void act() 
    {
        try{
        del();
        if(getX()<getWorld().getWidth()-getImage().getWidth()/2)
            {move(10);}
        else
            {getWorld().removeObject(this);}
        }catch(IllegalStateException e){
        
        }
    }    
    
   
    
    public void del(){
        if(isAtEdge()){
            getWorld().removeObject(this);
            
        }
    }
}

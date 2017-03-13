import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class enemy2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class enemy2 extends Actor
{
    int count ;
    /**
     * Act - do whatever the enemy2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX()-5, getY());
        
        try{
        if(isAtEdge()){
            getWorld().removeObject(this);
           
        }
    }catch(IllegalStateException e){
            
        }
        hit();
        expol();
        pop();
        Life();
}
  public void hit(){
      try{ 
      if(isTouching(bullet.class)){
           removeTouching(bullet.class);
           count++;
        
        if(count>=3){
           getWorld().removeObject(this);
        }
    }
    
    }
    catch(IllegalStateException e){
        
        
    }
  }
  public void expol(){
      try{
        if(isTouching(beam.class)){
            getWorld().removeObject(this);
        }
     }catch(IllegalStateException e){
        
     }
    }
    public void pop(){
      try{
        if(isTouching(beam.class)){
            getWorld().removeObject(this);
        }
    
      }catch(IllegalStateException e){
        
    }
  }
   public void Life(){
        if(isAtEdge()){
        ((EasyWorld)getWorld()).removeLife();
        
            
        }
    
    }
    public enemy2(){
         if(getWorld() != null)
            Life();
    }
}


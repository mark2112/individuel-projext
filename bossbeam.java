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
        setLocation(getX()-8,getY());
        
     try{
        if(isAtEdge()){
            getWorld().removeObject(this);
           
        }
    }catch(IllegalStateException e){
            
        }
        del();
        Life();
        
    }
     public void Life(){
         try{ 
         if(canSee(Hero.class));
        {
            eat(Hero.class);
        }
    }catch(IllegalStateException e){
    
    }  
        
      }
      public boolean canSee(Class clss) {
         return getOneObjectAtOffset(0, 0, clss) != null;
}
 

      public void eat(Class clss) {
         Actor actor = getOneObjectAtOffset(0, 0, clss);
         if(actor != null) {
           getWorld().removeObject(actor);
    }
 }
      public void del(){
        try{
         if(isAtEdge()){
            getWorld().removeObject(this);
           
        }
        }catch(IllegalStateException e){
            
        }
          
        }
 
}




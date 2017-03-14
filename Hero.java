import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Hero extends Actor
{
    static GreenfootSound gun = new GreenfootSound("lll.WAV");
    int bulletStep=0;
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        catchKeyMove();
        catchKeyShoot();
         
    }
    private void catchKeyMove()
    {
      
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(), getY() - 5);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(), getY() + 5);
        }
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX() - 5, getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX() + 5, getY());
        }
    
}

    private void catchKeyShoot()
    {
        try{
        if(Greenfoot.isKeyDown("space"))
        {
           
            bulletStep++;
            if(bulletStep==40)
            {
                 gun.play();
                bullet b = new bullet();
                int posX = getX()+Math.floorDiv(getImage().getWidth(),2)+Math.floorDiv(b.getImage().getWidth(),2);
                getWorld().addObject(b, posX, getY());
                bulletStep=0;
            }
        }
    }catch(IllegalArgumentException e){
    
    }
}
    /*public Hero(){
         if(getWorld() != null)
            
            
    }*/
    
    public void touchbeam(){
        try{
          if(isTouching(bossbeam.class)){
            ((Level)getWorld()).removeLife();
            
           }
        }catch(IllegalStateException e){
        
        }
       }
    }
    

    

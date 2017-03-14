import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class scoreb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class scoreb extends World
{

    /**
     * Constructor for objects of class scoreb.
     * 
     */
    public scoreb()
    {    
        
        super(600, 400, 1); 
        addObject(new restart(),300,200);
        showText("score : "+enemy1.score,getWidth()/2,getHeight()/2);
        
    }
}

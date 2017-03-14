import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    static GreenfootSound kuy = new GreenfootSound("star-wars-theme-song.wav");
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    public MyWorld()
    {    
        
        super(960,540, 1); 
        kuy.playLoop();
     
        addObject(new Logo(),214,102);
        addObject(new easy(),203,269);
        addObject(new medium(),221,333);
        addObject(new Hard(),204,398);
        addObject(new Howto(),243,466);
    }
    
}

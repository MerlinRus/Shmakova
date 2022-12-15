import greenfoot.*;

/**
 * Write a description of class kunai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kunai extends Actor
{
    /**
     * Act - do whatever the kunai wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        move(15);
    }  
    public kunai (int r)
    {
        setRotation(r);
    }
}

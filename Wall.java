import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Wall extends Actor
{    
    public Wall()
    {
        GreenfootImage WallImage = new GreenfootImage(40, 40);
        WallImage.setColor( Color.BLACK );
        WallImage.fillRect( 0, 0, 40, 40 );
        
        setImage(WallImage);
    }
    
    /**
     * Act - do whatever the Wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
}

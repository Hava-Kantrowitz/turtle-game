import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Animal
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        int vAmount = 0;
        if (atWorldEdge()){
           vAmount = getRandomRange(0, 360);
           setRotation(vAmount);
        }
        else{
            if(timeToTurn(30)){
                vAmount = getRandomRange(-20, 20);
                turn(vAmount);
            }
        }
        move(10);
    }
    
}

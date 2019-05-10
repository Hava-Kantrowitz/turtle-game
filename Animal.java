import greenfoot.*;
import java.util.List;
import java.util.ArrayList;

/**
 * Animal. This is the base class for all animals. In addition to the standard Actor methods, it provides methods to check for being at the edge of the world, as well as seeing and eating other classes. @author Michael Kolling @version 2.0
 */
public class Animal extends Actor
{
    /* WARNING: This file is auto-generated and any changes to it will be overwritten*/
    private static final int WALKING_SPEED = 5;

    /**
     * Move forward in the current direction.
     */
    public void move()
    {
        move(WALKING_SPEED);
    }

    /**
     * Test if we are close to one of the edges of the world. Return true if we are.
     */
    public boolean atWorldEdge()
    {
        if (getX() < 20 || getX() > getWorld().getWidth() - 20) {
            return true;
        }
        if (getY() < 20 || getY() > getWorld().getHeight() - 20) {
            return true;
        }
        else {
            return false;
        }
    }

    /**
     * Return true if we can see an object of class 'clss' right where we are. False if there is no such object here.
     */
    public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;
    }

    /**
     * Try to eat an object of class 'clss'. This is only successful if there is such an object where we currently are. Otherwise this method does nothing.
     */
    public void eat(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if (actor != null) {
            getWorld().removeObject(actor);
        }
    }

    /**
     * Return a random number in the specified range.  This method can return negative numbers.
     */
    public int getRandomRange(int rangeMin, int rangeMax)
    {
        int vNumber = 0;
        int vTotalNumbers = rangeMax - rangeMin;
        if (rangeMax <= rangeMin) {
            return 0;
        }
        vNumber = Greenfoot.getRandomNumber(vTotalNumbers);
        vNumber = vNumber + rangeMin;
        return vNumber;
    }

    /**
     * Randomly Returns true inPercent of Time
     */
    public boolean randomBooleanTrue(int inPercent)
    {
        int vNumber = Greenfoot.getRandomNumber(100);
        if (vNumber < inPercent) {
            return true;
        }
        return false;
    }

    /**
     * Returns if it is time for the object to turn
     */
    public boolean timeToTurn(int inPercent)
    {
        return (randomBooleanTrue(inPercent));
    }

    /**
     * check the counter and thee frequency to determine if it is time to trigger an event
     */
    public boolean counterEventTriggered(int inCounter, int inFrequency)
    {
        if (inCounter % inFrequency == 0) {
            return true;
        }
        return false;
    }

    /**
     * increase the size of the actor image by the specified number of pixels
     */
    public void scale(int inAmount)
    {
        GreenfootImage myImage = getImage();
        int myWidth = myImage.getWidth();
        int myHeight = myImage.getHeight();
        myImage.scale(myWidth + inAmount, myHeight + inAmount);
    }
}

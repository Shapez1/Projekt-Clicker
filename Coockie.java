import greenfoot.*; 

public class Coockie extends Actor
{
    public void act()
    {
        if(Greenfoot.mouseClicked(this))
        {
            MyWorld.cash++;
        }
    }
}

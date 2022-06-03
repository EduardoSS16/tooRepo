import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Enemigo del personaje principal en el nivel 2
 * 
 * @author José Eduardo Sánchez Sifuentes
 * @version 02 de Junio de 2022
 */
public class clown extends Actor
{
    fiesta thisGame2;
    /**
       * Método que se ejecutará desde el primer instante
       * 
     */
    public void act()
    {
        // Add your action code here.
        move(20);
        if(Greenfoot.getRandomNumber(10) == 1){
         setRotation(Greenfoot.getRandomNumber(360));   
        }
        Actor Billie2 = getOneIntersectingObject(Billie2.class);
        if(Billie2 != null)
        {
            fiesta fi = (fiesta)getWorld();
            getWorld().removeObject(Billie2);
            thisGame2.lifes--;
            getWorld().addObject(new Billie2(), 60, 465);
        }
    }
}

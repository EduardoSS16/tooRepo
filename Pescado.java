import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Random;
/**
 * Obstáculo para el personaje en el nivel 1
 * 
 * @author José Eduardo Sánchez Sifuentes
 * @version 02 de Junio de 2022
 */
public class Pescado extends Actor
{
    /**
       * Método que permite al personaje atacar
       * 
     */
    int speed = 1;
    int contador = 0;
    public void act()
    {
        contador++;
        move();
        Actor Billie = getOneObjectAtOffset(0,0, Billie.class);
        if(Billie != null)
        {
            arroyo a = (arroyo)getWorld();
            getWorld().removeObject(Billie);
            getWorld().addObject(new Billie(), 60, 465);
        }
    }
    /**
       * Método que permite mover el obstáculo de manera automática
       * 
     */
    public void move(){
        if(contador < 100)
        setLocation(getX(), getY() + speed);
        else{
            speed = - speed;
            getImage().mirrorHorizontally();
            contador = 0;
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Obstáculo para el personaje principal en el nivel 3
 * 
 * @author José Eduardo Sánchez Sifuentes
 * @version 02 de Junio de 2022
 */
public class Fire extends Actor
{
     /**
       * Método que se ejecutará desde el primer instante
       * 
     */
    casa thisGame3;
    public void act()
    {
        Actor Billie3 = getOneIntersectingObject(Billie3.class);
        if(Billie3 != null)
        {
            casa c = (casa)getWorld();
            getWorld().removeObject(Billie3);
            thisGame3.vida--;
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Superficie que permite moverse al personaje
 * 
 * @author José Eduardo Sánchez Sifuentes
 * @version 02 de Junio de 2022
 */
public class p3 extends Piso
{
    /**
       * Método que permite al personaje atacar
       * 
     */
    public void act()
    {
        // Add your action code here.
        Actor Billie3 = getOneObjectAtOffset(0, 0, Billie3.class);
        if(Billie3 != null)
        {
            getWorld().removeObject(this);
        }
    }
}

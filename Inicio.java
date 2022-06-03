import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import greenfoot.GreenfootImage;
/**
 * Escenario principal que aparecerá cuando se inicie el juego
 * 
 * @author José Eduardo Sánchez Sifuentes
 * @version 02 de Junio de 20222
 */
public class Inicio extends World
{
    GreenfootSound sound = new GreenfootSound("Mistery.wav");
    cargando car;
    /**
     * Constructor for objects of class Inicio.
     * 
     */
    public Inicio()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1);
        car = new cargando();
    }
    /**
       * Método que se ejecutará desde el primer instante
       * 
     */
    public void act(){
        sound.play();
        if(Greenfoot.isKeyDown("H")){
            sound.stop();
            Greenfoot.setWorld(new control());
        }
        if(Greenfoot.isKeyDown("enter")){
            sound.stop();
            this.addObject(car, 950, 550);
            Greenfoot.delay(400);
            Greenfoot.setWorld(new arroyo());
        }
        if(Greenfoot.isKeyDown("X")){
            Greenfoot.stop();
            sound.stop();
        }
    }
}

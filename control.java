import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Escenario que muestra los controles de juego cuando el usuario
 * navegue del escenario principal
 * @author José Eduardo Sánchez Sifuentes
 * @version 02 de Junio de 2022
 */
public class control extends World
{
    GreenfootSound sound = new GreenfootSound("Mistery.wav");
    /**
     * Constructor para objetos de la clase control.
     * 
     */
    public control()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
    }
     /**
       * Método que se ejecutará desde el primer instante
       * 
     */
    public void act(){
        sound.play();
        if(Greenfoot.isKeyDown("B")){
            sound.stop();
            Greenfoot.setWorld(new Inicio());
        }
    }
}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Escenario que aparecerá cuando el usuario pierda en alguno de los niveles presentados en el juego
 * 
 * @author José Eduardo Sánchez Sifuentes
 * @version 02 de Junio de 2022
 */
public class GameOver extends World
{
    GreenfootSound sound = new GreenfootSound("GameOver.wav");
    arroyo thisGame;
    fiesta thisGame2;
    casa thisGame3;
    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver()
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
        //Greenfoot.stop();
        /*if(Greenfoot.isKeyDown("R")){
            sound.stop();
            Greenfoot.setWorld(new casa());
        }*/
        thisGame.score = 0;
        thisGame.timer = 937;
        thisGame2.score = 0;
        thisGame2.lifes = 3;
        thisGame3.score = 0;
        thisGame3.vida = 1;
        thisGame3.puerta = 0;
        if(Greenfoot.isKeyDown("B")){
            sound.stop();
            Greenfoot.setWorld(new Inicio());
        }
    }
}

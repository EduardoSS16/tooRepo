import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.LinkedList;
import java.util.Random;
/**
 * Escenario correspondiente al nivel 2
 * 
 * @author José Eduardo Sánchez Sifuentes
 * @version 02 de Junio de 2022
 */
public class fiesta extends World
{
    GreenfootSound sound = new GreenfootSound("payaso.wav");
    clown cl;
    public static int score = 0;
    public static int lifes = 3;
    LinkedList<globo> globos;
    Billie2 bil;
    /**
     * Constructor para objetos de la clase fiesta.
     * 
     */
    public fiesta()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        Random rand = new Random();
        bil = new Billie2();
        globos = new LinkedList<globo>();
        cl = new clown();
        //Agregar a Billie al escenario
        this.addObject(bil, 60, 465);
        //Agregar payaso al escenario
        this.addObject(cl, 940, 465);
        //Agrega globos al escenario
        for(int i = 0; i < 12; i++){
            globos.add(new globo());
            this.addObject(globos.get(i), rand.nextInt(1000), rand.nextInt(600));
        }
    }
     /**
       * Método que se ejecutará desde el primer instante
       * 
     */
    public void act(){
        sound.play();
        showText("Score: " + score, 50, 25);
        showText("Vidas: " + lifes, 60, 60);
        if(this.score == 12){
            showText("HAS GANADO!", 500, 300);
            sound.stop();
            Greenfoot.delay(500);
            Greenfoot.setWorld(new casa());
        }
        if(this.lifes == 0){
            showText("HAS PERDIDO!", 400, 400);
            sound.stop();
            Greenfoot.setWorld(new GameOver());
        }
    }
}

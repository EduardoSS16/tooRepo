import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.LinkedList;
/**
 * Escenario correspondiente al primer nivel.
 * 
 * @author José Eduardo Sánchez Sifuentes
 * @version 02 de Junio de 2022
 */
public class arroyo extends World
{
    GreenfootSound sound = new GreenfootSound("arroyo.wav");
    public static int score = 0;
    Billie bi;
    public static int timer = 937;
    /**
     * Constructor para los objetos de la clase arroyo.
     * 
     */
    public arroyo()
    {    
        // Crear un nuevo mundo de tamaño 1000 x 600
        super(1000, 600, 1);
        bi = new Billie();
        this.addObject(bi, 60, 445);
        prepare();
    }
    /**
       * Método que se ejecutará desde el primer instante
       * 
     */
    public void act()
    {
        sound.play();
        showText("Score: " + score, 50, 25);
        //Verifica si el usuario ha ganado
        if(this.score == 3){
            showText("HAS GANADO!", 500, 300);
            sound.stop();
            Greenfoot.delay(500);
            Greenfoot.setWorld(new fiesta());
        }
        showText("Tiempo: " + timer, 65, 45);
        timer--;
        if(timer == 0){
            //Verifica si el usuario ha perdido
            showText("Has perdido!", 200, 200);
            sound.stop();
            Greenfoot.setWorld(new GameOver());
        }
    }
    
    /**
     * Prepare el escenario para el inicio del nivel.
     *
     */
    private void prepare()
    {
        Roca roca = new Roca();
        addObject(roca,61,551);
        Roca roca2 = new Roca();
        addObject(roca2,325,550);
        Roca roca3 = new Roca();
        addObject(roca3,651,552);
        Roca roca4 = new Roca();
        addObject(roca4,964,534);
        Pescado pescado = new Pescado();
        addObject(pescado,190,449);
        Pescado pescado3 = new Pescado();
        addObject(pescado3,798,453);
        Recompensa recompensa = new Recompensa();
        addObject(recompensa,314,477);
        Recompensa recompensa2 = new Recompensa();
        addObject(recompensa2,647,479);
        Recompensa recompensa3 = new Recompensa();
        addObject(recompensa3,960,475);
        roca4.setLocation(964,534);
        roca4.setLocation(966,558);
        Pescadoo pescadoo = new Pescadoo();
        addObject(pescadoo,478,573);
    }
}

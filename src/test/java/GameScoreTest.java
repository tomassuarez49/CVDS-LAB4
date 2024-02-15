import org.junit.Test;
import hangman.model.*;
import org.junit.Assert;

public class GameScoreTest{

/**
     *Clases equivalencia OriginalScore:
     * Se debe iniciar con 100 puntos y el puntaje no puede ser menor a 0
     * El puntaje varia de 10 en 10
     * Casos de frontera 0<puntos<100
     *Clases equivalencia BonusScore:
     * El puntaje no puede ser menor a 0 e inicia con 0 puntos
     * El puntaje varia de 5 en 5
     * Se premia de 10 en 10 puntos
     * Casos de frontera 0<puntos
     * Clases equivalencia PowerScore
     * El puntaje no puede ser menor a 0 e inicia con 0 puntos
     * El puntaje varia de 8 en 8
     * Se bonifica con múltiplos de 5
     * Casos de frontera 0<puntos<500
     */


    //originalScore
    private GameScore original = new OriginalScore();
    private GameScore bonus = new BonusScore();
    private GameScore power = new PowerScore();

    //OriginalScore
    @Test
    public void validateOriginalNegativePoints(){
        int x = original.calculateScore(0,15);
        Assert.assertEquals(0,x);
    }
    @Test
    public void validateOriginalPositivePoints(){
        int x = original.calculateScore(2,2);
        Assert.assertEquals(80,x);
    }
    @Test
    public void validateOriginalZeroPoints(){
        int x = original.calculateScore(5,10);
        Assert.assertEquals(0,x);
    }

    //bonusScore
    @Test
    public void validateBonusNegativePoints(){
        int x = bonus.calculateScore(1,3);
        Assert.assertEquals(0,x);
    }
    @Test
    public void validateBonusPositivePoints(){
        int x = bonus.calculateScore(5,1);
        Assert.assertEquals(45,x);
    }
    @Test
    public void validateBonusZeroPoints(){
        int x = bonus.calculateScore(2,4);
        Assert.assertEquals(0,x);
    }

    //powerScore
    @Test
    public void validatePowerNegativePoints(){
        int x = power.calculateScore(0,4);
        Assert.assertEquals(0,x);
    }
    @Test
    public void validatePowerPositivePoints(){
        int x = power.calculateScore(3,0);
        Assert.assertEquals(155,x);
    }
    @Test
    public void validateZeroNegativePoints(){
        int x = power.calculateScore(8,61035);
        Assert.assertEquals(0,x);
    }
    @Test
    public void validatePowerMaxPoints(){
        int x = power.calculateScore(4,2);
        Assert.assertEquals(500,x);
    }

}
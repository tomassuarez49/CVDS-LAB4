public class PowerScore implements GameScore{
	
	/**
     * @pre Se esperan que correctCount e incorrectCount sean números enteros.
     * @pos Calcula el resultado de los puntos según los parámetros y las reglas específicas del tipo GameScore.
     * @param correctCount El número de respuestas correctas que tuvo el participante.
     * @param incorrectCount El número de respuestas incorrectas que tuvo el participante.
     * @throws hangman.exceptions.ExceptionValorInvalido Si los valores proporcionados no son válidos.
     * @return Retorna el resultado de los puntos obtenidos.
     */
	
    private int points;
    public int calculateScore(int correctCount,int incorrectCount){
    	points = 0;
        if(correctCount< 0 || incorrectCount<0){
            System.out.println("Invalid");
            return -1;
        }
        points = 0;
        correctWords(correctCount);
        incorrectWords(incorrectCount);
        if(points> 500){
            points = 500;
        }
        return points;

    }
    public int getScore() {
    	return points; 
    }

    private void correctWords(int correctCount){
        for(int i = 1; i<=correctCount; i++){
            points += (int) Math.pow(5,i);
        }
    }
    private void incorrectWords(int incorrectCount){
        while(points > 0 && incorrectCount > 0){
            points -= 8;
            incorrectCount -= 1;
        }


}

}
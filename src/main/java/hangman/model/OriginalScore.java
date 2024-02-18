package hangman.model;

public class OriginalScore implements GameScore{
	
	/**
	 * @pre Se espera que correctCount y incorrectCount sean números enteros.
	 * @pos Calcula el resultado de los puntos según las reglas específicas del tipo de puntuación de juego.
	 * @param correctCount El número de respuestas correctas que tuvo el participante.
	 * @param incorrectCount El número de respuestas incorrectas que tuvo el participante.
	 * @throws hangman.exceptions.ExceptionValorInvalido Si los valores proporcionados no son válidos.
	 * @return Retorna el resultado de los puntos obtenidos.
	 */

	private int points;

	public int calculateScore(int correctCount,int incorrectCount){
		points=100;
		if(correctCount< 0 || incorrectCount<0){
			System.out.println("Invalid");
			return -1;
		}
		else{
			points = 100;
		 	return incorrectWords(incorrectCount);

		}
	}
	
	private int incorrectWords(int incorrectCount){
		while(points >0 && incorrectCount>0){
			points -= 10;
			incorrectCount--;
		}
		return points;
	}


}
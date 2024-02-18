package hangman.model;


public class BonusScore implements GameScore{

	/**
	 * @pre Se espera que correctCount y incorrectCount sean números enteros.
	 * @pos Calcula el resultado de los puntos según los parámetros proporcionados.
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
		correctWords(correctCount);
		incorrectWords(incorrectCount);
		return points;
	}


	private void correctWords(int correctCount){
		for(int i = 0; i<correctCount; i++){
			points += 10;
		}
   }
   private void incorrectWords(int incorrectCount){
		while(points > 0 && incorrectCount>0){
			points -= 5;
			incorrectCount -= 1;
		}
   }

}
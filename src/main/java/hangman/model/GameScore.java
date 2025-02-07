package hangman.model;

public interface GameScore {

	
	/**
	 * @pre Se esperan que correctCount e incorrectCount sean números enteros.
	 * @pos Calcula el resultado de los puntos según los parámetros proporcionados.
	 * @param correctCount El número de respuestas correctas que tuvo el participante.
	 * @param incorrectCount El número de respuestas incorrectas que tuvo el participante.
	 * @throws hangman.exceptions.ExceptionValorInvalido Si los valores proporcionados no son válidos.
	 * @return Retorna el resultado de los puntos obtenidos.
	 */

	public int calculateScore(int correctCount,int incorrectCount);

}


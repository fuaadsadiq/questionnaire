package com.fs.sports;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import org.springframework.stereotype.Repository;

@Repository 
public class QuizDataAccessService {
private List<Quiz.Question> quizQuestions;
private Map<String, Integer> score;

public QuizDataAccessService() {

	score = new HashMap<>();
	
	score.put("a", 0);
	score.put("b", 0);
	score.put("c", 0);
	
quizQuestions = List.of(
		new Quiz.Question("What is your bone structure?", "Q1", 
				List.of(
						new Quiz.Answer("Very Large", "a"),
						new Quiz.Answer("Medium to Large", "b"),
						new Quiz.Answer("Small to frail", "c")
						)),
		
		new Quiz.Question("Your body tends to?", "Q2",
				List.of(
						new Quiz.Answer("Carry to much fat", "a"),
						new Quiz.Answer("Be lean or muscular", "b"),
						new Quiz.Answer("Be too skinny", "c")
						
				)),
		
		new Quiz.Question("As a child you were?", "Q3",
				List.of(
						new Quiz.Answer("Chubby", "a"),
						new Quiz.Answer("Normal", "b"),
						new Quiz.Answer("Too thin", "c")
						
				)),
		
		new Quiz.Question("How do you describe your activity level?", "Q4",
				List.of(
						new Quiz.Answer("I have a sedentary lifestyle", "a"),
						new Quiz.Answer("Im sometimes active", "b"),
						new Quiz.Answer("Im very active", "c")
						
				)),
		
		new Quiz.Question("What do people usually advise you with?", "Q5",
				List.of(
						new Quiz.Answer("That I should lose some weight", "a"),
						new Quiz.Answer("People say that I look great and should stay the same", "b"),
						new Quiz.Answer("People tell me to gain some weight", "c")
						
				)),
		
		new Quiz.Question("Select the statement that suits your dieting style?", "Q6",
				List.of(
						new Quiz.Answer("You gain weight easily and have a hard time losing", "a"),
						new Quiz.Answer("You gain and lose easily, and stay about the same", "b"),
						new Quiz.Answer("You have trouble gaining weight", "c")
						
				)),
		
		new Quiz.Question("How often do you feel hungry?", "Q7",
				List.of(
						new Quiz.Answer("All the time", "a"),
						new Quiz.Answer("Just at meal times", "b"),
						new Quiz.Answer("Rarely", "c")
						
				))
		
		);
}

public Map<String,Integer> getScore(){
    return score;
}

public void insertQuestionAnswer(int question_number, Quiz.Answer answer) {
	 int count = score.get(answer.getId());
	            count++;
	            score.replace(answer.getId(), count);
}
}

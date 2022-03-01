package com.fs.sports;

import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class QuizService {

    private QuizDataAccessService quizDataAccessService;

    public QuizService(QuizDataAccessService quizDataAccessService) {
        this.quizDataAccessService = quizDataAccessService;
    }

    public void addNewAnswer(int question_number, Quiz.Answer answer) {
        quizDataAccessService.insertQuestionAnswer(question_number, answer);

    }

    public String getResult(){
        Map<String, Integer> result = quizDataAccessService.getScore();
        int aCount = result.get("a");
        int bCount = result.get("b");
        int cCount = result.get("c");

        if (aCount > bCount && aCount > cCount) {
            return "Your Results are in:\nBody Type: " + BodyTypes.Endomorph;
        } else if (bCount > aCount && bCount > cCount) {
            return "Your Results are in:\n Body Type: " + BodyTypes.Mesomorph;
        } else if (cCount > aCount && cCount > bCount) {
            return "Your Results are in:\n Body Type: " + BodyTypes.Ectomorph; 
        }else{
            return "You may have made a mistake! Try again!";
        }
    }
}

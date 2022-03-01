package com.fs.sports;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping (path = "api/MatchdayPerformance")


public class SportsapllicationController {
	private QuizDataAccessService quizDataAccessService;
    private QuizService quizService;


}
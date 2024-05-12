package com.mahender.quizapp.controller;

import com.mahender.quizapp.Question;
import com.mahender.quizapp.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @GetMapping("allQuestions")
    public ResponseEntity<List<Question>> getAllQuestion(){
        return questionService.getAllQuestions();
    }

    @GetMapping("category/{category}")
    public ResponseEntity<List<Question>> getQuestionByCategory(@PathVariable String category ){
        return questionService.getQuestionsByCategory(category);
    }

    @PostMapping("add")
    public ResponseEntity<String> addQuestion(@RequestBody Question question){
       return questionService.addQuestion(question);

    }

    /*@DeleteMapping("delete")
    public String deleteQuestionById(@RequestBody Integer questionId){
        return questionService.deleteQuestionById(questionId);

    }
    @PutMapping("update")
    public String updateQuestionById(@RequestBody Integer questionId){
        return questionService.updateQuestionById(questionId);
    }*/
}

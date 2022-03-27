package com.interview.crack_coding_interviews.controlller;

import com.interview.crack_coding_interviews.model.Question;
import com.interview.crack_coding_interviews.repository.IQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/questions")
@RestController
public class QuestionController {

    @Autowired
    IQuestionRepository questionRepository;


    //get all
    @GetMapping
    List<Question> getAllQuestions(){
        List<Question> allQuestions = questionRepository.findAll();
        return allQuestions;
    }


    //insert into
    @PostMapping
    HttpStatus addQuestions(@RequestBody Question question){
        try{
            questionRepository.save(question);
            return HttpStatus.CREATED;
        }catch(Exception e){
            System.out.println(e.getLocalizedMessage());
            return HttpStatus.BAD_REQUEST;
        }
    }






}

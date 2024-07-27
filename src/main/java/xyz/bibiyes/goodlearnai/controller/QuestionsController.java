package xyz.bibiyes.goodlearnai.controller;

import org.springframework.web.bind.annotation.*;
import xyz.bibiyes.goodlearnai.entity.Questions;
import xyz.bibiyes.goodlearnai.service.QuestionsService;
import xyz.bibiyes.goodlearnai.utils.Result;

import javax.annotation.Resource;
@CrossOrigin
@RestController
@RequestMapping("/goodlearnai")
public class QuestionsController {

    @Resource
    private QuestionsService questionsService;
    // 获取问题的接口
    @GetMapping("/questions")
    public Result getQuestions(@RequestParam(defaultValue = "1") Integer page , @RequestParam(defaultValue = "5") Integer pageSize , @RequestParam String title){
        return questionsService.findByTitle(page,pageSize,title);
    }
    // 添加题目的接口
    @PostMapping("/questions")
    public Result addQuestion(@RequestBody Questions question) {
        return questionsService.addQuestion(question);
    }
}


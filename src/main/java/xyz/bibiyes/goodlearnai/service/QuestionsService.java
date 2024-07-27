package xyz.bibiyes.goodlearnai.service;

import org.springframework.stereotype.Service;
import xyz.bibiyes.goodlearnai.entity.Questions;
import xyz.bibiyes.goodlearnai.mapper.QuestionsMapper; // 确保导入正确的 Mapper 类
import xyz.bibiyes.goodlearnai.utils.Result;

import javax.annotation.Resource;
import java.util.List;

@Service
public class QuestionsService {

    @Resource
    private QuestionsMapper questionMapper;

    // 添加题目
    public Result<String> addQuestion(Questions question) {
        // 使用 MyBatis-Plus 的 insert 方法插入数据
        boolean success = questionMapper.insert(question) > 0;

        if (success) {
            return Result.success("question", "题目添加成功", null);
        } else {
            return Result.failure(500, "question", "题目添加失败");
        }
    }
    // 模糊查询题目
    public Result findByTitle(String title) {
        List<Questions> questions = questionMapper.findByTitle(title);
        return Result.success("questions","返回题目成功",questions);
    }
}


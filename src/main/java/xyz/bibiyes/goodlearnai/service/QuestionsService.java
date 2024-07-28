package xyz.bibiyes.goodlearnai.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import xyz.bibiyes.goodlearnai.entity.Questions;
import xyz.bibiyes.goodlearnai.mapper.QuestionsMapper;
import xyz.bibiyes.goodlearnai.utils.Result;

import javax.annotation.Resource;
import java.util.List;

@Service
@Slf4j
public class QuestionsService {

    @Resource
    private QuestionsMapper questionMapper;

    // 添加题目
    public Result addQuestion(Questions question) {
        try {
            // 使用 MyBatis-Plus 的 insert 方法插入数据
            questionMapper.insert(question);

            return Result.success("question", "题目添加成功", null);

        } catch (Exception e) {
            return Result.error("question", "题目添加失败");
        }

    }

    // 模糊查询题目
    public Result findByTitle(Integer page,Integer pageSize , String title,Integer id) {
        if (id == null) {
            // 使用pageHelper分页
            PageHelper.startPage(page, pageSize);
            List<Questions> questions = questionMapper.findByTitle(title);

            // 使用 PageInfo 封装查询结果
            PageInfo<Questions> pageInfo = new PageInfo<>(questions);

            return Result.success("questions", "返回题目成功",pageInfo);
        }
        else {

            Questions question = questionMapper.selectById(id);
            return Result.success("question", "返回题目成功", question);
        }

    }
}


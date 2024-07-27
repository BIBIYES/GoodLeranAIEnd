package xyz.bibiyes.goodlearnai.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import xyz.bibiyes.goodlearnai.entity.Questions;

import java.util.List;

@Mapper
public interface QuestionsMapper extends BaseMapper<Questions> {
    // 模糊查询问题
    List<Questions> findByTitle(String title);
}

package xyz.bibiyes.goodlearnai.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import xyz.bibiyes.goodlearnai.entity.Questions;

import java.util.List;

/**
 * @author Mouse
 */
@Mapper
public interface QuestionsMapper extends BaseMapper<Questions> {
    // 模糊查询问题
    @Select("SELECT * FROM questions WHERE title LIKE CONCAT('%', #{title}, '%') LiMIt #{start},#{pageSize}")
    List<Questions> findByTitle(@Param("start") Integer start , @Param("pageSize") Integer pageSize , @Param("title") String title);
}

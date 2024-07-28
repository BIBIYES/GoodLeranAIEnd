package xyz.bibiyes.goodlearnai.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

/**
 * @author Mouse Sakura
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Questions {
    private int id;
    private String title;
    private String content;
    private String prompt;
    private String uploadDate;

}

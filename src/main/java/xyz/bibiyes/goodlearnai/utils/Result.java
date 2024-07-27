package xyz.bibiyes.goodlearnai.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Result {

    // Getters and Setters
    private int code;
    private String type;
    private String msg;
    private Object data;

    public static  Result success(String type , String msg) {
        return new Result(200 , type , msg ,null);
    }
    public static  Result success(String type , String msg , Object data) {
        return new Result(200 , type , msg ,data);
    }

    public static  Result error(String type , String msg ) {
        return new Result(500 , type , msg ,null);
    }
}

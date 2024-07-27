package xyz.bibiyes.goodlearnai.utils;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Result<T> {

    // Getters and Setters
    private int code;
    private String type;
    private String msg;
    private T data;

    // Constructor
    public Result() {
    }

    public Result(int code, String type, String msg, T data) {
        this.code = code;
        this.type = type;
        this.msg = msg;
        this.data = data;
    }

    // Static methods for success and failure
    public static <T> Result<T> success(String type, String msg, T data) {
        Result<T> result = new Result<>();
        result.setCode(200);
        result.setType(type);
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static <T> Result<T> failure(int code, String type, String msg) {
        Result<T> result = new Result<>();
        result.setCode(code);
        result.setType(type);
        result.setMsg(msg);
        result.setData(null);
        return result;
    }

    @Override
    public String toString() {
        return "Result{" + "code=" + code + ", type='" + type + '\'' + ", msg='" + msg + '\'' + ", data=" + data + '}';
    }
}

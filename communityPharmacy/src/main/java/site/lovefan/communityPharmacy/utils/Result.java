package site.lovefan.communityPharmacy.utils;

/**
 * Created by girlF on 2017/10/22.
 */
public class Result {
    private String status;
    private String message;
    private Object data;

    public Result() {

    }

    public Result(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public Result(String status, String message, Object data) {
        this(status, message);
        this.data = data;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public Object getData() {
        return data;
    }

    public static Result newErrorResult(String message) {
        return new Result("error", message);
    }

    public static Result newSuccessResult(Object data) {
        return new Result("success", null, data);
    }

}

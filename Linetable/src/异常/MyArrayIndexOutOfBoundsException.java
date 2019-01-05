package 异常;

/**
 * 自定义索引越界异常
 */
public class MyArrayIndexOutOfBoundsException extends RuntimeException{

    public MyArrayIndexOutOfBoundsException(String message) {
        super(message);
    }

    public MyArrayIndexOutOfBoundsException() {
    }
}

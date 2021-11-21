package P7.Exception.createException;

import java.io.IOException;

/**
 * @author cen
 * @Description TODO
 * @Version 1.0.0
 * @Date 21/11/2021 20:37
 * @see
 * @deprecated
 */
public class FileFormatException extends IOException {
    public  FileFormatException(){}
    public  FileFormatException(String gripe){
        super(gripe);
    }
}

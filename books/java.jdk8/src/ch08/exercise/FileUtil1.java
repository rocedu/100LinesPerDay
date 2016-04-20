package ch08.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by rocedu on 2016/2/24.
 */
public class FileUtil1 {
    public static String readFile(String name)  {
        try {
            FileInputStream input = new FileInputStream(name);
        } catch ( Throwable e) {
            e.printStackTrace();
        }
        return name;
    }
}

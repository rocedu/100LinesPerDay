package ch08.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOError;
import java.io.IOException;

/**
 * Created by rocedu on 2016/2/24.
 */
public class FileUti2 {
    public static String readFile(String name) throws FileNotFoundException,IOException {
        try(FileInputStream input = new FileInputStream(name)){

        }
        return name;
    }
}

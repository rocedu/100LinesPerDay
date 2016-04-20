package ch09;

import java.util.*;

public class WordCount {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        
        System.out.print("请输入英文：");
        Set words = tokenSet(console.nextLine());
        System.out.printf("不重复的单词有 %d 个：%s%n", words.size(), words);
    }
    
    static Set tokenSet(String line) {
        String[] tokens = line.split(" ");
        return new HashSet(Arrays.asList(tokens));
    }
}
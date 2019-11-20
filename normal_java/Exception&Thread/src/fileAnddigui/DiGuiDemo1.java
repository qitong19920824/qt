package fileAnddigui;

import java.io.File;

/**
 * @Author: qitong
 * @Date: 2019/11/20 21:48
 */

public class DiGuiDemo1 {
    public static void main(String[] args) {
        printDir(new File("F:\\mycode"));
    }
    public static void printDir(File file){
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isFile()){
                if (file1.getName().endsWith(".java")){
                    System.out.println("文件名"+file1.getAbsolutePath());
                }
            }else {
                printDir(file1);
            }
        }
    }
}

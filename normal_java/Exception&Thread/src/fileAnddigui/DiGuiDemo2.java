package fileAnddigui;

import java.io.File;
import java.io.FileFilter;

/**
 * @Author: qitong
 * @Date: 2019/11/20 21:48
 */

public class DiGuiDemo2 {
    public static void main(String[] args) {
        printDir(new File("F:\\mycode"));
    }
    public static void printDir(File file){
        /*File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                return pathname.getName().endsWith(".java")||(pathname.isDirectory());
            }
        });*/
        File[] files = file.listFiles(f->{
            return f.getName().endsWith(".java")||file.isDirectory();
        });
        for (File file1 : files) {
            if (file1.isFile()){
                System.out.println("文件名"+file1.getAbsolutePath());
            }else {
                printDir(file1);
            }
        }
    }
}

package fileAnddigui;

import java.io.File;

/**
 * @Author: qitong
 * @Date: 2019/11/20 21:12
 */

public class FileCreateDelete {
    public static void main(String[] args) {
        File file = new File("F:\\mycode");
        //遍历目录
        String[] lists = file.list();
        for (String list : lists) {
            System.out.println(list);
        }
        File[] files = file.listFiles();
        for (File filename : files) {
            System.out.println(filename);

        }

    }
}

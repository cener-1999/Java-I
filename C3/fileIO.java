package C3;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

class fileIO {
    public static void main (String[] args) throws IOException {
        fileIO.FileOut();
        fileIO.FileInput();
    }

    /**
     * 查询当前的基目录
     */
    public void GetBasicPath(){
        String dir = System.getProperty("user.dir");
        System.out.println(dir);
    }

    /**
     * 读入文件
     */
    public static void FileInput() throws IOException {
        Scanner in = new Scanner(Paths.get("textFile.txt"),"UTF-8");
        String text=in.nextLine();
        System.out.println(text);
    }
    /**
     * 写入文件
     * 注意带有缓冲区，需要flush或者close;
     */
    public static void FileOut() throws IOException{
        PrintWriter out = new PrintWriter("textFile.txt","UTF-8");
        out.print("In order to test if File IO ready?\n");
        out.close();
    }
}

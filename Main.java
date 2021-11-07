//subString的规则
import java.util.Scanner;
class Main{
    public static String reverse(String str,int index ,int length){
        String subStr = str.substring(index-1,index+length-1);
        char[] tempStr = subStr.toCharArray();
//        for(int i =0;i<length-1;i++){
//            tempStr[i]=tempStr[1];
//        }
//        String subResult =tempStr.toString();
//        String result = str.substring(0,index+length-1)+subResult+str.substring(index+length-1,str.length());
        System.out.println(subStr);
        return subStr;
    }

    public static void main(String[] args){
        String result = "";
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int n = scanner.nextInt();
        for (int i = 0; i<n;i++){
            int index = scanner.nextInt();
            int length = scanner.nextInt();
            result =Main.reverse(str,index,length);
        }
        System.out.println(result);
    }
}
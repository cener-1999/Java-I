package C3;

class StringCodePoint {
    static String greeting ="Hello";
    public static void main(String[] args) {
        StringCodePoint.codePointAndCodeuint1();
    }


    /**
     * 如果要遍历字符串，看每个codePoint，codePoint返回一个int流，用toArray把它变成一个数组
     * 再把它变成一个字符串
     */
    public static void codePointAndCodeuint2(){

        int[] codePionts  =greeting.codePoints().toArray();
        String str = new String(codePionts,0,codePionts.length);
        System.out.println(codePionts);
        System.out.println(str);
    }

    public static void codePointAndCodeuint1(){
        int n = greeting.length();
        int cpCont=greeting.codePointCount(0,greeting.length());

        char first = greeting.charAt(0);
        char last = greeting.charAt(greeting.length()-1);

        int index = greeting.offsetByCodePoints(0,4);
        int cp = greeting.codePointAt(index);

        System.out.println("char`s nubmers are "+n+"  acture numbers are " + cpCont);
        System.out.println("the first char is "+ first+" the last char is "+ last);
        System.out.println("the codePoint at last is "+ cp);
    }

    /**
     * StringBuilder的使用
     */
    public static void stringBuilder(){
        StringBuilder builder =new StringBuilder();
        builder.append(greeting);
        builder.append("!!!");
        String str = builder.toString();
        System.out.println(str);
    }

}

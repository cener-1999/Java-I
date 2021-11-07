/**
 * 编程风格：逻辑清晰>简洁炫技；
 */

class CompoundInterest {
    public static void main(String[] args) {
        final double STARTRATE=10;
        final int NRATES=6;
        final int NYEARE=10;

        double[] interestRate = new double[NRATES];
        for(int i = 0;i<interestRate.length;i++){
            interestRate[i]=(STARTRATE+i)/100.0;
        }

        //主要balance.length与balance[0].length的区别
        double[][] balance = new double[NYEARE][NRATES];
        for(int i = 0;i<balance[0].length;i++){
            balance[0][i]=10000;
        }

        for(int i =1;i<balance.length;i++){
            for(int j = 0;j<balance[0].length;j++){
                double oldBalance=balance[i][j]=balance[i-1][j];
                double interest=oldBalance*interestRate[j];
                balance[i][j]=oldBalance+interest;
            }
        }

        for(int i =0;i<interestRate.length;i++){
            System.out.printf("%9.0f%%",100*interestRate[i]);
        }
        System.out.println();
        for (double[] row:balance){
            for(double b :row){
                System.out.printf("%10.2f",b);
            }
            System.out.println();
        }
    }
}

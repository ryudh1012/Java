public class P21 {
    public static void main(String[] args){
        int[][][] array = new int[10][10][10];
        int i, j, k;
        int index = 1, hap = 0;

        for (i = 0; i < 10; i++)
            for(j = 0; j < 10; j++)
                for (k = 0; k < 10; k++)
                    array[i][j][k] = index++;

        for (i = 0; i < 10; i++)
            for(j = 0; j < 10; j++)
                for (k = 0; k < 10; k++)
                    hap += array[i][j][k];

        System.out.println("1~1000까지의 합계 : " + hap);
    }
}

public class sumoftoaarr {
    public static void main(String[] args){
         int  arr[][] = new int[3][4];

        int  b[][] = { { 1, 2 }, 
                { 2, 3 ,7 , 8 },
                { 3, 4 , 4 , 6 , 7},
                { 4, 5 }
        };

        int sum = 0;

        int ans = 1;

        for(int i = 0 ; i < b.length; i++){
            for(int j = 0 ; j < b[i].length;j++){

                // for add
                sum =sum + b[i][j];

                // for multiply
                ans = ans * b[i][j];

            }
        }
        System.out.println("total sum : "+sum);

        System.out.println("multiplay :"+ans);
    }
    
}

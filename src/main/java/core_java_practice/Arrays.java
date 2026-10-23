package core_java_practice;

public class Arrays {
    public static void main(String args[]){
//        2D array using enhanced for loop
        int nums[][]=new int[4][7];
        for(int i=0; i<4;i++){
            for(int j=0; j<7;j++){
                nums[i][j] = (int)(Math.random() * 10);
            }
        }
        for(int n[]:nums){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("JAGGED ARRAY ");

        int jaggedArray[][] = new int[3][];
        jaggedArray[0]=new int[3];
        jaggedArray[1]=new int[6];
        jaggedArray[2]=new int[1];

        for(int i=0; i< jaggedArray.length; i++){
            for(int j=0; j<jaggedArray[i].length; j++){
                jaggedArray[i][j] = (int)(Math.random()*10);
            }
        }
        for(int n[] : jaggedArray){
            for(int m: n){
                System.out.print(m+" ");
            }
            System.out.println();
        }
    }
}

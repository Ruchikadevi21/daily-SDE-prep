

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
        System.out.println ("JAGGED ARRAY ");

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

        Student s1 = new Student("Ruchika", 1 , 98);
        Student s2 = new Student("Kiran" , 2, 89);
        Student s3 = new Student("Sonia" , 3, 56);
        Student s4 = new Student("Simran", 9, 93);


        Student arr[] = new Student[4];
        arr[0]=s1;
        arr[1]=s2;
        arr[2]=s3;
        arr[3]=s4;

        for(Student stu:arr){
            System.out.println(stu.name+":" + stu.rollNo+":"+stu.marks);
        }
    }

    static class Student{
        String name;
        int rollNo;
        int marks;
        public Student(String name, int rollNo, int marks){
            this.marks=marks;
            this.name = name;
            this.rollNo=rollNo;
        }
    }
}

package tirgul_2_interface;


import java.util.Arrays;

public class Sort {


    public static void main(String[] args) {

        Student s1= new Student(33, "avi");
        Student s2= new Student(73, "gavi");
        Student s3= new Student(63, "didi");
        Student s4= new Student(43, "avili");
        Student[] arr={s1, s2, s3, s4};
        int[] arr2= {2,4,67,7};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }



}

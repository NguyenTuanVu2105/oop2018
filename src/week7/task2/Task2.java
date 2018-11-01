package week7.task2;

import java.io.*;


public class Task2 {
    public static void testNullPointerException() throws NullPointerException{
        String str = null;
        System.out.println(str.length());
    }

    public static void testArrayIndexOutOfBoundsException() throws ArrayIndexOutOfBoundsException{
        int[] arr = new int[10];
        arr[-1] = 0;
    }

    public static void testArithmeticException() throws ArithmeticException{
        int n = 5/0;
    }

    public static void testClassCastException() throws ClassCastException{
        String str = (String) new Object();
    }

    public static void testIOException() throws IOException{
        File file = new File("exception.txt");
        FileReader fr = new FileReader(file);
    }

    public static void testFileNotFoundException() throws FileNotFoundException{
        File file = new File("exception.txt");
        FileReader fr = new FileReader(file);
    }
    public static void main(String[] args) {
        //NullPointerException
        try {
            testNullPointerException();
        }
        catch (NullPointerException e){
            System.out.println("java.lang.NullPointerException");
        }

        //ArrayIndexOutOfBoundsException
        try {
            testArrayIndexOutOfBoundsException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
        }

        //ArithmeticException
        try {
            testArithmeticException();
        }catch (ArithmeticException e){
            System.out.println("java.lang.ArithmeticException");
        }

        //ClassCastException
        try {
            testClassCastException();
        }catch (ClassCastException e){
            System.out.println("java.lang.ClassCastException");
        }

        //IOException
        try {
            testIOException();
        }catch (IOException e){
            System.out.println("java.io.IOException");
        }

        //FileNotFoundException
        try {
            testFileNotFoundException();
        }catch (FileNotFoundException e){
            System.out.println("java.io.FileNotFoundException");
        }
    }
}

package ChapterEleven.CatchingExceptions;

import java.io.IOException;

public class ExceptionMain {
    public static void main(String[] args) throws Exception {
            method1();
            method2();
            method3();
            method4();
            method5();
    }

    public static void method1() {
        try {
            System.out.println("Throwing B");
            throw new ExceptionB();
        }catch (Exception e){
            System.err.println("Catching.. B");
        }
    }

    public static void method2(){
        try{
            System.out.println("Throwing C");
            throw new ExceptionC();
        } catch (Exception e){
            System.err.println("Catching.. C");
        }
    }

    public static void method3() {
        try {
            System.out.println("Throwing A");
            throw new ExceptionA();
        }catch (Exception e){
            System.err.println("Catching.. A");
        }
    }

    public static void method4() {
        try{
            System.out.println("Throwing NP");
            throw new NullPointerException();
        } catch (Exception e){
            System.err.println("Catching.. NP");
        }
    }

    public static void method5() {
        try{
            System.out.println("Throwing IO");
            throw new IOException();
        } catch (Exception e){
            System.err.println("Catching.. IO");
        }
    }
}

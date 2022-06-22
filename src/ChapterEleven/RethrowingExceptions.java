package ChapterEleven;

public class RethrowingExceptions {
    public static void main(String[] args) throws Exception{
        try{
            someMethod();
        }catch (Exception err){
            System.out.println("STACK TRACE:");
            err.printStackTrace();
        }
    }



    public static void someMethod() throws Exception {
        try{
            someMethod2();
        } catch (Exception err){
            throw err;
        }
    }

    public static void someMethod2() throws Exception {
        throw new Exception();
    }
}

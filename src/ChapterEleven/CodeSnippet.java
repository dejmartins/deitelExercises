package ChapterEleven;

public class CodeSnippet {
    public static void main(String[] args) {
        try{
            String name = null;
            System.out.printf("The length of the string is - %d", name.length());
        } catch (RuntimeException e){
            System.out.println("Runtime Exception");
        }
//        catch (NullPointerException e){
//            System.out.println("Null pointer exception");
//        }
    }
}

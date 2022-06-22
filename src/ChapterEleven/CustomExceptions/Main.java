package ChapterEleven.CustomExceptions;

public class Main {
    public static void main(String[] args) throws ValidationException {
        try{
            Phone nokia = new Phone("Nokia", "7635246728983678");
            System.out.printf("Name: %s%nSerial Number: %s", nokia.getName(), nokia.getSerialNumber());
        }catch (ValidationException err){
            System.err.println("Invalid phone details");
        }
    }
}

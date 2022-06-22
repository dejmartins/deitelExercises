package ChapterEleven.CustomExceptions;

public class Phone {

    private final String name;
    private final String serialNumber;
    public Phone(String name, String serialNumber) throws ValidationException {
        if(name == null || name.trim().isEmpty() || serialNumber == null || serialNumber.trim().isEmpty()) {
            throw new ValidationException("Empty value passed in!");
        }
        if(serialNumber.length() != 16){
            throw new ValidationException("Invalid serial number length");
        }

        this.name = name;
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public String getSerialNumber() {
        return serialNumber;
    }
}

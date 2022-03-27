package ChapterSix;

public class Native {
    private static AC ourAc;
    private String name;
    private String age;

    public void setOurAcTemperature(int temperature){
        ourAc.setTemperature(temperature);
    }

    public int getOurAcTemperature(){
        return ourAc.getTemperature();
    }

    public AC getOurAc() {
        return ourAc;
    }

    public void setOurAc(AC ourAc) {
        Native.ourAc = ourAc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}

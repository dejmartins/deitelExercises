package chapterTen;

public interface List<I extends Number> {
    void add(String item);
    void add(int index, String item);
    String get(int index);
    void remove(String item);
    void remove(int index);
    int size();
}

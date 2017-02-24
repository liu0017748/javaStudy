package IOCStudy;

/**
 * Created by liu on 17/1/19.
 */
public enum testEnum {
    enum1(1),
    enum2(2);
    public int value;
    private testEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

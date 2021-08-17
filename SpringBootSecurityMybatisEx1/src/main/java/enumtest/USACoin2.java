package enumtest;

public enum USACoin2 {
    PENNY(1), NICKLE(5), DIME(10), QUARTER(25);

    private int value;

    private USACoin2(int i) {
        System.out.println("USACoin2 : " + i);
        value = i;
    }

    public int getValue() {
        return value;
    }
}

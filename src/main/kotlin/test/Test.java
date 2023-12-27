package test;

public class Test {
    public static void main(String[] args) {
        String[] strs = new String[] { "", "", "" };
        Object[] objs = strs;
        objs[0] = 1;
    }
}

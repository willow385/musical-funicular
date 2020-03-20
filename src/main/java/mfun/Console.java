package mfun;

public class Console {
    public void msg(String message) {
        try {
            System.out.println(message);
        } catch (Exception e) {}
    }
}
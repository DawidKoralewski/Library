package app;

public class LibraryApp {
    public static void main(String[] args) {
        final String appName = "Biblioteka 0.9";
        System.out.println(appName);
        LibraryControl libap = new LibraryControl();
        libap.controlLoop();
    }
}

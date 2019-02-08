package forum.binusonline.ahmadilyas;

public class Methods {
// Constructor method

    Methods() {
        System.out.println("Metode konstruktor dipanggil ketika objek kelasnya dibuat");
    }

    public static void main(String[] args) {
        staticMethod();
        Methods object  = new Methods();
        object.nonStaticMethod();
    }

    // Static method
    static void staticMethod() {
        System.out.println("Static method dapat dipanggil tanpa membuat objek");
    }

    // Non static method
    void nonStaticMethod() {
        System.out.println("Non static method harus dipanggil dengan membuat objek");
    }
}

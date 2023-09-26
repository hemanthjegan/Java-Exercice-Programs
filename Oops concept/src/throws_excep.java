import java.io.IOException;

public class throws_excep {
    void disp() throws IOException {
        throw new IOException("Hi how are you ");

    }
    public static void main(String[] args) throws IOException{
        throws_excep t = new throws_excep();
        t.disp();
    }
}

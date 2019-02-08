package forum.binusonline.ahmadilyas;

import java.io.IOException;

public class CLS {
    public static void main(String... arg) throws IOException, InterruptedException {
        try
        {
            final String os  = System.getProperty("os.name");
            if (os.contains("Windows"))
            {
                Runtime.getRuntime().exec("cls");
            }
            else
            {
                Runtime.getRuntime().exec("clear");
            }
        }
        catch (final Exception e)
        {
            //  Handle any exceptions.
        }
    }
}

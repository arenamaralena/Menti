package ModulFive;

import java.io.*;
import java.nio.charset.Charset;

public class TranslateString {
    public static String readAsString(InputStream inputStream, Charset charset) throws IOException {
        Reader readInputStream = new InputStreamReader(inputStream, charset);
        int meanByte;
        StringWriter writer = new StringWriter();
        while ((meanByte = readInputStream.read()) != -1) {
            writer.append((char) meanByte);
        }
        return writer.toString();
    }
}

package co.ptm.sb340m3;

import lombok.Cleanup;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

@Slf4j
public class LombokTest {

    @SneakyThrows
    public String byteArrayToString(byte[] b) {
        return new String(b, "UTF-8");
    }

    public void readFile() throws IOException {
        @Cleanup
        FileInputStream fileInputStream = new FileInputStream("data.txt");
        @Cleanup
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
        String line;

        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }

    public void testSlf4j(){
        log.info("this is awesome");
    }

//    @Synchronized  //https://youtu.be/4AvlDD-Z3z4?t=2065

}

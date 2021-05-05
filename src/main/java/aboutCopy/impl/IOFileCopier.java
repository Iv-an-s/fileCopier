package aboutCopy.impl;


import aboutCopy.FileCopier;

import java.io.*;

public class IOFileCopier implements FileCopier {

    public void copy (String sourcePath, String destinationPath) {
        try (BufferedInputStream is = new BufferedInputStream(new FileInputStream(new File(sourcePath)));
             BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(new File(destinationPath), true))) {


            int readByte;
            while ((readByte = is.read()) != -1){
                out.write(readByte);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

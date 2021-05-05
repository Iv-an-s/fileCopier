package aboutCopy.impl;

import aboutCopy.FileCopier;

import java.io.*;

public class IOBuffFileCopier implements FileCopier {
    @Override
    public void copy(String sourcePath, String destinationPath) {
        try (InputStream is = new FileInputStream(new File(sourcePath));
            OutputStream out = new FileOutputStream(new File(destinationPath))){

                byte[] buffer = new byte[1024];
                int count = is.read(buffer);

                while (count!=-1) {
                    out.write(buffer, 0, count);
                    out.flush();
                    count = is.read(buffer);
                }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

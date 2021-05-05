package aboutCopy.factory;

import aboutCopy.FileCopier;
import aboutCopy.impl.IOBuffFileCopier;
import aboutCopy.impl.IOFileCopier;
import aboutCopy.impl.NIOFileCopier;

public class Factory {
    public static FileCopier getFileCopier(){
        return new IOBuffFileCopier();
    }
}

package sprint1.tasca5.n1exercici1;

import java.io.File;

public class Directory {
    private String dirPathName;

    public Directory(String dirPathName) {
        this.dirPathName = dirPathName;
    }

    public String getDirPathName() {
        return dirPathName;
    }

    public void setDirPathName(String dirPathName) {
        this.dirPathName = dirPathName;
    }

    public File[] listContentsOfDir(String dirPathName) {
        File dir = new File(dirPathName);
        return dir.listFiles();
    }
}

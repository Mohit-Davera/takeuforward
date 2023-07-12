package innerclass;

import java.io.File;
import java.io.FilenameFilter;

public class OuterClass {

    public String[] getFilesInDir(String dir, final String ext) {
        File file = new File(dir);
        //anonymous inner class implementing FilenameFilter interface
        String[] filesList = file.list(new FilenameFilter() {

            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(ext);
            }

        });
        return filesList;
    }
}

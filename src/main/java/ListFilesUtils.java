/**
 * Created by АленкаиВова on 23.05.2016.
 */

import javafx.scene.shape.Path;

import java.io.File;
import java.util.ArrayList;

public class ListFilesUtils {

    public ArrayList listFileNames = new ArrayList<String>();
    private String DIRECTORY_NAME;

    public ListFilesUtils(String pathToImages) {
        DIRECTORY_NAME = pathToImages;
    }

    public void listFiles() {

        File directory = new File(DIRECTORY_NAME);
        File[] fList = directory.listFiles();

        for (File file : fList) {
            if (file.isFile()) {
                this.listFileNames.add(file.getAbsolutePath());
            }
        }
        String items ="";
        for (int i = 0; i < this.listFileNames.size(); i++) {
            items = items + this.listFileNames.get(i) + " ";
        }

    }


}


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static java.lang.String.valueOf;


public class Main {
    public static void main(String[] args) throws IOException {

        File mainDir = new File("c://games");

        StringBuilder text = new StringBuilder();

        //В папке Games создайте несколько директорий: src, res, savegames, temp.
        File dirSrc = new File(mainDir, "src");
        if (dirSrc.mkdir()) {
            text.append("Каталог " + dirSrc + " создан.\n");
        }
        File dirRes = new File(mainDir, "res");
        if (dirRes.mkdir()) {
            text.append("Каталог " + dirRes + " создан.\n");
        }
        File dirSavegames = new File(mainDir, "savegames");
        if (dirSavegames.mkdir()) {
            text.append("Каталог " + dirSavegames + " создан.\n");
        }
        File dirTemp = new File(mainDir, "temp");
        if (dirTemp.mkdir()) {
            text.append("Каталог " + dirTemp + " создан.\n");
        }

        //В каталоге src создайте две директории: main, test.
        File dirSrcMain = new File(dirSrc, "main");
        if (dirSrcMain.mkdir()) {
            text.append("Каталог " + dirSrcMain + " создан.\n");
        }
        File dirSrcTest = new File(dirSrc, "test");
        if (dirSrcTest.mkdir()) {
            text.append("Каталог " + dirSrcTest + " создан.\n");
        }

        //В подкаталоге main создайте два файла: Main.java, Utils.java.
        File fileMain = new File(dirSrcMain, "Main.java");
        try {
            if (fileMain.createNewFile()) {
                text.append("Файл " + fileMain + " создан.\n");
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
        File fileUtils = new File(dirSrcMain, "Utils.java");
        try {
            if (fileUtils.createNewFile()) {
                text.append("Файл " + fileUtils + " создан.\n");
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        //В каталог res создайте три директории: drawables, vectors, icons.
        File dirResDrawables = new File(dirRes, "drawables");
        if (dirResDrawables.mkdir()) {
            text.append("Каталог " + dirResDrawables + " создан.\n");
        }
        File dirResVectors = new File(dirRes, "vectors");
        if (dirResVectors.mkdir()) {
            text.append("Каталог " + dirResVectors + " создан.\n");
        }
        File dirResIcons = new File(dirRes, "icons");
        if (dirResIcons.mkdir()) {
            text.append("Каталог " + dirResIcons + " создан.\n");
        }

        //В директории temp создайте файл temp.txt.
        File fileTemp = new File(dirTemp, "temp.txt");
        try {
            if (fileTemp.createNewFile()) {
                text.append("Файл " + fileTemp + " создан.\n");
            }
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }

        try (FileWriter log = new FileWriter(fileTemp, false)) {
            log.write(valueOf(text));
            log.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}

package session7;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class FileWriting {

	public static void main(String[] args) throws IOException {
		File f = new File("src/session7/written/writing.txt");
		File f2 = new File("src/session7/written/written.txt");
		if (f2.exists()) {
			System.out.println("File has already been copied");
		} else
			Files.copy(f.toPath(), f2.toPath());
	}
}

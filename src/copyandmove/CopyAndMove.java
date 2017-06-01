package copyandmove;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.io.IOException;

public class CopyAndMove {

	public static void write(byte[] bs, String outPath) {
		System.out.println("Write: ");	
		try {
				RandomAccessFile f = new RandomAccessFile(outPath, "rw");
			f.write(bs);
			f.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Please enter a valid file name.");
		} catch (IOException e) {
			System.out.println("There was an I/O exception.");
		}}
		
	
	public static void main(String[] args) {
		//WRITE!!!
		byte writeOut[] = {1,2,3,4};
		CopyAndMove.write(writeOut, "");
		
		//READ!!!
		System.out.println("Read: ");
		String filePath = "hello.txt";
		byte[] buf = new byte[100];
		byte[] data = null;
		int dataIdx = 0;
		try {
			RandomAccessFile f = new RandomAccessFile(filePath, "r");
			data = new byte[(int) f.length()];
			while (true) {
				int nBytes = f.read(buf);
				if (nBytes == -1) {
				break;
			}
				for (int i = 0; i < nBytes; i++) {
					data[dataIdx] = buf[i];
					dataIdx++;
				}
			}
			f.close();
//			System.out.println(data);
			Charset cs = Charset.forName("UTF-8");
			String s = new String(data, cs);
			System.out.println(s);
		} catch (FileNotFoundException ex) {
			System.out.println("That file cannot be found.");
//		} catch (IOException ex) {
//			System.out.println(ex);
		} catch (Exception ex) {
			System.out.println("Exception.");
		}
	}
	
}



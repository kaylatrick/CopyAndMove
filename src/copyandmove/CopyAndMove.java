package copyandmove;

import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.io.IOException;

public class CopyAndMove {

	public static void write(byte[] bs, String outPath) {
		try {
			RandomAccessFile f = new RandomAccessFile(outPath, "rw");
			f.write(bs);
			f.close();
		} catch (FileNotFoundException ex) {
			System.out.println(ex);
		} catch (IOException ex) {
			System.out.println(ex);
		}
		}
	
	public static void main(String[] args) throws FileNotFoundException {
		byte data[] = {1,2,3,4};
		CopyAndMove.write(data, "out.txt"); }		
		
		//READ!!!
//		String filePath = "hello.txt";
//		byte[] buf = new byte[100];
//		byte[] data = null;
//		int dataIdx = 0;
//		try {
//			RandomAccessFile f = new RandomAccessFile(filePath, "r");
//			data = new byte[(int) f.length()];
//			while (true) {
//				int nBytes = f.read(buf);
//				if (nBytes == -1) {
//				break;
//			}
//				for (int i = 0; i < nBytes; i++) {
//					data[dataIdx] = buf[i];
//					dataIdx++;
//				}
//			}
//			f.close();
////		} catch (FileNotFoundException ex) {
//			
//		} catch (IOException ex) {
//			System.out.println(ex);
//		}
////		System.out.println(data);
//		Charset cs = Charset.forName("UTF-8");
//		String s = new String(data, cs);
//		System.out.println(s);
//	}

}

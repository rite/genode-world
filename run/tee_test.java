import java.io.*;
import java.nio.*;
import java.util.*;


class tee_test
{
	public static void main(String args[]) throws java.io.IOException
	{
		System.err.println("Java app started");
		int bytes_read = 0;

		byte[] buffer = new byte[1024];
		int i = 0;
		// Read till EOF
		do {
				i = System.in.read(buffer);
				if (i > 0) {
					System.out.write(buffer, 0, i);
					bytes_read += i;
					System.err.println("Read " + bytes_read + " bytes");
				}
		} while (i != -1);

		System.out.close();
		System.err.println("Java app exits");
		System.exit(0);
	}
}

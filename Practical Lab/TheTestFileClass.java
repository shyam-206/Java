import java.io.*;

public class TheTestFileClass
{
	public static void main(String args[])
	{
		java.io.File file=new java.io.File("image/us.gif");
		System.out.println("Does file Exists? " + file.exists());
		System.out.println("The file has " + file.length() + " Byts");
		System.out.println("Can it be read? " + file.canRead());
		System.out.println("Can it be written? " + file.canWrite());
		System.out.println("It is Directory? " + file.isDirectory());
		System.out.println("Is it a  File?" + file.isFile());
		System.out.println("Is it Absolute?" + file.isAbsolute());
		System.out.println("Absolute path is" +file.getAbsolutePath());
		System.out.println("Last Modified on"+ new java.util.Date(file.lastModified()));
	}
}
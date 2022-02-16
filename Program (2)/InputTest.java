import java.io.*;
import java.util.*;
//extend FilterInputStream which is abstract decorator for all InputStreams
class LowerCaseInputStream extends FilterInputStream 
{
	public LowerCaseInputStream(InputStream in) 
	{
		super(in);
	}
	public int read() throws IOException 
	{
		int c=super.read();
		return (c==-1?c:Character.toLowerCase((char)c));
	}
	public int read(byte[] b,int offset,int len) throws IOException 
	{
		int result =super.read(b,offset,len);
		for (int i=offset;i<offset+result;i++) 
		{
			b[i]=(byte)Character.toLowerCase((char)b[i]);
		}
		return result;
	}
}


class InputTest
{
	public static void main(String[] args) throws IOException
	{
	int c;
	try 
	{
		//set up the FileInputStream and decorate it,first with a BufferedInputStream and then our 
    	//new LowerCaseInputStream filter
		InputStream in =new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("a.txt")));
		// Read the charater until end of file and print it
		while((c = in.read()) >= 0) 
		{
			System.out.print((char)c);
		}
		
		in.close();
	} 
	catch(IOException e) 
	{
		e.printStackTrace();
	}
	}
}



package igem.control;

import java.net.*;
import java.util.HashMap;
import java.io.*;

public class HTMLGrabTest
{
	/*
	 * Function grab
	 * Will take in a URL address (that we know) 
	 * as shown
	 * Wil return a HashMap,
	 * keys as sequences of codons
	 * and corresponding values stored.
	 */
	public static HashMap<String, String> grab(String orgSite) throws Exception 
	{
		/*put file into constructor below, new URL by request*/
		//URL url = new URL(file);
		
		URL url = new URL(orgSite);
		BufferedReader in = new BufferedReader(
				new InputStreamReader (url.openStream() ) );
		
		String html;
		String full = null;
		
		while ( (html = in.readLine()) != null)
		{
			//System.out.println(html);
			full += html;
		}
		in.close();
		
		//substring starting at indexof('/pre')
		
		if (full == null)
		{
			return null;
		}
		
		int start = full.indexOf("<PRE>");
		int end = full.indexOf("</PRE>");
		String raw = full.substring(start+5, end);	// +5 for the <pre> part
		String portion = raw.trim();		
		String pairs[] = portion.split("\\([^)]*\\)");
		
		HashMap<String, String> list = new HashMap<String, String>();
		for(int i = 0; i < pairs.length; i++)
		{
			String parts[] = pairs[i].split(" ");
			list.put(parts[0], parts[1]);
		}
		
		/*
		 * HashMap 'list' is now a map from sequences
		 * to their correspoding values.
		 */
			
		return list;
	}
}
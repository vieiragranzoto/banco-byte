package br.com.bytebank.banco.test.io;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TesteUnicodeEncoding {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s = "ç";
		
//		System.out.println(s.codePointAt(0));
//		
//		Charset charset = Charset.defaultCharset();
//		System.out.println(charset.displayName());
		
		byte[] bytes = s.getBytes("UTF-8");
		System.out.print(bytes.length+", UTF-8, ");
		String novo = new String(bytes, "UTF-8");
		System.out.println(novo);
		
		bytes = s.getBytes("UTF-16");
		System.out.print(bytes.length+", UTF-16, ");
		novo = new String(bytes, "UTF-16");
		System.out.println(novo);
		
		bytes = s.getBytes(StandardCharsets.US_ASCII);
		System.out.print(bytes.length+", US-ASCII, ");
		novo = new String(bytes, "US-ASCII");
		System.out.println(novo);
	}
}

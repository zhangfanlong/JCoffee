import java.io.*;
import java.lang.*;
import java.util.*;



class c12553787 {

    public static String getHash(String plaintext) {
        String hash = null;
        try {
            String text = plaintext;
            MessageDigest md = null;
            try {
                MyHelperClass MessageDigest = new MyHelperClass();
                md =(MessageDigest)(Object) MessageDigest.getInstance("SHA-256");
                md.update(text.getBytes("UTF-8"));
                byte[] rawBytes =(byte[])(Object) md.digest();
                hash =(String)(Object) (new BASE64Encoder().encode(rawBytes));
            } catch (UncheckedIOException e) {
            }
        } catch (IOException e) {
        }
        return hash;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class BASE64Encoder {

public MyHelperClass encode(byte[] o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

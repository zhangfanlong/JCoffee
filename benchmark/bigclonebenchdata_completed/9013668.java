import java.io.*;
import java.lang.*;
import java.util.*;



class c9013668 {

    public synchronized String encrypt(String plaintext) throws SystemUnavailableException {
        MessageDigest md = null;
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            md =(MessageDigest)(Object) MessageDigest.getInstance("SHA");
        } catch (UncheckedIOException e) {
            throw new SystemUnavailableException(e.getMessage());
        }
        try {
            md.update(plaintext.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            throw new SystemUnavailableException(e.getMessage());
        }
        byte raw[] =(byte[])(Object) md.digest();
        String hash =(String)(Object) (new Base64().encodeAsString(raw));
        return hash;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class SystemUnavailableException extends Exception{
	public SystemUnavailableException(String errorMessage) { super(errorMessage); }
}

class MessageDigest {

public MyHelperClass update(byte[] o0){ return null; }
	public MyHelperClass digest(){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

class Base64 {

public MyHelperClass encodeAsString(byte[] o0){ return null; }}

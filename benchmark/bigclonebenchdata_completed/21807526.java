
import java.io.UncheckedIOException;


class c21807526 {
public static MyHelperClass toHexString(MyHelperClass o0){ return null; }
public static MyHelperClass getBytes(String o0, MyHelperClass o1){ return null; }
//	public MyHelperClass toHexString(MyHelperClass o0){ return null; }
//public MyHelperClass getBytes(String o0, MyHelperClass o1){ return null; }

    public static String calculateHA2(String uri) {
        try {
            MyHelperClass MessageDigest = new MyHelperClass();
            MessageDigest md =(MessageDigest)(Object) MessageDigest.getInstance("MD5");
            MyHelperClass ISO_8859_1 = new MyHelperClass();
            md.update((byte)(Object)getBytes("GET", ISO_8859_1));
            md.update((byte) ':');
//            MyHelperClass ISO_8859_1 = new MyHelperClass();
            md.update((byte)(Object)getBytes(uri, ISO_8859_1));
            return(String)(Object) toHexString(md.digest());
        } catch (UncheckedIOException err) {
            throw new RuntimeException(err);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass getInstance(String o0){ return null; }}

class MessageDigest {

public MyHelperClass digest(){ return null; }
	public MyHelperClass update(byte o0){ return null; }}

class NoSuchAlgorithmException extends Exception{
	public NoSuchAlgorithmException(String errorMessage) { super(errorMessage); }
}

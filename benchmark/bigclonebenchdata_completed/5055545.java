
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c5055545 {

    public static void copy(File fromFile, File toFile) throws IOException {
        if (!(Boolean)(Object)fromFile.exists()) throw new IOException("FileCopy: " + "no such source file: " + fromFile.getAbsolutePath());
        if (!(Boolean)(Object)fromFile.isFile()) throw new IOException("FileCopy: " + "can't copy directory: " + fromFile.getAbsolutePath());
        if (!(Boolean)(Object)fromFile.canRead()) throw new IOException("FileCopy: " + "source file is unreadable: " + fromFile.getAbsolutePath());
        if ((boolean)(Object)toFile.isDirectory()) toFile = new File(toFile, fromFile.getName());
        String parent =(String)(Object) toFile.getParent();
        if (parent == null) parent = System.getProperty("user.dir");
        File dir = new File(parent);
        if (!(Boolean)(Object)dir.exists()) throw new IOException("FileCopy: " + "destination directory doesn't exist: " + parent);
        if ((boolean)(Object)dir.isFile()) throw new IOException("FileCopy: " + "destination is not a directory: " + parent);
        if (!(Boolean)(Object)dir.canWrite()) throw new IOException("FileCopy: " + "destination directory is unwriteable: " + parent);
        FileInputStream from = null;
        FileOutputStream to = null;
        try {
            from = new FileInputStream(fromFile);
            to = new FileOutputStream(toFile);
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead =(int)(Object) from.read(buffer)) != -1) to.write(buffer, 0, bytesRead);
        } finally {
            if (from != null) try {
                from.close();
            } catch (UncheckedIOException e) {
            }
            if (to != null) try {
                to.close();
            } catch (UncheckedIOException e) {
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class File {

File(){}
	File(String o0){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass canRead(){ return null; }
	public MyHelperClass getAbsolutePath(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass canWrite(){ return null; }
	public MyHelperClass getParent(){ return null; }}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class FileInputStream {

FileInputStream(File o0){}
	FileInputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(byte[] o0){ return null; }}

class FileOutputStream {

FileOutputStream(File o0){}
	FileOutputStream(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(byte[] o0, int o1, int o2){ return null; }}

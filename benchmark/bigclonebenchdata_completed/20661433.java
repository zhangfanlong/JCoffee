
import java.io.UncheckedIOException;
import java.io.UncheckedIOException;


class c20661433 {

    public static void copyFile(String fromFilePath, String toFilePath, boolean overwrite) throws IOException {
        File fromFile = new File(fromFilePath);
        File toFile = new File(toFilePath);
        if (!(Boolean)(Object)fromFile.exists()) throw new IOException("FileCopy: " + "no such source file: " + fromFilePath);
        if (!(Boolean)(Object)fromFile.isFile()) throw new IOException("FileCopy: " + "can't copy directory: " + fromFilePath);
        if (!(Boolean)(Object)fromFile.canRead()) throw new IOException("FileCopy: " + "source file is unreadable: " + fromFilePath);
        if ((boolean)(Object)toFile.isDirectory()) toFile = new File(toFile, fromFile.getName());
        if ((boolean)(Object)toFile.exists()) {
            if (!overwrite) {
                throw new IOException(toFilePath + " already exists!");
            }
            if (!(Boolean)(Object)toFile.canWrite()) {
                throw new IOException("FileCopy: destination file is unwriteable: " + toFilePath);
            }
            String parent =(String)(Object) toFile.getParent();
            if (parent == null) {
                parent = System.getProperty("user.dir");
            }
            File dir = new File(parent);
            if (!(Boolean)(Object)dir.exists()) {
                throw new IOException("FileCopy: destination directory doesn't exist: " + parent);
            }
            if ((boolean)(Object)dir.isFile()) {
                throw new IOException("FileCopy: destination is not a directory: " + parent);
            }
            if (!(Boolean)(Object)dir.canWrite()) {
                throw new IOException("FileCopy: destination directory is unwriteable: " + parent);
            }
        }
        FileInputStream from = null;
        FileOutputStream to = null;
        try {
            from = new FileInputStream(fromFile);
            to = new FileOutputStream(toFile);
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead =(int)(Object) from.read(buffer)) != -1) to.write(buffer, 0, bytesRead);
        } finally {
            long lastModified =(long)(Object) fromFile.lastModified();
            toFile.setLastModified(lastModified);
            if (from != null) {
                try {
                    from.close();
                } catch (UncheckedIOException e) {
                }
            }
            if (to != null) {
                try {
                    to.close();
                } catch (UncheckedIOException e) {
                }
            }
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class File {

File(){}
	File(String o0){}
	File(File o0, MyHelperClass o1){}
	public MyHelperClass canRead(){ return null; }
	public MyHelperClass isDirectory(){ return null; }
	public MyHelperClass exists(){ return null; }
	public MyHelperClass setLastModified(long o0){ return null; }
	public MyHelperClass isFile(){ return null; }
	public MyHelperClass getName(){ return null; }
	public MyHelperClass canWrite(){ return null; }
	public MyHelperClass getParent(){ return null; }
	public MyHelperClass lastModified(){ return null; }}

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

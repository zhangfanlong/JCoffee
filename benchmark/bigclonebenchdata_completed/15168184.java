


class c15168184 {
public MyHelperClass getServer(int o0){ return null; }

    public void copyServer(int id) throws Exception {
        MyHelperClass File = new MyHelperClass();
        File in = new File("servers" + File.separatorChar + "server_" + id);
//        MyHelperClass File = new MyHelperClass();
        File serversDir = new File("servers" + File.separatorChar);
        int newNumber =(int)(Object) serversDir.listFiles().length + 1;
        System.out.println("New File Number: " + newNumber);
//        MyHelperClass File = new MyHelperClass();
        File out = new File("servers" + File.separatorChar + "server_" + newNumber);
        FileChannel inChannel =(FileChannel)(Object) (new FileInputStream(in).getChannel());
        FileChannel outChannel =(FileChannel)(Object) (new FileOutputStream(out).getChannel());
        try {
            inChannel.transferTo(0, inChannel.size(), outChannel);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (inChannel != null) inChannel.close();
            if (outChannel != null) outChannel.close();
        }
        getServer(newNumber - 1);
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {
public MyHelperClass length;
	public MyHelperClass separatorChar;
}

class File {

File(String o0){}
	File(){}
	public MyHelperClass listFiles(){ return null; }}

class FileChannel {

public MyHelperClass size(){ return null; }
	public MyHelperClass close(){ return null; }
	public MyHelperClass transferTo(int o0, MyHelperClass o1, FileChannel o2){ return null; }}

class FileInputStream {

FileInputStream(){}
	FileInputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

class FileOutputStream {

FileOutputStream(){}
	FileOutputStream(File o0){}
	public MyHelperClass getChannel(){ return null; }}

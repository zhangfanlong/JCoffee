


class c17477951 {

    public static void copy(String inputFile, String outputFile) throws Exception {
        try {
            FileReader in = new FileReader(inputFile);
            FileWriter out = new FileWriter(outputFile);
            int c;
            while ((c =(int)(Object) in.read()) != -1) out.write(c);
            in.close();
            out.close();
        } catch (Exception e) {
            throw new Exception("Could not copy " + inputFile + " into " + outputFile + " because:\n" + e.getMessage());
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class FileReader {

FileReader(String o0){}
	FileReader(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass read(){ return null; }}

class FileWriter {

FileWriter(String o0){}
	FileWriter(){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass write(int o0){ return null; }}

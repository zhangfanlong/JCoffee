


class c14936644 {
public MyHelperClass getDocumentBase(){ return null; }

    String readArticleFromFile(String urlStr) {
        String docbase = getDocumentBase().toString();
        int pos = docbase.lastIndexOf('/');
        if (pos > -1) {
            docbase = docbase.substring(0, pos + 1);
        } else {
            docbase = "";
        }
        docbase = docbase + urlStr;
        String prog = "";
        try {
            URL url = new URL(docbase);
            BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
            if (in != null) {
                while (true) {
                    try {
                        String mark =(String)(Object) in.readLine();
                        if (mark == null) break;
                        prog = prog + mark + "\n";
                    } catch (Exception e) {
                    }
                }
                in.close();
            }
        } catch (Exception e) {
        }
        return prog;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openStream(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass readLine(){ return null; }
	public MyHelperClass close(){ return null; }}

class InputStreamReader {

InputStreamReader(MyHelperClass o0){}
	InputStreamReader(){}}
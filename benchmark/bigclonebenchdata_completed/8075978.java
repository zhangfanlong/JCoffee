


class c8075978 {
public MyHelperClass tryOpenConnection(String o0){ return null; }

    public String getDataAsString(String url) throws RuntimeException {
        try {
            String responseBody = "";
            URLConnection urlc;
            if (!url.toUpperCase().startsWith("HTTP://") && !url.toUpperCase().startsWith("HTTPS://")) {
                urlc =(URLConnection)(Object) tryOpenConnection(url);
            } else {
                urlc =(URLConnection)(Object) (new URL(url).openConnection());
            }
            urlc.setUseCaches(false);
            urlc.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            urlc.setRequestProperty("User-Agent", "Mozilla/5.0 (X11; U; Linux x86_64; en-GB; rv:1.9.1.9) Gecko/20100414 Iceweasel/3.5.9 (like Firefox/3.5.9)");
            urlc.setRequestProperty("Accept-Encoding", "gzip");
            InputStreamReader re = new InputStreamReader(urlc.getInputStream());
            BufferedReader rd = new BufferedReader(re);
            String line = "";
            while ((line =(String)(Object) rd.readLine()) != null) {
                responseBody += line;
                responseBody += "\n";
                line = null;
            }
            rd.close();
            re.close();
            return responseBody;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class URLConnection {

public MyHelperClass setUseCaches(boolean o0){ return null; }
	public MyHelperClass setRequestProperty(String o0, String o1){ return null; }
	public MyHelperClass getInputStream(){ return null; }}

class URL {

URL(String o0){}
	URL(){}
	public MyHelperClass openConnection(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(MyHelperClass o0){}
	public MyHelperClass close(){ return null; }}

class BufferedReader {

BufferedReader(){}
	BufferedReader(InputStreamReader o0){}
	public MyHelperClass close(){ return null; }
	public MyHelperClass readLine(){ return null; }}

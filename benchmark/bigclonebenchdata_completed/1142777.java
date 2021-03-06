
import java.io.UncheckedIOException;


class c1142777 {

    public LinkedList getQuestion() {
        InputStream is = null;
        String result = "";
        LinkedList question = new LinkedList();
        try {
            HttpClient httpclient =(HttpClient)(Object) new DefaultHttpClient();
            MyHelperClass domain = new MyHelperClass();
            HttpPost httppost = new HttpPost(domain);
            MyHelperClass library = new MyHelperClass();
            httppost.setEntity(new UrlEncodedFormEntity(library));
            HttpResponse response =(HttpResponse)(Object) httpclient.execute(httppost);
            HttpEntity entity =(HttpEntity)(Object) response.getEntity();
            is =(InputStream)(Object) entity.getContent();
        } catch (Exception e) {
            MyHelperClass Log = new MyHelperClass();
            Log.e("log_tag", "Error in http connection " + e.toString());
        }
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(is, "iso-8859-1"), 8);
            StringBuilder sb = new StringBuilder();
            String line = null;
            while ((line =(String)(Object) reader.readLine()) != null) {
                sb.append(line);
            }
            is.close();
            result = sb.toString();
            if (result.equals("null,")) {
                return null;
            }
        } catch (Exception e) {
            MyHelperClass Log = new MyHelperClass();
            Log.e("log_tag", "Error converting result " + e.toString());
        }
        try {
            JSONObject json = new JSONObject(result);
            JSONArray data =(JSONArray)(Object) json.getJSONArray("data");
            JSONObject quest =(JSONObject)(Object) data.getJSONObject(0);
            question.add(new BasicNameValuePair("q", quest.getString("q")));
            question.add(new BasicNameValuePair("a", quest.getString("a")));
            question.add(new BasicNameValuePair("b", quest.getString("b")));
            question.add(new BasicNameValuePair("c", quest.getString("c")));
            question.add(new BasicNameValuePair("d", quest.getString("d")));
            question.add(new BasicNameValuePair("correct", quest.getString("correct")));
            return question;
        } catch (UncheckedIOException e) {
            MyHelperClass Log = new MyHelperClass();
            Log.e("log_tag", "Error parsing data " + e.toString());
        }
        return null;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass e(String o0, String o1){ return null; }}

class LinkedList {

public MyHelperClass add(BasicNameValuePair o0){ return null; }}

class NameValuePair {

}

class InputStream {

public MyHelperClass close(){ return null; }}

class HttpClient {

public MyHelperClass execute(HttpPost o0){ return null; }}

class DefaultHttpClient {

}

class HttpPost {

HttpPost(MyHelperClass o0){}
	HttpPost(){}
	public MyHelperClass setEntity(UrlEncodedFormEntity o0){ return null; }}

class UrlEncodedFormEntity {

UrlEncodedFormEntity(MyHelperClass o0){}
	UrlEncodedFormEntity(){}}

class HttpResponse {

public MyHelperClass getEntity(){ return null; }}

class HttpEntity {

public MyHelperClass getContent(){ return null; }}

class BufferedReader {

BufferedReader(InputStreamReader o0, int o1){}
	BufferedReader(){}
	public MyHelperClass readLine(){ return null; }}

class InputStreamReader {

InputStreamReader(){}
	InputStreamReader(InputStream o0, String o1){}}

class JSONObject {

JSONObject(String o0){}
	JSONObject(){}
	public MyHelperClass getString(String o0){ return null; }
	public MyHelperClass getJSONArray(String o0){ return null; }}

class JSONArray {

public MyHelperClass getJSONObject(int o0){ return null; }}

class BasicNameValuePair {

BasicNameValuePair(){}
	BasicNameValuePair(String o0, MyHelperClass o1){}}

class JSONException extends Exception{
	public JSONException(String errorMessage) { super(errorMessage); }
}

import java.io.*;
import java.lang.*;
import java.util.*;
import java.net.*;
import java.applet.*;
import java.security.*;import java.awt.*;



class c3298867 {
public MyHelperClass NULL;
public MyHelperClass url;

    public APIResponse delete(String id) throws Exception {
        APIResponse response = new APIResponse();
        HttpURLConnection connection =(HttpURLConnection)(Object) NULL; //new HttpURLConnection();
        connection = (HttpURLConnection) new URL(url + "/api/transaction/delete/" + id).openConnection();
//        MyHelperClass connection = new MyHelperClass();
        connection.setRequestMethod("DELETE");
        MyHelperClass TIMEOUT = new MyHelperClass();
        connection.setConnectTimeout((int)(Object)TIMEOUT);
//        MyHelperClass connection = new MyHelperClass();
        connection.connect();
//        MyHelperClass connection = new MyHelperClass();
        if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
            response.setDone(true);
            response.setMessage("Transaction Deleted!");
        } else {
            response.setDone(false);
//            MyHelperClass connection = new MyHelperClass();
            response.setMessage("Delete Transaction Error Code: Http (" + connection.getResponseCode() + ")");
        }
//        MyHelperClass connection = new MyHelperClass();
        connection.disconnect();
        return response;
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass connect(){ return null; }
	public MyHelperClass disconnect(){ return null; }
	public MyHelperClass setRequestMethod(String o0){ return null; }
	public MyHelperClass setConnectTimeout(MyHelperClass o0){ return null; }
	public MyHelperClass getResponseCode(){ return null; }}

class APIResponse {

public MyHelperClass setDone(boolean o0){ return null; }
	public MyHelperClass setMessage(String o0){ return null; }}

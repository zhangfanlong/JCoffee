


class c3024985 {
public MyHelperClass fail(){ return null; }

//    @Test
    public void testCopy_readerToOutputStream_nullIn() throws Exception {
        ByteArrayOutputStream baout = new ByteArrayOutputStream();
        OutputStream out =(OutputStream)(Object) new YellOnFlushAndCloseOutputStreamTest(baout, true, true);
        try {
            MyHelperClass IOUtils = new MyHelperClass();
            IOUtils.copy((Reader) null, out);
            fail();
        } catch (NullPointerException ex) {
        }
    }

}

// Code below this line has been added to remove errors
class MyHelperClass {

public MyHelperClass copy(Reader o0, OutputStream o1){ return null; }}

class Test {

}

class ByteArrayOutputStream {

}

class OutputStream {

}

class YellOnFlushAndCloseOutputStreamTest {

YellOnFlushAndCloseOutputStreamTest(ByteArrayOutputStream o0, boolean o1, boolean o2){}
	YellOnFlushAndCloseOutputStreamTest(){}}

class Reader {

}

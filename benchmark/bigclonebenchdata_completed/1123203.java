


class c1123203 {

        public TextureData newTextureData(GLProfile glp, URL url, int internalFormat, int pixelFormat, boolean mipmap, String fileSuffix) throws IOException {
            InputStream stream =(InputStream)(Object) new BufferedInputStream(url.openStream());
            try {
                return newTextureData(glp,(URL)(Object) stream, internalFormat, pixelFormat, mipmap, fileSuffix);
            } finally {
                stream.close();
            }
        }

}

// Code below this line has been added to remove errors
class MyHelperClass {

}

class GLProfile {

}

class URL {

public MyHelperClass openStream(){ return null; }}

class TextureData {

}

class IOException extends Exception{
	public IOException(String errorMessage) { super(errorMessage); }
}

class InputStream {

public MyHelperClass close(){ return null; }}

class BufferedInputStream {

BufferedInputStream(MyHelperClass o0){}
	BufferedInputStream(){}}

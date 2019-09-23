package com.source.lang;

import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;

public class StringCoding {
    private StringCoding() { }
  /*  private final static ThreadLocal<SoftReference<java.lang.StringCoding.StringDecoder>> decoder =
            new ThreadLocal<>();
    private final static ThreadLocal<SoftReference<java.lang.StringCoding.StringEncoder>> encoder =
            new ThreadLocal<>();*/


    private static class StringDecoder {
        private final java.lang.String requestedCharsetName;
        private final Charset cs;
        private final CharsetDecoder cd;
        private final boolean isTrusted;

        private StringDecoder(Charset cs, java.lang.String rcn) {
            this.requestedCharsetName = rcn;
            this.cs = cs;
            this.cd = cs.newDecoder()
                    .onMalformedInput(CodingErrorAction.REPLACE)
                    .onUnmappableCharacter(CodingErrorAction.REPLACE);
            this.isTrusted = (cs.getClass().getClassLoader() == null);
        }
    }
}

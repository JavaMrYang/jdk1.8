/*
package com.source.lang;

import java.io.ObjectStreamField;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public final class String implements Serializable,Comparable<String>,CharSequence {
    //定义一个char数组，存储String字符串
    private final char value[];

    private int hash;

    private static final long serialVersionUID = -6849794470754667710L;

    private static final ObjectStreamField[] serialPersistentFields=
            new ObjectStreamField[0];

    public String(){
       this.value="".toCharArray();
    }

    public String(String original){
        this.value=original.value;
        this.hash=original.hash;
    }

    public String(char[] value) {
        this.value = Arrays.copyOf(value,value.length);
    }

    public String(char[] value,int offset,int count){
        if (offset < 0) {
            throw new StringIndexOutOfBoundsException(offset);
        }
        if (count <= 0) {
            if (count < 0) {
                throw new StringIndexOutOfBoundsException(count);
            }
            if (offset <= value.length) {
                this.value =value;
                return;
            }
        }
        // Note: offset or count might be near -1>>>1.
        if (offset > value.length - count) {
            throw new StringIndexOutOfBoundsException(offset + count);
        }
        this.value = Arrays.copyOfRange(value, offset, offset+count);
    }

    public String(int[] codePoints, int offset, int count) {
        if (offset < 0) {
            throw new StringIndexOutOfBoundsException(offset);
        }
        if (count <= 0) {
            if (count < 0) {
                throw new StringIndexOutOfBoundsException(count);
            }
            if (offset <= codePoints.length) {
                this.value =value;
                return;
            }
        }
        // Note: offset or count might be near -1>>>1.
        if (offset > codePoints.length - count) {
            throw new StringIndexOutOfBoundsException(offset + count);
        }

        final int end = offset + count;

        // Pass 1: Compute precise size of char[]
        int n = count;
        for (int i = offset; i < end; i++) {
            int c = codePoints[i];
            if (Character.isBmpCodePoint(c))
                continue;
            else if (Character.isValidCodePoint(c))
                n++;
            else throw new IllegalArgumentException(Integer.toString(c));
        }

        // Pass 2: Allocate and fill in char[]
        final char[] v = new char[n];

        for (int i = offset, j = 0; i < end; i++, j++) {
            int c = codePoints[i];
            if (Character.isBmpCodePoint(c))
                v[j] = (char)c;
            else
                Character.toSurrogates(c, v, j++);
        }

        this.value = v;
    }

    public String(byte ascii[],int hibyte,int offset,int count){
        checkBounds(ascii,offset,count);
        char value[]=new char[count];

        if(hibyte==0){
            for(int j=count;j-- >0;){
                value[j]=(char)(ascii[j+offset]&0xff);
            }
        }else{
            hibyte<<=8;
            for (int i = count; i-- > 0;) {
                value[i] = (char)(hibyte | (ascii[i + offset] & 0xff));
            }
        }
        this.value=value;
    }

    @Deprecated
    public String(byte ascii[], int hibyte) {
        this(ascii, hibyte, 0, ascii.length);
    }

    private static void checkBounds(byte[] bytes, int offset, int length){
        if(length<0){
            throw new StringIndexOutOfBoundsException(length);
        }
        if(offset<0){
            throw new StringIndexOutOfBoundsException(offset);
        }
        if(offset>bytes.length-length){
            throw new StringIndexOutOfBoundsException(offset+length);
        }
    }

    public String(byte bytes[], int offset, int length, java.lang.String charsetName)
            throws UnsupportedEncodingException {
        if (charsetName == null)
            throw new NullPointerException("charsetName");
        checkBounds(bytes, offset, length);
        this.value = StringCoding.decode(charsetName, bytes, offset, length);
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }

    @Override
    public int compareTo(String o) {
        return 0;
    }


}
*/

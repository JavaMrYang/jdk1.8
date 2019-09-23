package com.source.io;

import java.io.*;

/**
 * @Author LiuYang
 * @Date 2019/5/31/031  17:56
 * @Version 1.0
 **/
public class Byte_01 {
    public static void main(String[] args) throws IOException {
        InputStream is=null;
        OutputStream os=null;
        StringBuffer buffer=new StringBuffer();
        try {
            File file=new File("test.txt");
            is=new FileInputStream(file);
            String line; // 用来保存每行读取的内容
            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            line = reader.readLine(); // 读取第一行
            while (line != null) { // 如果 line 为空说明读完了
                buffer.append(line); // 将读到的内容添加到 buffer 中
                buffer.append("\n"); // 添加换行符
                line = reader.readLine(); // 读取下一行
            }
            System.out.println(buffer.toString());
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(is!=null){
                is.close();
            }
        }

    }
}

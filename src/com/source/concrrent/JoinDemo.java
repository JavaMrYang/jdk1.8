package com.source.concrrent;

/**
 * @Author LiuYang
 * @Date 2019/12/9/009  18:52
 * @Version 1.0
 **/
public class JoinDemo {
  public static void main(String[] args) {
    System.out.println(intToHex(5199));
    System.out.println(Integer.parseInt("5199",16));

    Thread previousThread = Thread.currentThread();
    for (int i = 1; i <= 10; i++) {
      Thread curThread = new JoinThread(previousThread);
      curThread.start();
      previousThread = curThread;
    }
  }

  private static String intToHex(int n) {
    StringBuffer s = new StringBuffer();
    String a;
    char []b = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
    while(n != 0){
      s = s.append(b[n%16]);
      n = n/16;
    }
    a = s.reverse().toString();
    return a;
  }

  static class JoinThread extends Thread {
    private Thread thread;

    public JoinThread(Thread thread) {
      this.thread = thread;
    }

    @Override
    public void run() {
      try {
        thread.join();
        System.out.println(thread.getName() + " terminated.");
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

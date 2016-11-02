@@ -0,0 +1,20 @@
package com.elsevier.education;

/**

TODO: Turn the "Singleton" class into an actual singleton. The main() method should still call .doSomething().

*/
public class Exercise5 {
	
	public static class Singleton {
// private instace variable uninitialized
	private static Singleton INSTANCE;
	//private constructor to avoid instantiating.
	private Singleton(){};
	
	//static getIntance method to instantiating object 
	  public static Singleton getInstance(){
	     if (INSTANCE == null) {
      synchronized {
        if (INSTANCE == null) 
          INSTANCE = new Singleton();
      }
    }
	  }
		public void doSomeThing() {
			System.out.println("Doing something....");
	    }
	}
		
	public static void main(String a[]){
		Singleton st = Singleton.getInstance();
		st.doSomeThing();
	}
}

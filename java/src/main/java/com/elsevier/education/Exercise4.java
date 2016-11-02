@@ -0,0 +1,27 @@
package com.elsevier.education;

/**

TODO Is Counter thread-safe? If so, why, and if not, how can we fix it?

*/
public class Exercise4 {

	public static class Counter {
		// AtomicInteger which avoids explicit synchronization.
		public AtomicInteger count = new AtomicInteger (0);
		
		public int increment() {
			return ++count;
		}
		
		public int getCount() {
			return count;
		}
		
		public void resetCount() {
			count = 0;
		}

	}
}
\ No newline at end of file

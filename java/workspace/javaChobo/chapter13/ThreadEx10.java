package chapter13;


	public class ThreadEx10 implements Runnable {
		static boolean autoSave = false;
		
		public static void main(String[] args) throws Exception {
		   Thread t = new Thread(new ThreadEx10());
	       t.setDaemon(true);  //start()보다 먼저 실행되어야함 
		   t.start();
		   
		   for(int i =0; i<=10; i++) {
			   try { 
				    Thread.sleep(1000);
				    
			   } catch(InterruptedException e) {}
			   System.out.println(i);
			   
			   if( i == 5)
				   autoSave = true;
		   }
		   System.out.println("프로그램 종료");

		 }
		public void run() {
			while(true)  {
				try {
					Thread.sleep(3*1000);

				} catch(InterruptedException e) {}
				
				if(autoSave) {
					autoSave();
				}
		} 
	}
		public void autoSave() {
			System.out.println("프로그램자동저장");
		}
	}
 

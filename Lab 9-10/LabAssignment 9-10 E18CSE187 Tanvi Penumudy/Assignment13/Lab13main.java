public class Lab13main{
		private String username;
		public String getusername(){
			return username;
		}
		public void setusername(String username){
			this.username=username;
		}
		public void display(){
			System.out.println("to lower case "+username.toLowerCase());
			System.out.println("to upper case "+username.toUpperCase());
			if(username.charAt(0)=='a'){
				System.out.println("username starts with a");
			}
			else{
				System.out.println("username does not start with a");
			}
		}
	
}
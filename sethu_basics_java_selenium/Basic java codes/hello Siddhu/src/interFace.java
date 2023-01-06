interface Print{  
void print();
//void display();
}  
//interface Showable{  
//void show();  
//}  

public class interFace implements Print{
	public void print(){
		int a=20,b=10,c;
		c=a+b;
		System.out.println(c);} 
	
	public void show(){
	
		System.out.println("show works");} 
	
	
	public void display(){
	
		System.out.println("display works");} 

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interFace obj = new interFace(); 
		obj.print();
		obj.show();
		obj.display();

	}

}

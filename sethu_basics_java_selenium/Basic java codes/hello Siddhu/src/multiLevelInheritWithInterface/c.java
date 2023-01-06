package multiLevelInheritWithInterface;

	interface a{
		public void add();
		}
	
	class b implements a{
		int a1=10,b1=20,c1;
		public void add()
		{
			c1=a1+b1;
			System.out.println("Add Value of "+a1+" and "+b1+" is "+c1);
		}
	}
	 class c extends b{
		public void sub()
		{
			c1=b1-a1;
			System.out.println("Sub Value of "+b1+" and "+a1+" is "+c1);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		c obj=new c();
		obj.add();
		obj.sub();
		}
}

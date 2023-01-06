import java.util.ArrayList;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> infoMats = new ArrayList<String>();
		infoMats.add("person1");
		infoMats.add("person2");
		infoMats.add("person3");
		infoMats.add("person4");
		infoMats.add("person5");
		System.out.println(infoMats);
		infoMats.remove(4);
		System.out.println(infoMats);

		infoMats.set(1, "anand");
		System.out.println(infoMats);

		infoMats.remove(1);
		System.out.println(infoMats);
		
//		looping
		
		for(int i=0;i<infoMats.size();i++) {
			System.out.println("output is: "+infoMats.get(i));
		}
// length
		System.out.println(infoMats);


String a [] = {"anand","siddhu","anand","siddhu"};	
System.out.println(a.length);

for(int i1=0;i1<a.length;i1++) {
	System.out.println(a[i1]);
}

	}
}

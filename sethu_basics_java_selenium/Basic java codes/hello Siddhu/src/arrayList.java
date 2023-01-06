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

		infoMats.set(1, "ananad");
		System.out.println(infoMats);

		infoMats.remove(1);
		System.out.println(infoMats);

		System.out.println(infoMats.size());
		System.out.println(infoMats.get(3));
		 for(int info=0;info<infoMats.size();info++){
		 System.out.println(infoMats.get(info));
		 }
		

	}
}

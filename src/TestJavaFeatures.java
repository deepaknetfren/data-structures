import java.util.HashMap;

import java.util.Arrays;

public class TestJavaFeatures {

	public static void main(String[] args) throws Exception {
		int[] nums= {1,2,7,6,1,5};
		Arrays.sort(nums);		
		int len=Arrays.binarySearch(nums, 8);
		System.out.println(len);
		Class cls=Class.forName("com.att.idp.catalog.model.dtvn.package-info");
		Object obj=cls.getMethod("toString");
		double d1=5.1;
		double d2=0.1;
		double sum=d1+d2;
		if(sum==5.2) {
			System.out.println(sum);
		}else {
			System.out.println("incorrect");
		}
HashMap hm=new HashMap();
		
		/*
		
		List<String> list = Stream.of("abc", "defg", "hi").collect(Collectors.toList());
		List<Integer> listInt = list.stream().map((@NotNull String str) -> {
			return str.length();

		}).collect(Collectors.toList());
		System.out.println(listInt);
		LinkedList<Integer>[] lists=new LinkedList[10];
		System.out.println(lists);
		Stack<Integer> stk=new Stack<>();
		stk.firstElement();
		*/
		
	}


}
package com.pci;

public class ComparableTest {

	public static void main(String[] args) {
		String a = new String("abc");
		String b = a;
		a = a+"d";	//新的String实例了
		if ( a == b ) {
			System.out.println("相等");
		}else {
			System.out.println("不相等");
		}
		
		StringBuilder a1  = new StringBuilder("abc");
		StringBuilder b1 = a1;
		a1.append("d");
		if ( a1 == b1 ) {
			System.out.println("相等");
		}else {
			System.out.println("不相等");
		}
		System.out.println(b1);
		
		System.out.println("================");
		String c = "   abcdefabCDefabcdef";
		System.out.println("charAt:" + a.charAt(1));
		System.out.println("compareTo:" + a.compareTo(b));
		System.out.println(a.concat(b));
		System.out.println(a.endsWith("cd"));
		System.out.println(a.equalsIgnoreCase("AbCd"));
		System.out.println("indexOf:" + a.indexOf('b'));
		System.out.println("indexOf:" + c.lastIndexOf('b'));
		System.out.println("length" + a.length());
		System.out.println(a.replace("a", "A"));
		System.out.println(a.startsWith("abc"));
		System.out.println(a.substring(1, 2));
		System.out.println(c.toLowerCase());
		System.out.println(c.toUpperCase());
		System.out.println(c.trim());
		
		Integer int3 = Integer.valueOf("11A", 16);
		System.out.println(int3);
	}

}
	
class Person implements Comparable<Person> {

	private String name;
	private int height;
	
	public Person(String name, int height) {
		this.name = name;
		this.height = height;
	}
	
	public int getHeight() {
		return height;
	}
	
	public String toString() {
		return name + "(" + height + ")";
	}
	
	@Override
	public int compareTo(Person target) {
		if ( height > target.getHeight()) {
			return 1;
		}else if ( height < target.getHeight()) {
			return -1;
		}else {
			return 0;
		}
	}
	
}

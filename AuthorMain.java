package com.oops.demo;

public class AuthorMain {

	public static void main(String[] args) {
		
		Author a1= new Author ("Rabindranath " ,"Tagore");
		Author a2 = new Author("Amrita" ,"Pritan");
				
		System.out.println(a1.getFirstName());
		System.out.println(a1.getLastName());

		System.out.println(a2.toString());
		Author a3 = new Author();
		
		Author a4;
         //System.out.println(a4);
		a4=a2;
		
		System.out.println(a4);
		
	}



}

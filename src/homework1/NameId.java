package homework1;

public class NameId {

	public static void main(String[] args) {

		String name = "Amar Arris";
		String ID = "30399NY";
		
	
		System.out.println(name+" "+ID);
		System.out.println(ID.charAt(0));
		// the function String charAt print the index of String char,
		System.out.println(ID.length());
        // the function String length print the length of the String ID = 7,
		System.out.println(ID.concat(name));
		// the function string concat do the concatenation 
		System.out.println(name.toLowerCase());
		// to Write the String on lower case
		System.out.println(name.toUpperCase());
		// to write the String o Upper case 
		System.out.println(ID.formatted(args));
		// to formate the String
		System.out.println(name.intern());
		// to intern the String
		System.out.println(name.matches(name));
		//to match the String
		System.out.println(name.repeat(2));
		// to repeat the String
	    System.out.println(name.replaceAll(name, ID));
	    // to replace the String
	}


	}



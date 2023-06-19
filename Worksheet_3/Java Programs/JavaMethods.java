package flip_Robo;

public class JavaMethods {
	
	public static void publicMethod() {
		System.out.println("This is a public Method. It can be accessed within as well as outside the package.");
	}
	
	protected void protectedMethod() {
		System.out.println("This is a Protected Method. It can be accessed within the class, subclass, and anyother classes with in the package. outside the package, this method can be accessed by extending the class");
	}
	
	private void privateMethod() {
		System.out.println("This is a Private Method. it can only be accessed from within the class itself");
	}
	
	void packagePrivateMethod() {
		System.out.println("This is a package-Private-method. It can be accessed from within the class and other classes within the same package.");
	}
	
	public static void main(String[] args) {
		
		JavaMethods jm = new JavaMethods();
		
		jm.publicMethod();
		jm.protectedMethod();
		jm.privateMethod();
		jm.packagePrivateMethod();
	}

}

class RuntimeDemo{
	public static void main(String[] args) {
		Student []std = new Student[3];
		std[0]=new Student1();
		std[1]=new Student2();
		std[2]=new Student1();

		for(Student sd : std){
			sd.marks();
			if(sd instanceof Student2)
				((Student2)sd).hallticket();
		}
	}
}
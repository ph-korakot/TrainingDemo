class Hello {
    
    public Hello() {
        System.out.println("Hello! We are:");
        this.Krerk();
		this.Warongkorn();
		this.nuttapongR();
    }
    
    private void Krerk() {
        System.out.println("Trainer - Krerk Piromsopa, Ph.D.");
        System.out.println("Trainee - Krerk Piromsopa, Ph.D. --- ");
    }
    
    public static void main(String [] argv) {
        new Hello();
    }
	
	private void nuttapongR() {
		System.out.println("Trainee - Mr.Nuttapong Ruengratsamesan");
	}

	 private void Warongkorn() {
        System.out.println("Trainer - Krerk Piromsopa, Ph.D.");
        System.out.println("Trainee - Warongkorn Yuwatthana");
    }
}

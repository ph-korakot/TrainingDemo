class Hello {
    
    public Hello() {
        System.out.println("Hello! We are:");
        this.Krerk();
		this.Varunee();
    }
    
    private void Krerk() {
        System.out.println("Trainer - Krerk Piromsopa, Ph.D.");
    }
	
	private void Varunee () {
        System.out.println("Trainer - Varunee Komonsubin, SA");
    }
    
    public static void main(String [] argv) {
        new Hello();
    }
}

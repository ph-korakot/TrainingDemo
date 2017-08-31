class Hello {
    
    public Hello() {
        System.out.println("Hello! We are:");
        this.Krerk();
		this.Kittikun();
    }
    
    private void Krerk() {
        System.out.println("Trainer - Krerk Piromsopa, Ph.D.");
        System.out.println("Trainee - Krerk Piromsopa, Ph.D. --- ");
    }
	
    private void Kittikun() {
        System.out.println("Git exame Kittikun Sienarm");
    }
    
    public static void main(String [] argv) {
        new Hello();
    }
}

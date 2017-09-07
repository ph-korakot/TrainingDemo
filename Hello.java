class Hello {
    
    public Hello() {
        System.out.println("Hello! We are:");
        this.Krerk();
		this.korakot();
    }
    
    private void Krerk() {
        System.out.println("Trainer - Krerk Piromsopa, Ph.D.");
        System.out.println("Trainee - Krerk Piromsopa, Ph.D. --- ");
    }
	
	 private void korakot() {
        System.out.println("Trainer - korakot phokhaw, Ph.D.");
        System.out.println("Trainee - korakot phokhaw, Ph.D. --- ");
    }
    
    public static void main(String [] argv) {
        new Hello();
    }
}

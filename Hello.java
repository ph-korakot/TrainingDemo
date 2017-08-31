class Hello {
    
    public Hello() {
        System.out.println("Hello! We are:");
        this.Krerk();
		this.Nuttadet();
    }
    
    private void Krerk() {
        System.out.println("Trainer - Krerk Piromsopa, Ph.D.");
    }
	
    private void Nuttadet() {
        System.out.println("Trainee - Nuttadet Orasa, Ph.D.");
    }
    
    public static void main(String [] argv) {
        new Hello();
    }
}

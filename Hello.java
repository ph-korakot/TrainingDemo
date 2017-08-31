class Hello {
    
    public Hello() {
        System.out.println("Hello! We are:");
        this.Krerk();
		this.pattanan();
    }
    
    private void Krerk() {
        System.out.println("Trainer - Krerk Piromsopa, Ph.D.");
    }
	
    private void pattanan() {
        System.out.println("Trainer - pattanan Boonsiri");
    }
	
    public static void main(String [] argv) {
        new Hello();
    }
}

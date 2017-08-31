class Hello {
    
    public Hello() {
        System.out.println("Hello! We are:");
        this.Krerk();
		this.Beaphin();
    }
    
    private void Krerk() {
        System.out.println("Trainer - Krerk Piromsopa, Ph.D.");
    }
	
	private void Beaphin() {
        System.out.println("Beaphin Somchai");
    }
    
    public static void main(String [] argv) {
        new Hello();
    }
}

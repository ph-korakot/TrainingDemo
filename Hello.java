class Hello {
    
    public Hello() {
        System.out.println("Hello! We are:");
        this.Krerk();
        this.Sasimaporn();
    }
    
    private void Krerk() {
        System.out.println("Trainer - Krerk Piromsopa, Ph.D.");
    }
   
    private void Sasimaporn() {
        System.out.println("Trainer - Sasimaporn Sillapasit, Ph.D.");
    }
    
    public static void main(String [] argv) {
        new Hello();
    }
}

class Main {
    public static void main(String[] args) {

        FurnitureFactory modernFactory = new ModernFurnitureFactory();


        Chair modernChair = modernFactory.createChair();
        Sofa modernSofa = modernFactory.createSofa();
        CoffeeTable modernCoffeeTable = modernFactory.createCoffeeTable();


        modernChair.sitOn();
        modernSofa.lieOn();
        modernCoffeeTable.putOn();

    }
}
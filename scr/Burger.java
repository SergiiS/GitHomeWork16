public class Burger {
    public String bun;
    public String meat;
    public String cheese;
    public String greens;
    public String mayonnaise;

    public Burger() {
        this.bun = "Звичайна булочка";
        this.meat = "Звичайне м'ясо";
        this.cheese = "Звичайний сир";
        this.greens = "Звичайна зелень";
        this.mayonnaise = "Звичайний майонез";
    }

    public Burger(boolean isDiet) {
        this();
        if (isDiet) {
            this.mayonnaise = "Без майонезу";
        }
    }

    public Burger(int doubleMeat) {
        this();
        if (doubleMeat > 0) {
            this.meat = "Подвійне м'ясо";
        }
    }
    public void printIngredients() {
        System.out.println("Склад бургера:");
        System.out.println("Булочка: " + bun);
        System.out.println("М'ясо: " + meat);
        System.out.println("Сир: " + cheese);
        System.out.println("Зелень: " + greens);
        System.out.println("Майонез: " + mayonnaise);
        System.out.println("");
        System.out.println("");
    }
}
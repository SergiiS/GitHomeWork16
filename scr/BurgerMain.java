public class BurgerMain {
    public static void main(String[] args) {
        System.out.println("Звичайний бургер (усі компоненти)");
        Burger normalBurger = new Burger();
        normalBurger.printIngredients();

        System.out.println("Дієтичний бургер (без майонезу)");
        Burger dietBurger = new Burger(true);
        dietBurger.printIngredients();

        System.out.println("З подвійним м'ясом");
        Burger doubleMeatBurger = new Burger(1);
        doubleMeatBurger.printIngredients();
    }
}
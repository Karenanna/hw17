public class Main {
    public static void main(String[] args) {
        Human maksim = new Human("Максим", 35,"Минск", "бренд-менеджером" );
        Human anya = new Human( "Аня",29,"Москва","методистом образовательных программ" );
        Human katya = new Human("Катя", 28, null, "продакт-менеджером");
        Human artem = new Human("Артем",27,"Москва","директором по развитию бизнеса");


        System.out.println("Привет. Меня зовут " + maksim.name + ". Я из города " + maksim.city + ". Мне " + maksim.age+ "лет" + ". Я работаю  " + maksim.job + ". Будем знакомы!");
        System.out.println("Привет. Меня зовут " + anya.name + ". Я из города " + anya.city + ". Мне " + anya.age+ "лет" + ". Я работаю  " + anya.job + ". Будем знакомы!");
        System.out.println("Привет. Меня зовут " + katya.name + ". Я из города " + katya.city + ". Мне " + katya.age+ "лет" + ". Я работаю  " + katya.job + ". Будем знакомы!");
        System.out.println("Привет. Меня зовут " + artem.name + ". Я из города " + artem.city+ ". Мне "+artem.age + "лет" + ". Я работаю  " + artem.job + ". Будем знакомы!" );
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception{

        Product banan = new Product("Бананы", 100f, 1f);
        Product apple = new Product("Яблоки", 70f, 2f);
        Product raspberry = new Product("Малина", 120f, 0.2f);
        Product apple2 = new Product("Яблоки", 70f, 2f);

        Set<Product> productSet1 = new HashSet<>();
        productSet1.add(banan);
        productSet1.add(apple);
        productSet1.add(raspberry);
        productSet1.add(apple2);
        System.out.println("Коллекция продуктов 1 "+Arrays.toString(productSet1.toArray()));

        Product bread = new Product("Хлеб", 30f, 0.4f);
        Product butter = new Product("Масло сливочное", 180f, 0.2f);
        Product potato = new Product("Картофель", 100f, 2f);

        Set<Product> productSet2 = new HashSet<>();
        productSet2.add(bread);
        productSet2.add(butter);
        productSet2.add(potato);
        System.out.println("Коллекция продуктов 2 "+Arrays.toString(productSet2.toArray()));

        Set<Recipe> recipeSet = new HashSet<>();
        addRecipe(recipeSet,  new Recipe("Рецепт1", productSet1));
        addRecipe(recipeSet, new Recipe("Рецепт2", productSet1 ));
        //addRecipe(recipeSet, new Recipe("Рецепт1", productSet2 ));//будет исключение

        System.out.println("Коллекция рецептов "+Arrays.toString(recipeSet.toArray()));

        System.out.println();

        Set<Integer> randomSet = new HashSet<>();
        Random random = new Random();
        while(randomSet.size() < 20){
            randomSet.add(random.nextInt(1000));
        }
        System.out.println("Множество до удаления нечетных значений "+Arrays.toString(randomSet.toArray()));
        Set<Integer> oddSet = new HashSet<>();//коллекция нечетных чисел
        Iterator<Integer> iterator = randomSet.iterator();
        while(iterator.hasNext()){
            int i = iterator.next();
            if(! (i%2==0)){//нечетное число
                oddSet.add(i);
            }
        }
        randomSet.removeAll(oddSet);
        System.out.println("Множество после удаления нечетных значений "+Arrays.toString(randomSet.toArray()));


        System.out.println();

        Set<Multiplication> multiplicationSet = new HashSet<>();
        while(multiplicationSet.size()<15){
            int n1=2+random.nextInt(8);
            int n2=2+random.nextInt(8);
            multiplicationSet.add(new Multiplication(n1, n2));
        }
        System.out.println("Задания для таблицы умножения: ");
        System.out.println(Arrays.toString(multiplicationSet.toArray()));

        System.out.println();
        System.out.println("Задача о паспортах");

        Passport passport1 = new Passport("123456", "Иванов", "Иван", "Иванович", "01.01.1990");
        Passport passport2 = new Passport("234560", "Денежкин", "Виталий", "Сергеевич", "04.08.1961");
        Passport passport3 = new Passport("654321", "Монеткина", "Анжела", "Денисовна", "04.07.1991");
        //дубль паспорта 1
        Passport passport4 = new Passport("123456", "Сергеев", "Сергей", "Сергеевич", "01.02.1990");


        Map<String, Passport> passportMap = new HashMap<>();
        putPassport(passportMap, passport1);
        putPassport(passportMap, passport2);
        putPassport(passportMap, passport3);
        System.out.println("Карта паспортов до замены");
        System.out.println(Arrays.toString(passportMap.values().toArray()));

        System.out.println();
        //меняем паспорт с номером 123456
        putPassport(passportMap, passport4);
        System.out.println("Карта паспортов после замены");
        System.out.println(Arrays.toString(passportMap.values().toArray()));

        System.out.println();
        //Найдем человека по паспорту
        String numberPassport = "123456";
        Passport passport = passportMap.get(numberPassport);//найдем паспорт по ключу
        System.out.println("Паспорт с номером "+numberPassport+
                " принадлежит "+passport.getSurname()+" "+passport.getName()+" "+passport.getPatronymic()+
                " "+passport.getBirthDate()+" года рождения");

    }


    private static void addRecipe(Set<Recipe> recipeSet, Recipe recipe) throws Exception {
        if(! recipeSet.add(recipe)){
            throw new Exception("Рецепт "+recipe.getNameRecipe()+" уже добавлен");
        }
    }

    private static void putPassport(Map<String, Passport> passportMap, Passport passport){
        passportMap.put(passport.getNumber(), passport);//ключом карты будет номер паспортв
    }
}
//задача о машинах вынесена в файл MainTransport
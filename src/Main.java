// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Animal деген класс тузунуз жана бир метод кошунуз.
        //Анын 3 наследнигин тузунуз.
        //
        //Shark деген класска attack(), Turtle деген класска swim() жана Eagle деген класска fly() методторун тузосуз.
        //Animal тибин колдонуп массив тузунуз жана ал жакка анын наследниктерин кошунуз.
        //instanceOf жана getClass()-ты колдонуп Animal массивиндеги жаныбарлардын оздорунун методдорун
        //чыгарыныз.
        //Ар бир объект учун оз озунчо массив тузуп Animal массивиндеги жаныбарларды болуп оз озунун массивине салыныз.

        Animal[] animals = new Animal[3];
        animals[0] = new Shark();
        animals[1] = new Turtle();
        animals[2] = new Eagle();

        for (Animal animal : animals) {
            if (animal instanceof Shark) {
                ((Shark) animal).makeSound();
            } else if (animal instanceof Turtle) {
                ((Turtle) animal).makeSound();
            } else if (animal instanceof Eagle) {
                ((Eagle) animal).makeSound();
            }

        }

        // Создаем отдельные массивы для каждого типа животных
        Shark[] sharks = new Shark[2];
        Turtle[] turtles = new Turtle[2];
        Eagle[] eagles = new Eagle[1];


        }
    }
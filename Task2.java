public class Task2 {

    public static void main(String[] args) {
        int firstMod, secondMod, thirdMod;
        short first = -100;
        short second = 1;
        short third = 20;

        firstMod = first < 0 ? -first : first;
        secondMod = second < 0 ? -second : second;
        thirdMod = third < 0 ? -third : third;

        if (firstMod < secondMod && firstMod < thirdMod) {
            System.out.println(firstMod);
        } else if (secondMod < firstMod && secondMod < thirdMod) {
            System.out.println(secondMod);
        } else {
            System.out.println(thirdMod);
        }
    }
}

public class Task_01 {
    public static void main(String[] args) {
        int one,two,three,four,five,six,seven,eight;
        int x = 253;
        one = x % 2;
        x = x / 2;
        two = x % 2;
        x = x / 2;
        three = x % 2;
        x = x / 2;
        four = x % 2;
        x = x / 2;
        five = x % 2;
        x = x / 2;
        six = x % 2;
        x = x / 2;
        seven = x % 2;
        x = x / 2;
        eight = x %2;

        System.out.println(eight + ""+ seven +""+ six +""+ five +""+ four +""+ three +""+ two +""+ one);
        System.out.println(Integer.toBinaryString(x));
    }
}

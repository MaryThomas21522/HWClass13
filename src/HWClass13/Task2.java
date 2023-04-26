package HWClass13;

public class Task2 {
    public static void main(String[] args) {


        String sentence = "I'm gonna reverse this sentence";
        String[] sentenceArr = sentence.split(" ");
        for (String s : sentenceArr) {
            StringBuilder sb = new StringBuilder(s);
            System.out.print(sb.reverse() + " ");
        }
    }
}
/*
How would you reverse a String word by word? for example
 // input=>This is sentence i want to reverse
 // output=>sihT si ecnetnes i tnaw ot esrever
 */

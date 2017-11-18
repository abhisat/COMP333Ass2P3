public class Main {
    public static void main(String[] args) {

        Jury_Pool2 k = new Jury_Pool2("/Users/abhisheksatpathy/COMP333/Ass2Part1/jury/jurorGraph0.txt");
        System.out.print(k.juryPool2List.length);
        for (int i = 0; i<k.juryPool2List.length; ++i){
            System.out.println(k.juryPool2List[i]);
        }
    }
}
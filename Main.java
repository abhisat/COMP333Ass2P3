public class Main {
    public static void main(String[] args) {

        Jury_Pool2 k = new Jury_Pool2("/Users/abhisheksatpathy/COMP333/Ass2Part2/Graphs/jurorGraph8.txt");
        System.out.println("Jury Pool Size: " + k.juryPool2Size);
        System.out.print("Jury Pool List: ");
        for (int i = 0; i<k.juryPool2List.length; ++i){
            System.out.print(k.juryPool2List[i] + ", ");
        }
    }
}
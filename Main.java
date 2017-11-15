public class Main {
    public static void main(String[] args) {

        Jury_Pool2 k = new Jury_Pool2("/Users/abhisheksatpathy/COMP333/Ass2Part1/jury/jurorGraph2.txt");
        JuryGraph m = new JuryGraph("/Users/abhisheksatpathy/COMP333/Ass2Part1/jury/jurorGraph2.txt");
        for(Candidate x : m.candidate_List){
            System.out.println(x.adj_List.size());
        }
        for (int i = 0; i<k.juryPool2Size; ++i){
            System.out.println(k.juryPool2List[i]);
        }
    }
}
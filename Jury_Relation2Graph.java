

import java.util.ArrayList;
import java.util.HashMap;

/*This class relates to the second relationship in the assignment.
 * You have to create a new graph from original direct relation graph. 
 * The graph size will be the same as the original direct relation graph. The degree 
 * of a vertex is the number of edges incident on it. It is the same as the length of 
 * the adjacency list. So you have to compute the adjacency list of each vertex. The field candidate_List2
 * will contain the vertices (Candidates) and their respective adjacency list. 
 */
public class Jury_Relation2Graph {
	int graphSize = 0;
	ArrayList<Candidate> candidate_List2;
	int[] degreeArr;
	/*This variable gives the degree of each vertex in the graph. 
	 * The constructor takes the original graph as input and constructs the new
	 * graph. The two graphs have the same size. 
	 */
	public Jury_Relation2Graph(String s) {
		JuryGraph jG1 = new JuryGraph(s);
		graphSize = jG1.graph_Size;
		candidate_List2 = makeRelation2Graph(jG1);
		degreeArr = computeDegrees(candidate_List2);
	}
	ArrayList<Candidate> makeRelation2Graph(JuryGraph jG){
		ArrayList<Candidate> canList2 = new ArrayList<>();
		HashMap<Candidate, ArrayList<Candidate>> temp = new HashMap<>();

		for(Candidate a : jG.candidate_List){
			temp.put(a, makeCopy(a.adj_List) );
		}

		/*HashMap<Candidate, ArrayList<Candidate>> temp = new HashMap<>();
		for(Candidate z : makeCopy(jG.candidate_List)){
			temp.put(z, makeCopy(z.adj_List));
			/*for(Candidate m: z.adj_List){
				System.out.print(m.id+ ",");
			}
			System.out.println("List");*/
		/*}
		/*for (Candidate x : makeCopy(jG.candidate_List)){
			canList2.add(x);
			for(Candidate y : makeCopy(x.adj_List)){
				ArrayList<Candidate> tmp = new ArrayList<>();
				for(Candidate z : y.adj_List){
					if(!temp.get(x).contains(z)){
						tmp.add(z);
					}
				}
				/*for (Candidate a : tmp){
					System.out.print(a.id+",");
				}*/
				/*System.out.println("List");
				temp.get(x).addAll(tmp);
			}
		}
		for(Candidate a : temp.keySet()){
			for(Candidate x : jG.candidate_List){
				x.adj_List.addAll(temp.get(a));
			}
		}
		for(Candidate a : jG.candidate_List){
			ArrayList<Candidate> tmp = new ArrayList<>();
			for (Candidate x : a.adj_List){
				if(!tmp.contains(x)){
					tmp.add(x);
				}

			}
			a.adj_List.clear();
			a.adj_List.addAll(tmp);
		}*/



		for(Candidate x : makeCopy(jG.candidate_List)){
			for(Candidate y : makeCopy(x.adj_List)){
				for (Candidate z : y.adj_List){
					if(!x.adj_List.contains(z) && z != x)
						temp.get(x).add(z);
				}
			}
		}

		for(Candidate x : jG.candidate_List){
			x.adj_List.addAll(temp.get(x));
			System.out.print(x.id +":");
			for (Candidate y : x.adj_List){

				System.out.print(y.id +",");
			}
			System.out.println("List");
		}
		/*
		 * Your code goes here. The input is graph representing direct relations among 
		 * candidates. You have to make new adjacency lists for each vertex reflecting 2-relations.
		 */
		return canList2;
	}
	ArrayList<Candidate> makeCopy(ArrayList<Candidate> original){
		ArrayList<Candidate> copy = new ArrayList<>();
		for (Candidate x : original){
			copy.add(x);
		}
		return copy;
	}

	int[]  computeDegrees(ArrayList<Candidate> cList2) {
		int[] degAr = new int[graphSize];
		for(int i = 0; i < cList2.size()-1; i++) {
			degAr[i] = cList2.get(i).adj_List.size();
		}
		/*for (Candidate m : cList2) {
			System.out.print(m.id+":");
			for (Candidate n : m.adj_List) {

				System.out.print(n.id + ",");
			}
			System.out.println("list");
		}
		/*
		 * Your code goes here. It is quite straightforward to compute array 
		 * entries from the adjacency list of vertices. Use the "size()" function of 
		 * ArrayList class. 
		 */
		return degAr;
	}

}

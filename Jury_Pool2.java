/*
 * The structure of this class is similar to the Jury_Pool1 class. There are two crucial differences. 
 * You have to use a new graph reflecting 2-relationship. 
 * You have to compute 3 fields. The first field easy it is simply the original graph size.
 * The second field is the size of the pool of potential jurors and the third field is a list of juror 
 * id's satisfying the condition that there is no 2-relations between any two. These fields are exactly 
 * like the corresponding fields in Jury_Pool1. The names are slightly modified. 
 */

import java.util.ArrayList;

public class Jury_Pool2 {
	int initialSize = 0;
	int juryPool2Size = 0;
	int[] juryPool2List;
	
	public Jury_Pool2(String s) {
		Jury_Relation2Graph candidateRelation = new Jury_Relation2Graph(s);
		
		/*
		 The string 's' represents the path to the input file. This part 
		 has been implemented.
		 */
		
		initialSize = candidateRelation.graphSize;
		juryPool2Size = calcPool2size(candidateRelation);
		juryPool2List = calcPool2List(candidateRelation);
	}
	
	int calcPool2size(Jury_Relation2Graph jG) {
		int poolSize = 0;
		
		/*Your code goes here. 
		The variable poolSize is given as a suggestion. You are free to change it if you wish.
		Of course you have to return some variable of integer type. It has been initialized to 0.  
		Note: 0 is not an acceptable value for the jury pool size. 
		You can write any other classes and methods 
		to help you calculate. 
		*/
		return poolSize;
	}
	int[] calcPool2List(Jury_Relation2Graph jG) {
		int[] poolList = new int[juryPool2Size];
		ArrayList<Candidate> pool = new ArrayList<>();
		ArrayList<Candidate> rejectedPool = new ArrayList<>();
		for (Candidate x : jG.candidate_List2){
			if(!rejectedPool.contains(x)){
				pool.add(x);
				rejectedPool.addAll(x.adj_List);
			}
		}
		/*Your code goes here. 
		 * We have an integer array poolList. To create this array you will have to calculate 
		 * juryPoolSize first. You can change it. But make sure the function returns an array 
		 * of integers that represents an acceptable jury pool. 
		 * It is suggested that you create some classes and methods of your own and call them here. This 
		 * method and the one preceding can be considered 'wrapper' methods. 
		 */
		for(int i = 0; i < pool.size()-1; i++){
			poolList[0] = pool.get(i).id;
		}
		return poolList;
	}

	
}

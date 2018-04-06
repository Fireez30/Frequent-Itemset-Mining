package tp1;

import java.util.ArrayList;

public class apriori {

	public ArrayList<Item> apriorigen(ArrayList<Item> s){
		ArrayList<Item> result = null;
		ArrayList<Item> P = new ArrayList<Item>();
		for (int i = 0; i < s.size(); i++)
			for (int j = 1; j < s.size();j++){
				Item Itmp = new Item(s.get(i).getName()+s.get(j).getName(),0);
				if (!P.contains(Itmp))
					P.add(Itmp);
			}
		
		for (Item i : P){
			
		}
		
		return result;
	}
	
	public ArrayList<ArrayList<Item>> apriori(int theta,ArrayList<Transactions> trans){
		ArrayList<Item> L = new ArrayList<Item> ();
		ArrayList<ArrayList<Item>> Lk = new ArrayList<ArrayList<Item>>();
		
		for (int i = 0; i < trans.size(); i++){//Calcul de L1 (ensemble des Items singletons des transactions)
			for (int j = 0; j < trans.get(i).sizeTransaction(); j++){
				if (!L.contains(trans.get(i).getElement(j)))
					L.add(trans.get(i).getElement(j));
			}
		}
		
		Lk.add(1,L);
		
		int k = 2;
		while (!L.isEmpty()){
			ArrayList<Item> Ck = apriorigen(L);
			for(Transactions t : trans){
				
			}
		}
		
		return Lk;
	}
	
	public static void main(String[] args) {
		ArrayList<Transactions> database;

	}

}

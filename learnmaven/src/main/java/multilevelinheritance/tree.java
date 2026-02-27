package multilevelinheritance;

public class tree extends hub{

	public  void tree_size() {
			// TODO Auto-generated method stub
			System.out.println("forest have multiple hubs and trees");
		}

	public static void main(String args[]){
		tree tr = new tree();
		tr.forest_size();
	    tr.hub_size();
	    tr.tree_size();
	}

}

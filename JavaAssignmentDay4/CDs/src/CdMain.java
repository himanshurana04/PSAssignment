//import java.util.HashMap;
import java.util.TreeSet;

import com.cd.bean.CD;
import com.cd.bean.SortAsPerTitle;
import com.cd.bean.SortAsPerSinger;

import java.util.Iterator;
import java.util.Set;
public class CdMain {

	public static void main(String[] args) {
		Set<CD> collection=new TreeSet<CD>(new SortAsPerTitle());
		collection.add(new CD("not afraid","eminem"));
		collection.add(new CD("Lose yourself","eminem"));
		collection.add(new CD("kitni haseen zindagi","lucky ali"));
		collection.add(new CD("jai ho","AR rahman"));
		collection.add(new CD("venom","eminem"));
		collection.add(new CD("ryuk","andrew"));
		System.out.println(collection);
		Set<CD> collection2=new TreeSet<CD>(new SortAsPerSinger());
		collection2.add(new CD("not afraid","eminem"));
		collection2.add(new CD("Lose yourself","eminem"));
		collection2.add(new CD("kitni haseen zindagi","lucky ali"));
		collection2.add(new CD("jai ho","AR rahman"));
		collection2.add(new CD("venom","eminem"));
		collection2.add(new CD("ryuk","andrew"));
		//System.out.println(collection2);
		Iterator<CD> iterator=collection2.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}

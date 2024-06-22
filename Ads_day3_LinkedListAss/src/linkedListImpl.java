
public class linkedListImpl implements MyLinkedList{
	
	private static int[] linkedListArray; //pnode element nnode
	private static int previousNode;
	private static int nextNode;
	
	public linkedListImpl(int size) {
		linkedListArray = new int[size];
		previousNode = -1;
	}
	@Override
	public void add(int element) {
		if(previousNode == -1) {
			System.out.println("");
		}
	}
	
	
}

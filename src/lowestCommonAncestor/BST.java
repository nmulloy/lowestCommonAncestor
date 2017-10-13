package lowestCommonAncestor;

public class BST {
	private static BSTNode root;
	
	public static void put(String key, Object value)
	{
		if (root == null)
		{
			root = new BSTNode (key, value);
		}
		else{
			root.put(key,value);
		}
	}
	
	public static Object get(String key)
	{
		return root == null ? null : root.get(key);
	}
	
}



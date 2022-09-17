package Lec38;

import java.util.ArrayList;
import java.util.List;

public class Right_View {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		int depth = -1;

		public List<Integer> rightSideView(TreeNode root) {
			List<Integer> list = new ArrayList<>();
			TreeView(root, 0, list);
			return list;

		}

		public void TreeView(TreeNode root, int currlev, List<Integer> list) {
			if(root==null){
			    return ;
			}
				
			if (currlev > depth) {
				// System.out.print(root.val + " ");
				list.add(root.val);
				depth = currlev;

			}

			TreeView(root.right, currlev + 1, list);
			TreeView(root.left, currlev + 1, list);

		}
	}
}

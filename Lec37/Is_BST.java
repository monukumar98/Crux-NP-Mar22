package Lec37;

public class Is_BST {

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
		public boolean isValidBST(TreeNode root) {
			return ISBST(root).isbst;
		}

		public class BSTPair {
			long max = Long.MIN_VALUE;
			long min = Long.MAX_VALUE;
			boolean isbst = true;
		}

		public BSTPair ISBST(TreeNode root) {
			if (root == null) {
				return new BSTPair();
			}
			BSTPair lbst = ISBST(root.left);
			BSTPair rbst = ISBST(root.right);
			BSTPair sbst = new BSTPair();
			if (lbst.isbst && rbst.isbst && lbst.max < root.val && rbst.min > root.val) {
				sbst.isbst = true;
				sbst.min = Math.min(lbst.min, root.val);
				sbst.max = Math.max(rbst.max, root.val);
				return sbst;
			}
			sbst.isbst = false;
			sbst.min = Math.min(lbst.min, Math.min(rbst.min, root.val));
			sbst.max = Math.max(rbst.max, Math.min(lbst.max, root.val));
			return sbst;
		}
	}

}

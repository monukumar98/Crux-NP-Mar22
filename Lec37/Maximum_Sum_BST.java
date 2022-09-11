package Lec37;



public class Maximum_Sum_BST {
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
		public int maxSumBST(TreeNode root) {
			return ISBST(root).ans;

		}

		public class BSTPair {
			long max = Long.MIN_VALUE;
			long min = Long.MAX_VALUE;
			boolean isbst = true;
			int sum = 0;// tree sum
			int ans = 0;// bst wala sum
		}

		public BSTPair ISBST(TreeNode root) {
			if (root == null) {
				return new BSTPair();
			}
			BSTPair lbst = ISBST(root.left);
			BSTPair rbst = ISBST(root.right);
			BSTPair sbst = new BSTPair();
			sbst.sum = lbst.sum + rbst.sum + root.val;
			if (lbst.isbst && rbst.isbst && lbst.max < root.val && rbst.min > root.val) {
				sbst.isbst = true;
				sbst.min = Math.min(lbst.min, root.val);
				sbst.max = Math.max(rbst.max, root.val);
				sbst.ans = Math.max(sbst.sum, Math.max(lbst.ans, rbst.ans));
				return sbst;
			}
			sbst.isbst = false;
			sbst.min = Math.min(lbst.min, Math.min(rbst.min, root.val));
			sbst.max = Math.max(rbst.max, Math.min(lbst.max, root.val));
			sbst.ans = Math.max(lbst.ans, rbst.ans);
			return sbst;
		}
	}
}

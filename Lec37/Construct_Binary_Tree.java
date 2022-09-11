package Lec37;

public class Construct_Binary_Tree {
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
		public TreeNode buildTree(int[] preorder, int[] inorder) {
			return CreateTree(preorder, inorder, 0, inorder.length - 1, 0, preorder.length - 1);
		}

		public TreeNode CreateTree(int[] pre, int[] in, int ilo, int ihi, int plo, int phi) {
			if (plo > phi || ilo > ihi) {
				return null;
			}
			TreeNode nn = new TreeNode(pre[plo]);
			int i = serach(in, ilo, ihi, pre[plo]);
			int net = i - ilo;
			nn.left = CreateTree(pre, in, ilo, i - 1, plo + 1, plo + net);
			nn.right = CreateTree(pre, in, i + 1, ihi, plo + net + 1, phi);
			return nn;
		}

		public int serach(int[] in, int ilo, int ihi, int item) {
			for (int i = ilo; i <= ihi; i++) {
				if (in[i] == item) {
					return i;
				}

			}
			return 0;
		}

	}

}

package Lec36;


//https://leetcode.com/problems/sum-root-to-leaf-numbers/
public class Root_to_Leaf_Numbers {
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
		public int sumNumbers(TreeNode root) {
			return FormNumber(root, 0);
		}

		public int FormNumber(TreeNode root, int curr) {
			if (root == null) {
				return curr;
			}

			if (root.left == null && root.right == null) {
				return curr * 10 + root.val;
			}
			int left = FormNumber(root.left, curr * 10 + root.val);
			int right = FormNumber(root.right, curr * 10 + root.val);

			return left + right;
		}
	}
}

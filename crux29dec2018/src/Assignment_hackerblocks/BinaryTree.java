package Assignment_hackerblocks;

import java.util.Scanner;

public class BinaryTree {
			private class Node {
				int data;
				Node left;
				Node right;
			}

			private Node root;
			private int size;

//			public BinaryTree(int[] post, int[] in) {
//				this.root = this.construct(post, 0, post.length - 1, in, 0, in.length - 1);
//			}
//
//			private Node construct(int[] post, int plo, int phi, int[] in, int ilo, int ihi) {
//
//				// write your code here
//			}
			public  BinaryTree(int[] post, int[] in) {
				int plo = 0;
				int phi = post.length - 1;
				int ilo = 0;
				int ihi = in.length - 1;
			 
			this.root=BinaryTree(post, plo, phi, in, ilo, ihi);
			}
			 
			private  Node  BinaryTree(int[] post, int plo, int phi, int[] in, int ilo, int ihi) {
				
					if ( ilo > ihi)
						return null;
				 
					//int rootValue = postorder[postEnd];
					Node root = new Node();
				 root.data=in[ihi];
					int k = 0;
					for (int i = plo; i <=phi; i++) {
						if (in[ihi]==post[i]) {
							k = i;
							break;
						}
					}
				 int nel=k-plo;
					root.left = BinaryTree(post, plo, k - 1, in, ilo,
							(ilo + nel)-1);
					// Becuase k is not the length, it it need to -(inStart+1) to get the length
					root.right = BinaryTree(post, k + 1, phi, in, ilo + nel, ihi - 1);
					// postStart+k-inStart = postStart+k-(inStart+1) +1
				 
					return root;

				
			}

			
			public void display() {
				this.display(this.root);
			}

			private void display(Node node) {
				if (node == null) {
					return;
				}

				String str = "";

				if (node.left != null) {
					str += node.left.data;
				} else {
					str += "END";
				}

				str += " => " + node.data + " <= ";

				if (node.right != null) {
					str += node.right.data;
				} else {
					str += "END";
				}

				System.out.println(str);

				this.display(node.left);
				this.display(node.right);
			}
		static 	Scanner scn = new Scanner(System.in);
			public static void main(String[] args) {
				//Main m = new Main();
				int[] post = takeInput();
				int[] in = takeInput();
				BinaryTree bt = new BinaryTree(in,post);
				bt.display();
			}
			

			public static int[] takeInput() {
				int n = scn.nextInt();

				int[] rv = new int[n];
			for (int i = 0; i < rv.length; i++) {
				rv[i] = scn.nextInt();
				}

			return rv;
		}

		}

	




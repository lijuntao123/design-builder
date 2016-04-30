package com.eastsoft.design.composite;

/**
 * Tree
 * @author ljt
 * @date 2015年5月5日 下午8:20:49
 */
public class Tree {

	private String name;
	TreeNode root;
	public Tree(String name) {
		super();
		this.name = name;
	}
	
	public static void main(String[] args) {
		Tree tree=new Tree("myTree");
		
		TreeNode node1=new TreeNode("node1");
		TreeNode node2=new TreeNode("node2");
		node1.add(node2);
		tree.root.add(node1);
		
	}
}

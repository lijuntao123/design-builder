package com.eastsoft.design.composite;

import java.util.Enumeration;
import java.util.Vector;

/**
 * TreeNode
 * @author ljt
 * @date 2015年5月5日 下午8:05:33
 */
public class TreeNode {

	private String name;
	private TreeNode parentTreeNode;
	
	private Vector<TreeNode> child=new Vector<TreeNode>();

	public TreeNode(String name) {
		super();
		this.name = name;
	}

	public TreeNode getParentTreeNode() {
		return parentTreeNode;
	}

	public void setParentTreeNode(TreeNode parentTreeNode) {
		this.parentTreeNode = parentTreeNode;
	}
	
	public void add(TreeNode node){
		child.add(node);
	}
	public void remove(TreeNode node){
		child.remove(node);
	}

	public Enumeration<TreeNode> getChild() {
		return child.elements();
	}
	
	
}

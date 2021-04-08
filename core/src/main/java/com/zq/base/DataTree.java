package com.zq.base;



import java.util.List;

/**
 * @author zhaoqi
 * @since 2020-11-14
 */

public class DataTree {

    private String treeName;

    private TreeNode rootNode;

    public DataTree() {
    }

    public DataTree(String treeName, TreeNode rootNode) {
        this.treeName = treeName;
        this.rootNode = rootNode;
    }

    public String getTreeName() {
        return treeName;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }

    public TreeNode getRootNode() {
        return rootNode;
    }

    public void setRootNode(TreeNode rootNode) {
        this.rootNode = rootNode;
    }

    public static class TreeNode extends Object {


        private List<TreeNode> children;

        public TreeNode() {
        }

        public TreeNode(List<TreeNode> children) {
            this.children = children;
        }

        public List<TreeNode> getChildren() {
            return children;
        }

        public void setChildren(List<TreeNode> children) {
            this.children = children;
        }
    }
}

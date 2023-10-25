import javax.swing.*;
import java.awt.*;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class BinaryTreeVisualizer extends JPanel {
    private TreeNode root;

    public BinaryTreeVisualizer(TreeNode root) {
        this.root = root;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawTree(g, getWidth() / 2, 30, root);
    }

    private void drawTree(Graphics g, int x, int y, TreeNode node) {
        if (node != null) {
            g.drawOval(x - 20, y - 20, 40, 40);
            g.drawString(String.valueOf(node.data), x - 5, y + 5);

            if (node.left != null) {
                int xLeft = x - (getWidth() / (int) Math.pow(2, getHeight(node))) + 10;
                int yLeft = y + 60;
                g.drawLine(x, y + 20, xLeft, yLeft - 20);
                drawTree(g, xLeft, yLeft, node.left);
            }

            if (node.right != null) {
                int xRight = x + (getWidth() / (int) Math.pow(2, getHeight(node))) - 10;
                int yRight = y + 60;
                g.drawLine(x, y + 20, xRight, yRight - 20);
                drawTree(g, xRight, yRight, node.right);
            }
        }
    }

    private int getHeight(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
}

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        JFrame frame = new JFrame("Binary Tree Visualizer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.add(new BinaryTreeVisualizer(root));
        frame.setVisible(true);
    }
}

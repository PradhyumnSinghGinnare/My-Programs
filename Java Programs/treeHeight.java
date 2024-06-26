import java.util.*;

public class treeHeight {
    static class Node{
        int data;
        Node left, right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        return Math.max(lh, rh) + 1;
    }

    public static int count(Node root){
        if(root == null){
            return 0;
        }

        int lh = count(root.left);
        int rh = count(root.right);
        return lh + rh + 1;
    }

    public static int sum(Node root){
        if(root == null){
            return 0;
        }

        int lh = sum(root.left);
        int rh = sum(root.right);
        return lh + rh + root.data;
    }

    public static int diameter(Node root){
        if(root == null){
            return 0;
        }

        int ldiam = diameter(root.left);
        int rdiam = diameter(root.right);
        int lh = height(root.left);
        int rh = height(root.right);
        int selfdiam =  lh + rh + 1;
        return Math.max(selfdiam, Math.max(ldiam, rdiam));
    }

    //Subtree
    public static boolean isIdentical(Node node, Node subroot){
        if(node == null && subroot == null){
            return true;
        } else if(node == null || subroot == null || node.data != subroot.data){
            return false;
        }

        if(!isIdentical(node.left, subroot.left)){
            return false;
        }
        if(!isIdentical(node.right, subroot.right)){
            return false;
        }
        return true;
    }
    public static boolean isSubtree(Node root, Node subroot){
        if(root == null){
            return false;
        }
        if(root.data == subroot.data){
            if(isIdentical(root, subroot)){
                return true;
            }
        }
        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }

    static class Info{
        Node node;
        int hd;

        public Info(Node node, int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root){
        //Level Order
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();

        int min = 0, max = 0;
        q.add(new Info(root, 0));
        q.add(null);

        while(!q.isEmpty()){
            Info curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                } else {
                    q.add(null);
                }
            } else {
                if(!map.containsKey(curr.hd)){
                map.put(curr.hd, curr.node);
            }
            if(curr.node.left != null){
                q.add(new Info(curr.node.left, curr.hd-1));
                min = Math.min(min, curr.hd-1);
            }
            if(curr.node.right != null){
                q.add(new Info(curr.node.right, curr.hd+1));
                max = Math.max(min, curr.hd+1);
            }
            } 
        }

        for(int i=min; i<=max; i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
    }

    //Kth level of tree
    public static void kLevel(Node root, int level, int k){
        if(root == null){
            return;
        }

        if(level == k){
            System.out.print(root.data+" ");
            return;
        }

        kLevel(root.left, level+1, k);
        kLevel(root.right, level+1, k);
    }

    public static void main(String[] args) {
        /*
               1
              / \
             2   3
            / \ / \
           4  5 6  7
         */
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        /* 2
          / \
         4   5 
        */
        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);

        System.out.println("Height: " + height(root));
        System.out.println("Count: " + count(root));
        System.out.println("Sum: " + sum(root));
        System.out.println("Diameter: " + diameter(root));
        System.out.println("isSubtree: " + isSubtree(root, subroot));
        topView(root);

        //Kth level of tree
        int k = 2;
        kLevel(root, 1, k);
    }
}

public class BST {
    TreeNode root;

    public BST(){
        root = null;
    }

    public BST(TreeNode node){
        root = node;
    }


    public TreeNode Add(int val){
        TreeNode newNode = new TreeNode(val);
        if (root == null){
            root = newNode;
            return root;
        }

        TreeNode p = null;
        TreeNode n = root;

        while (n != null){
            if (n.val < val){
                p = n;
                n = n.right;
            }
            else{
                p = n;
                n = n.left;
            }
        }

        if (p.val < val){
            p.right = newNode;
        }
        else{
            p.left = newNode;
        }
        return root;
    }

    public void PrintInOrder(){
        InOrder(root);
    }

    public void InOrder(TreeNode node){
        if (node == null){
            return;
        }
        InOrder(node.left);
        System.out.print(" " + node.val + " ");
        InOrder(node.right);
    }


    public void A(TreeNode node)
    {
        if (node == null)
            return;

        A(node.left);

        A(node.right);

        System.out.print(node.val+ " ");
    }

    public void B(TreeNode node)
    {
        if (node == null)
            return;

        System.out.print(node.val + " ");

        B(node.left);

        B(node.right);
    }
    public boolean C(TreeNode node){
        if (node == null)
            return true;

        if (node.left != null && node.left.val > node.val)
            return false;

        if (node.right != null && node.right.val < node.val)
            return false;

        if (!C(node.left) || !C(node.right))
            return false;

        return true;
    }


    // Bu metod ikili arama agacinin elemanalarini preorder sirada ekrana yazdirir.

    public void PrintPreOrder(){

        B(root);
    }



    // Bu metod ikili arama agacinin elemanalarini postorder sirada ekrana yazdirir.
    // Bu metodu yazabilmek icin sinif icinde yardimci bir metod tanimi yapabilirsiniz.
    // Ornegin PrintInOder metodunun yazimi icin InOrder yardimci metodu yazilmistir.
    public void PrintPostOrder(){

        A(root);
    }


    // Bu metod bu objenin ikili arama agaci ozelligi tasiyip tasimadigini kontrol eder.
    // Bu objedenin temsil ettigi ikili agac; ikili arama agaci ise bu metod true
    // aksi durumda false degerinin dondurur.

    public boolean IsBST(){

        return C(root);
    }

}
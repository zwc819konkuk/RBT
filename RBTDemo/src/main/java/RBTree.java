/**
 * 红黑树：
 *  添加数据
 *  删除数据
 *  遍历查询数据
 *  要么为空，要么肯定有一个Root节点
 */
public class RBTree {

    //定义红黑常量
    private static final boolean RED = false;
    private static final boolean BLACK = true;
    //根节点
    private RBNode root;

    public RBNode getRoot() {
        return root;
    }

    public void setRoot(RBNode root) {
        this.root = root;
    }

    /**
     * 红黑树节点
     */
    static class RBNode<K extends Comparable<K>,V>{

        private RBNode parent;//当前节点的父节点
        private RBNode left;//当前节点的左子节点
        private RBNode right;//当前节点的右子节点

        //当前节点的颜色
        private boolean color;

        private K key;
        private V value;

        public RBNode() {
        }

        public RBNode(RBNode parent, RBNode left, RBNode right, boolean color, K key, V value) {
            this.parent = parent;
            this.left = left;
            this.right = right;
            this.color = color;
            this.key = key;
            this.value = value;
        }

        public RBNode getParent() {
            return parent;
        }

        public void setParent(RBNode parent) {
            this.parent = parent;
        }

        public RBNode getLeft() {
            return left;
        }

        public void setLeft(RBNode left) {
            this.left = left;
        }

        public RBNode getRight() {
            return right;
        }

        public void setRight(RBNode right) {
            this.right = right;
        }

        public boolean isColor() {
            return color;
        }

        public void setColor(boolean color) {
            this.color = color;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    //1. 旋转和变色
    //1.1 左旋

    /**
     *    p           pr[r]
     *   / \            / \
     * pl pr[r]  -->   p  rr
     *     / \         / \
     *    rl rr      pl  rl
     * p-pl,pr[r]-rr两条线不变
     * pr[r]-rl 需要改变p-rl
     */
    public void leftRotate(RBNode p){//传入旋转点

    }
    //1.2 右旋
    public void rightRotate(RBNode p){//传入旋转点

    }
    //2. 添加数据【a 普通的二叉树插入 b 红黑平衡】
    //3. 删除数据
    //4. 遍历数据
}

package offer32;

import java.util.*;

/**
 * @author ：ZXF
 * @program: 2021_5_2
 * @description:
 * @date ：2021-05-03 11:43
 */

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class Solution {
    public int[] levelOrder1(TreeNode root) {
        if (root == null) {
            return new int[0];
        }

        LinkedList<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> list = new ArrayList<>();

        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node.val);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }


    public List<List<Integer>> levelOrder2(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();

            int count = queue.size();
            for (int i = 0; i < count; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            res.add(list);
        }
        return res;
    }

    public List<List<Integer>> levelOrder3(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        // 判空
        if (root == null) {
            return res;
        }
        // 层序遍历辅助队列
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);
        // 打印顺序标志，初始值表示从左开始
        boolean isLeft = true;
        // 遍历二叉树
        while (!deque.isEmpty()) {
            // 单独一层的结果
            List<Integer> ans = new ArrayList<>();
            // 得到此时队列中结点的个数，即当前层的结点数
            int count = deque.size();
            // 遍历队列中的结点，并将下一层的结点入队
            for (int i = 0; i < count; i++) {
                // 队列中的元素始终按照每一层的结点的相对位置顺序存储，只是在遍历分别从头结点开始或者从尾结点开始
                if (isLeft) {
                    // 从头结点开始，并把新结点添加到尾部
                    TreeNode dequeHead = deque.peekFirst();
                    ans.add(dequeHead.val);
                    // 先左后右
                    if (dequeHead.left != null) {
                        deque.addLast(dequeHead.left);
                    }
                    if (dequeHead.right != null) {
                        deque.addLast(dequeHead.right);
                    }
                    // 删除首元素
                    deque.removeFirst();
                }else {
                    // 从尾结点开始，并且将新结点添加到首部
                    TreeNode dequeHead = deque.peekLast();
                    ans.add(dequeHead.val);
                    // 先右后左
                    if (dequeHead.right != null) {
                        deque.addFirst(dequeHead.right);
                    }
                    if (dequeHead.left != null) {
                        deque.addFirst(dequeHead.left);
                    }
                    // 删除尾元素
                    deque.removeLast();
                }
            }
            // 将单层结果添加到结果集合中
            res.add(ans);
            // 顺序取反
            isLeft = !isLeft;
        }
        return res;
    }
}

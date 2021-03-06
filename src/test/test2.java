package test;

import offer.TreeNode;
import offer.o13;
import offer.o53;
import offer.o57;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class test2 {
    public static void main(String[] args) {
        int [] nums = new int[]{1,2,3,4};
        int length = nums.length;
        int[] left = new int[length];
        int[] right = new int[length];
        int [] result = new int[length];

        for (int i = 0; i < length; i++) {
            int index = 0;
            left[i] = 1;
            while (index<i){
                left[i] *= left[index];
                index++;
            }
            System.out.println(left[i]);
        }



    }


    public static void maxK(TreeNode head, int k) {
        int[] loc = new int[] {0};
        TreeNode re = fromHead(head, loc, k);
        if(re!=null) {
            System.out.printf("%dth :%d\n",k,re.val);
        }else {
            System.out.println("no such k!");
        }
    }

    public static TreeNode fromHead(TreeNode head,int[] loc,int k) {
        if(head!=null) {
            // 左子树
            TreeNode temp = fromHead(head.left, loc, k);
            if(temp!=null) {
                return temp;
            }

            // 中间节点
            loc[0]++;
            System.out.printf("%d %d \n", head.val,loc[0]);
            if(loc[0]==k) {
                return head;
            }

            // 右子树
            temp = fromHead(head.right, loc, k);
            if(temp!=null) {
                return temp;
            }
        }

        return null;
    }

    public static TreeNode getTree() {
        TreeNode node5 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3);
        TreeNode node7 = new TreeNode(7);
        TreeNode node2 = new TreeNode(2);
        TreeNode node4 = new TreeNode(4);
        TreeNode node6 = new TreeNode(6);
        TreeNode node8 = new TreeNode(8);

        node5.left = node3;
        node5.right = node7;
        node3.left = node2;
        node3.right = node4;
        node7.left = node6;
        node7.right = node8;

        return node5;
    }

}

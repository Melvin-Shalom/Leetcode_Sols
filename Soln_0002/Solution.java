package Leetcode_Sols.Soln_0002;

class Solution {
    public ks addTwoNumbers(ks l1, ks l2) {
        ks dummy = new ks(0);
        ks curr = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry > 0){
            if (l1 != null){
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2!= null){
                carry += l2.val;
                l2 = l2.next;
            }
            curr.next = new ks(carry % 10);
            carry /= 10;
            curr = curr.next;
        }

        return dummy.next;
    }
}


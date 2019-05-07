- Topic24：https://leetcode-cn.com/problems/swap-nodes-in-pairs/

给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换

思路：
题中给出了不能交换值，所以交换节点，类似翻转链表中节点指针交换操作，但用一个flag标志标示cur前一个节点
> flag->cur->pre->node=>
> flag->pre->cur->node=>
> pre->flag->cur（flag再次指向cur，cur指向cur.next即node）
```java
while(cur!=null&&cur.next!=null) {
	ListNode pre = cur.next;
	cur.next = pre.next;
	pre.next = cur;
	flag.next = pre;
	flag = cur;
	cur = cur.next;
}
```
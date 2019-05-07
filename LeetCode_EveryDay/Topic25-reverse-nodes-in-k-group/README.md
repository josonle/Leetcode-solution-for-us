链接：[Topic25](https://leetcode.com/problems/reverse-nodes-in-k-group/)

题目：

Given a linked list, reverse the nodes of a linked list *k* at a time and return its modified list.

*k* is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of *k* then left-out nodes in the end should remain as it is.

给你一个链表，以K为步长，倒置该链表，然后返回修改后的链表。

K是一个小于或等于链表总长的正整数，如果链表长度不是K的整数倍，结尾返回原序列。

思路：

> from josonlee：
> 我思路是用count标志每k个节点内翻转链表，会用一个flag标志指示上一段链表最后一个点。剩余不足k时，先翻转后判断，成立的话把不足部分再翻一次
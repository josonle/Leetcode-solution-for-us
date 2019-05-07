* Topic27：https://leetcode-cn.com/problems/merge-k-sorted-lists/
合并k个排序列表

思路：
- 堆排序，建立含n个元素的最小堆，每次取出堆顶并将堆顶的next放入堆比较下一轮。时间复杂度O(klogn)，k是链表中节点总个数，n是堆的大小
- 在两两排序链表合并的继承上展开的，归并思想。时间复杂度O(nklogk)，k是链表个数，假设每个链表都有n个节点。合并第一次要合并k/2次，每次遍历2n个节点，第二次是合并k/4次，每次遍历4n个节点，所以合并一次要遍历kn个点，循环logk次，所以总的时间复杂度O(nklogk)